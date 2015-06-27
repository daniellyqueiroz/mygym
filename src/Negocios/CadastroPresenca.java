package negocios;

import java.util.Calendar;

import classesBasicas.Presenca;
import dados.RepositorioPresenca;

public class CadastroPresenca {

	private RepositorioPresenca repositorio;
	
	
	public CadastroPresenca() {

		this.repositorio = new RepositorioPresenca(100);

	}
	
	public void cadastrar(Presenca p) {

		if (p != null && !repositorio.existe(p.getCliente().getCpf())) {

			this.repositorio.cadastrar(p);

		} else {

		}

	}
	
	public Presenca procurar(long cpf){
		return this.repositorio.procurar(cpf);
	}
	
	public boolean existe(long cpf) {

		return this.repositorio.existe(cpf);

	}
	public Presenca[] exibir(){
		return repositorio.exibirPresenca();
	}
}