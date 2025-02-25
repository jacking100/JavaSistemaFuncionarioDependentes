package controllers;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

import entities.Dependente;
import entities.Funcionario;
import repositories.FuncionarioRepositoryImpl;

public class FuncionarioController {
	
	public void cadastrarFuncionario() {
		 
		try {
			
			var scanner = new Scanner(System.in);
			
			var funcionario = new Funcionario();
			
			funcionario.setDependentes(new ArrayList<Dependente>());
			
			funcionario.setId(UUID.randomUUID());
			
			System.out.print("Nome do funcionário.........: ");
			funcionario.setNome(scanner.nextLine());
			
			System.out.print("Cpf.................: ");
			funcionario.setCpf(scanner.nextLine());
			
			System.out.print("Matrícula.........: ");
			funcionario.setMatricula(scanner.nextLine());
			
			System.out.print("Cargo.........: ");
			funcionario.setCargo(scanner.nextLine());
			
			System.out.print("Qtd de dependentes..........");
			var qtdDependentes = Integer.parseInt(scanner.nextLine());
			
			for(var i = 0; i < qtdDependentes; i++) {
				
				var dependente = new Dependente();
				dependente.setId(UUID.randomUUID());
				
				System.out.print("Nome do dependente.......: ");
				dependente.setNome(scanner.nextLine());
				
				System.out.print("Parentesco...............:");
				dependente.setParentesco(scanner.nextLine());
				
				funcionario.getDependentes().add(dependente);
			}
			
			var funcionarioRepository = new FuncionarioRepositoryImpl();
			
			funcionarioRepository.inserir(funcionario);
			
			System.out.println("\nDados gravados com sucesso!");
			
			scanner.close();
			
		}
		catch(Exception e) {
			System.out.println("\nFALHA AO CADASTRAR FUNCIONÁRIO:");
			System.out.println(e.getMessage());
		}
	}

}
