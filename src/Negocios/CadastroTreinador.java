package negocios;

import classesBasicas.Treinador;
import dados.RepositorioTreinador;

public class CadastroTreinador {

	private static RepositorioTreinador repositorio;

	public CadastroTreinador() {

		this.repositorio = new RepositorioTreinador(100);

	}

	public static void cadastrar(Treinador t) {

		if (t != null && !repositorio.existe(t.getNome())) {

		repositorio.cadastrar(t);

		} else {

		}

	}

	public static Treinador procurar(String nome) {

		return repositorio.procurar(nome);

	}

	public boolean existe(String nome) {

		return repositorio.existe(nome);

	}

	public static void remover(String nome) {

		Treinador t  = repositorio.procurar(nome);

		if (t != null) {

			repositorio.remover(nome);

		} else {

		}

	}

}
