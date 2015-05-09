package negocios;

import classesBasicas.Aula;
import dados.RepositorioAulas;


public class CadastroAula {

	private  RepositorioAulas repositorio;
	

	public CadastroAula() {

		repositorio = new RepositorioAulas(100);

	}

	public void cadastrar(Aula aulas) {

		if (aulas != null && !repositorio.existe(aulas.getNomeDaAula())) {

			this.repositorio.cadastrar(aulas);

		} else {

		}

	}

	public Aula procurar(String nome) {

		return this.repositorio.procurar(nome);

	}

	public boolean existe(String nome) {

		return this.repositorio.existe(nome);

	}

	public  void remover(String nome) {

		Aula c = this.repositorio.procurar(nome);

		if (c != null) {

			this.repositorio.remover(nome);

		} else {

		}

	}
	
	public Aula[] exibir(){
		return this.repositorio.exibirAulas();
	}

}
