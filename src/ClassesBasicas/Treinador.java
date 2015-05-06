package classesBasicas;


public class Treinador {
	String nome;
	long cpf;

	public Treinador(String nome, long cpf) {
		setNome(nome);
		this.cpf = cpf;
		
	}
	public String getNome() {
		return nome;
	}
	public long getCpf() {
		return cpf;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public String toString() {
		// TODO Auto-generated method stub
		return "Nome:\n" + nome + "\nCPF:\n" + cpf;
	}

}
