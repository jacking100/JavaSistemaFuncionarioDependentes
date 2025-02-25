package entities;

import java.util.UUID;

public class Dependente extends Pessoa {
	
	private String parentesco;
	private Funcionario funcionario;
	
	public Dependente() {
		// TODO Auto-generated constructor stub
	}

	public Dependente(UUID id, String nome, String parentesco) {
		super(id, nome);
		this.parentesco = parentesco;
	}
	

	public Dependente(UUID id, String nome, String parentesco, Funcionario funcionario) {
		super(id, nome);
		this.parentesco = parentesco;
		this.funcionario = funcionario;
	}

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}
	

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public String toString() {
		return "Dependente [parentesco=" + parentesco + "]";
	}

	
}
