package negocios;

import classesBasicas.Treino;
import dados.RepositorioTreino;

public class CadastroTreino {

	private RepositorioTreino repositorio;
	
	public CadastroTreino(){
		
		this.repositorio = new RepositorioTreino(100);
		
		
	}
	
	public void cadastrar(Treino t) {

		if (t != null && !repositorio.existe(t.getCliente().getCpf())) {

			this.repositorio.cadastrar(t);

		} else {

		}

	}
	
	public Treino procurar(long cpf){
		return this.repositorio.procurar(cpf);
	}
	
	public boolean existe(long cpf) {

		return this.repositorio.existe(cpf);

	}
	
	public void remover(long cpf) {

		Treino t = this.repositorio.procurar(cpf);

		if (t != null) {

			this.repositorio.remover(cpf);

		} else {

		}

	}
	public Treino[] exibir(){
		return repositorio.exibirTreino();
	}
}
