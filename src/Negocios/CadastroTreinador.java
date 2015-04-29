package Negocios;

import ClassesBasicas.Treinador;
import Dados.RepositorioTreinador;

public class CadastroTreinador {

	private RepositorioTreinador repositorio;

	public CadastroTreinador() {

		this.repositorio = new RepositorioTreinador(100);

	}

	public void cadastrar(Treinador t) {

		if (t != null && !repositorio.existe(t.getNome())) {

			this.repositorio.cadastrar(t);

		} else {

		}

	}

	public Treinador procurar(String nome) {

		return this.repositorio.procurar(nome);

	}

	public boolean existe(String nome) {

		return this.repositorio.existe(nome);

	}

	public void remover(String nome) {

		Treinador t  = this.repositorio.procurar(nome);

		if (t != null) {

			this.repositorio.remover(nome);

		} else {

		}

	}

}
