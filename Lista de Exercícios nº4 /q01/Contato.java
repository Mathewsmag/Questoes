package br.com.somosicev.classes.lista04.q01;

public class Contato {

	private String nome;
	private String telefone;
	private String endereco;

	public Contato() {
		this("novo contato", "1234-1234", "rua dos anzóis,123");
	}

	public Contato(final String nome) {
		this(nome, "  ", "  ");
	}

	public Contato(final String nome, final String telefone, final String endereco) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public String getNome()Ï {
		return nome;
	}

	public void setNome(final String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(final String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(final String endereco) {
		this.endereco = endereco;
	}

}
