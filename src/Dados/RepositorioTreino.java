package dados;


import classesBasicas.Treino;

public class RepositorioTreino {

			private Treino[] treino;
			private int proxima;

			public RepositorioTreino(int tamanho) {

				this.treino = new Treino[tamanho];
				this.proxima = 0;
			}

			private int procurarIndice(long cpf) {

				int i = 0;

				boolean achou = false;

				while ((!achou) && (i < this.proxima)) {

					if (cpf == (this.treino[i].getCliente().getCpf()) ) {

						achou = true;

					} else {

						i = i + 1;

					}

				}

				return i;

			}

			private void duplicaArrayTreinador() {

				if (this.treino != null && this.treino.length > 0) {

					Treino[] arrayDuplicado = new Treino[this.treino.length * 2];

					for (int i = 0; i < this.treino.length; i++) {

						arrayDuplicado[i] = this.treino[i];

					}

					this.treino = arrayDuplicado;

				}

			}

			public boolean existe(long cpf ) {

				boolean existe = false;

				int indice = this.procurarIndice(cpf);

				if (indice != proxima) {

					existe = true;

				}

				return existe;

			}

			public void cadastrar(Treino t) {

				this.treino[this.proxima] = t;

				this.proxima = this.proxima + 1;

				if (this.proxima == this.treino.length) {

					this.duplicaArrayTreinador();

				}

			}

			public Treino procurar(long cpf ) {

				int i = this.procurarIndice(cpf);

				Treino resultado = null;

				if (i != this.proxima) {

					resultado = this.treino[i];

				}

				return resultado;

			}

			public void remover(long cpf ) {

				int i = this.procurarIndice(cpf);

				if (i != this.proxima) {

					this.treino[i] = this.treino[this.proxima - 1];

					this.treino[this.proxima - 1] = null;

					this.proxima = this.proxima - 1;

				} else {

				}
			}
			public Treino[] exibirTreino(){
				return this.treino;
			}

}
