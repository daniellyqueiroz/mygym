package dados;

import classesBasicas.Cliente;

public class RepositorioCliente {

	private Cliente[] clientes;
	private int proxima;

	public RepositorioCliente(int tamanho) {

		this.clientes = new Cliente[tamanho];
		this.proxima = 0;
	}

	private int procurarIndice(Long cpf) {

		int i = 0;

		boolean achou = false;

		while ((!achou) && (i < this.proxima)) {

			if (cpf.equals(this.clientes[i].getCpf())) {

				achou = true;

			} else {

				i = i + 1;

			}

		}

		return i;

	}

	private void duplicaArrayCliente() {

		if (this.clientes != null && this.clientes.length > 0) {

			Cliente[] arrayDuplicado = new Cliente[this.clientes.length * 2];

			for (int i = 0; i < this.clientes.length; i++) {

				arrayDuplicado[i] = this.clientes[i];

			}

			this.clientes = arrayDuplicado;

		}

	}

	public void cadastrar(Cliente c) {

		this.clientes[this.proxima] = c;

		this.proxima = this.proxima + 1;

		if (this.proxima == this.clientes.length) {

			this.duplicaArrayCliente();

		}

	}

	public boolean existe(long cpf) {

		boolean existe = false;

		int indice = this.procurarIndice(cpf);

		if (indice != proxima) {

			existe = true;

		}

		return existe;

	}

	public Cliente procurar(long cpf) {

		int i = this.procurarIndice(cpf);

		Cliente resultado = null;

		if (i != this.proxima) {

			resultado = this.clientes[i];

		}

		return resultado;

	}

	public void remover(Long cpf) {

		int i = this.procurarIndice(cpf);

		if (i != this.proxima) {

			this.clientes[i] = this.clientes[this.proxima - 1];

			this.clientes[this.proxima - 1] = null;

			this.proxima = this.proxima - 1;

		} else {

		}
	}
	
	public Cliente[] exibirCliente(){
		return this.clientes;
	}
}