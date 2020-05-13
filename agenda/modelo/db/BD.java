package db;

import java.util.List;
import classes.*;

public abstract class BD {

	protected abstract List<Pessoa> buscar(Pessoa p);
	protected abstract void adicionar(Pessoa nova);
	protected abstract void remover(Pessoa velha);
	protected void atualizar(Pessoa nova) {
		remover(nova);
		adicionar(nova);
	}

}
