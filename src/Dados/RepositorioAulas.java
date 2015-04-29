package Dados;

import java.util.Date;

import ClassesBasicas.Aulas;

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
	
private int procurarIndice(Date data) {

	int i = 0;

	boolean achou = false;

	while ((!achou) && (i < this.proxima)) {

		if (data.equals(this.aulas[i].getData())) {

		achou = true;

		} else {

		i = i + 1;

		}

	}

	return i;

}

	public Aulas procurar(Date data) {

		int i = this.procurarIndice(data);

		Aulas resultado = null;

			if (i != this.proxima) {

				resultado = this.aulas[i];

			}

			return resultado;

	}
	
	public void remover(Date data) {

		int i = this.procurarIndice(data);

		if (i != this.proxima) {

		this.aulas[i] = this.aulas[this.proxima - 1];

		this.aulas[this.proxima - 1] = null;

		this.proxima = this.proxima - 1;

		} else{

		}
	}
}