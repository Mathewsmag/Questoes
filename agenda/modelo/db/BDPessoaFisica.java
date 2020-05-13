package db;

import java.util.List;
import java.util.Map;

import classes.*;

public class BDPessoaFisica extends BD {
	
	private Map<String, List<Pessoa>> contatos;

	@Override
	protected List<Pessoa> buscar(final Pessoa p) {
		return null;
	}

	@Override
	protected void adicionar(final Pessoa nova) {

	}

	@Override
	protected void remover(final Pessoa velha) {

	}

}
