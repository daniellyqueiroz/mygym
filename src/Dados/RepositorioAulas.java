package dados;

import classesBasicas.Aulas;

public class RepositorioAulas {

	private Aulas [] aulas;
	private int proxima;
	
	public RepositorioAulas(int tamanho) {
		
		this.aulas = new Aulas[tamanho];
		this.proxima = 0;
	}
	
public void cadastrar(Aulas aulas) {

		this.aulas[this.proxima] = aulas;

		this.proxima = this.proxima + 1;
	}
	
private int procurarIndice(String nome) {

	int i = 0;

	boolean achou = false;

	while ((!achou) && (i < this.proxima)) {

		if (nome.equals(this.aulas[i].getNomeDaAula())) {

		achou = true;

		} else {

		i = i + 1;

		}

	}

	return i;

}

	public Aulas procurar(String nome) {

		int i = this.procurarIndice(nome);

		Aulas resultado = null;

			if (i != this.proxima) {

				resultado = this.aulas[i];

			}

			return resultado;

	} 
	
	public boolean existe(String nome) {

		boolean existe = false;

		int indice = this.procurarIndice(nome);

		if (indice != proxima) {

			existe = true;

		}

		return existe;

	}
	
	public void remover(String nome ) {

		int i = this.procurarIndice(nome);

		if (i != this.proxima) {

		this.aulas[i] = this.aulas[this.proxima - 1];

		this.aulas[this.proxima - 1] = null;

		this.proxima = this.proxima - 1;

		} else{

		}
	}


}