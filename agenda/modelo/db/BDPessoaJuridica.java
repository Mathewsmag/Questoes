package db;

import java.util.List;
import java.util.Map;

import classes.*;

public class BDPessoaJuridica extends BD{
	
	private Map<PessoaFisica, List<PessoaJuridica>> cadastrosPJ;

	@Override
	protected List<Pessoa> buscar(Pessoa p) {
		return null;
	}

	@Override
	protected void adicionar(Pessoa nova) {
		
	}

	@Override
	protected void remover(Pessoa velha) {
		
	}
	

}
