package negocios;

import classesBasicas.Treinador;
import dados.RepositorioTreinador;

public class CadastroTreinador {

	private  RepositorioTreinador repositorio;

	public CadastroTreinador() {

		this.repositorio = new RepositorioTreinador(100);

	}

	public  void cadastrar(Treinador t) {

		if (t != null && !repositorio.existe(t.getCpf())) {

		this.repositorio.cadastrar(t);

		} else {

		}

	}

	public Treinador procurar(long cpf ) {

		return this.repositorio.procurar(cpf);

	}

	public boolean existe(long cpf) {

		return this.repositorio.existe(cpf);

	}

	public void remover(long cpf) {

		Treinador t  = this.repositorio.procurar(cpf);

		if (t != null) {

			this.repositorio.remover(cpf);

		} else {

		}

	}

}
