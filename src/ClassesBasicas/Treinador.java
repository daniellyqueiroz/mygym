package classesBasicas;


public class Treinador extends Pessoa{
	
	public Treinador(String nome,long cpf,Login login ) {
		super(nome,cpf, login);
		
	}
	
	
	
	public String toString() {
		
		return "\nNome: " + this.getNome() + "\nCPF: " + this.getCpf() + "\nUsuario" + this.getLogin().geUsuario() + "\nSenha: " + this.getLogin().getSenha();
	}


}
