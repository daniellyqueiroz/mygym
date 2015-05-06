package negocios;

import classesBasicas.Cliente;
import dados.RepositorioClientes;

public class CadastroCliente {

	private static RepositorioClientes repositorio;
	

	public CadastroCliente() {

		repositorio = new RepositorioClientes(100);

	}

	public static void cadastrar(Cliente c) {

		if (c != null && !repositorio.existe(c.getCpf())) {

			repositorio.cadastrar(c);

		} else {

		}

	}

	public static Cliente procurar(Long cpf) {

		return repositorio.procurar(cpf);

	}

	public boolean existe(Long cpf) {

		return repositorio.existe(cpf);

	}

	public static void remover(Long cpf) {

		Cliente c = repositorio.procurar(cpf);

		if (c != null) {

			repositorio.remover(cpf);

		} else {

		}

	}

}
