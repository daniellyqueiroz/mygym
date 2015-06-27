package negocios;

import java.util.InputMismatchException;

import classesBasicas.Cliente;
import dados.RepositorioCliente;
import excecoes.CpfJaExisteException;
import excecoes.IdadeInvalidaException;
import excecoes.TreinadorNãoExisteException;

public class CadastroCliente {

	private  RepositorioCliente repositorio;
	

	public CadastroCliente() {

		repositorio = new RepositorioCliente(100);

	}

	public  void cadastrar(Cliente c) /*throws CpfJaExisteException, IdadeInvalidaException, InputMismatchException, TreinadorNãoExisteException*/{
		
		if (c != null && !repositorio.existe(c.getCpf())) {

			this.repositorio.cadastrar(c);

		} else {
		/*
			throw new CpfJaExisteException(c.getCpf());
			throw new IdadeInvalidaException(c.getIdade());
			throw new InputMismatchException();
			throw new TreinadorNãoExisteException(c.getCpf());
			*/
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
