package entities;

import java.util.List;
import java.util.UUID;

public class Funcionario extends Pessoa {
	
	private String matricula;
	private String cpf;
	private String cargo;
	private List<Dependente> dependentes;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(UUID id, String nome, String matricula, String cpf, String cargo) {
		super(id, nome);
		this.matricula = matricula;
		this.cpf = cpf;
		this.cargo = cargo;
	}
	

	public Funcionario(UUID id, String nome, String matricula, String cpf, String cargo, List<Dependente> dependentes) {
		super(id, nome);
		this.matricula = matricula;
		this.cpf = cpf;
		this.cargo = cargo;
		this.dependentes = dependentes;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	

	public List<Dependente> getDependentes() {
		return dependentes;
	}

	public void setDependentes(List<Dependente> dependentes) {
		this.dependentes = dependentes;
	}

	@Override
	public String toString() {
		return "Funcionario [matricula=" + matricula + ", cpf=" + cpf + ", cargo=" + cargo + "]";
	}
	
	
	

}
