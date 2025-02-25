package repositories;

import entities.Funcionario;
import factories.ConnectionFactory;
import interfaces.FuncionarioRepository;

public class FuncionarioRepositoryImpl implements FuncionarioRepository {

	public void inserir(Funcionario funcionario) throws Exception {

		var connectionFactory = new ConnectionFactory();
		var connection = connectionFactory.getConnection();

		var statement = connection
				.prepareStatement("insert into funcionario(id, nome, cpf, matricula, cargo) values(?,?,?,?,?)");

		statement.setString(1, funcionario.getId().toString());
		statement.setString(2, funcionario.getNome());
		statement.setString(3, funcionario.getCpf());
		statement.setString(4, funcionario.getMatricula());
		statement.setString(5, funcionario.getCargo());
		statement.execute();

		for (var dependente : funcionario.getDependentes()) {

			statement = connection
					.prepareStatement("insert into dependente(id, nome, parentesco, funcionario_id) values(?,?,?,?)");

			statement.setString(1, dependente.getId().toString());
			statement.setString(2, dependente.getNome());
			statement.setString(3, dependente.getParentesco());
			statement.setString(4, funcionario.getId().toString());
			statement.execute();

		}
		
		connection.close();

	}

}
