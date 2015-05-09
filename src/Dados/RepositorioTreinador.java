package dados;

import classesBasicas.Treinador;

public class RepositorioTreinador {

	private Treinador[] treinador;
	private int proxima;

	public RepositorioTreinador(int tamanho) {

		this.treinador = new Treinador[tamanho];
		this.proxima = 0;
	}

	private int procurarIndice(long cpf ) {

		int i = 0;

		boolean achou = false;

		while ((!achou) && (i < this.proxima)) {

			if (cpf==(this.treinador[i].getCpf())){

				achou = true;

			} else {

				i = i + 1;

			}

		}

		return i;

	}

	private void duplicaArrayTreinador() {

		if (this.treinador != null && this.treinador.length > 0) {

			Treinador[] arrayDuplicado = new Treinador[this.treinador.length * 2];

			for (int i = 0; i < this.treinador.length; i++) {

				arrayDuplicado[i] = this.treinador[i];

			}

			this.treinador = arrayDuplicado;

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

	public void cadastrar(Treinador t) {

		this.treinador[this.proxima] = t;

		this.proxima = this.proxima + 1;

		if (this.proxima == this.treinador.length) {

			this.duplicaArrayTreinador();

		}

	}

	public Treinador procurar(long cpf ) {

		int i = this.procurarIndice(cpf);

		Treinador resultado = null;

		if (i != this.proxima) {

			resultado = this.treinador[i];

		}

		return resultado;

	}

	public void remover(long cpf){

		int i = this.procurarIndice(cpf);

		if (i != this.proxima) {

			this.treinador[i] = this.treinador[this.proxima - 1];

			this.treinador[this.proxima - 1] = null;

			this.proxima = this.proxima - 1;

		} else {

		}
	}
}