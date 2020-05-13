package classes;

public class PessoaFisica extends Pessoa {

	private CPF cpf;
	
	@Override
	Documento getDocumento() {
		return this.cpf;
	}

	@Override
	public void setDocumento(final Documento documento) {
		this.cpf = (CPF) documento;
	}

}
