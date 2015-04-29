package ClassesBasicas;


public class Cliente {
	String nome;
	String endereco;
	int idade;
	long cpf;
	long telefone;
	Treinador treinador;
	

	public Cliente(String nome, String endereco, int idade, long cpf, long telefone) {
		setNome(nome);
		setEndereco(endereco);
		setIdade(idade);
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
	
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEndereco(){
		return endereco;
	}
	
	public int getIdade(){
		return idade;
	}
	
	public long getCpf() {
		return cpf;
	}
	
	public long getTelefone() {
		return telefone;
	}

public String toString() {

	return "Nome: " + this.nome + "\nEndereco: " + this.endereco + "\nIdade: " + this.idade + "\nCPF: " + this.cpf + "\nTelefone: " + this.telefone;
}
}
