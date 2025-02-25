package entities;

import java.util.UUID;

public abstract class Pessoa {
	
	private UUID id;
	private String nome;
	
	 public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Pessoa(UUID id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + "]";
	}
	 
	 
	 
	 

}
