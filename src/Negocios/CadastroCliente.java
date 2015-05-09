package negocios;

import classesBasicas.Cliente;
import dados.RepositorioCliente;

public class CadastroCliente {

	private  RepositorioCliente repositorio;
	

	public CadastroCliente() {

		repositorio = new RepositorioCliente(100);

	}

	public  void cadastrar(Cliente c) {

		if (c != null && !repositorio.existe(c.getCpf())) {

			this.repositorio.cadastrar(c);

		} else {

		}

	}

	public  Cliente procurar(Long cpf) {

		return this.repositorio.procurar(cpf);

	}

	public boolean existe(Long cpf) {

		return this.repositorio.existe(cpf);

	}

	public  void remover(Long cpf) {

		Cliente c = this.repositorio.procurar(cpf);

		if (c != null) {

			this.repositorio.remover(cpf);

		} else {

		}

	}
	
	public Cliente[] exibir(){
		return repositorio.exibirCliente();
	}
	

}
