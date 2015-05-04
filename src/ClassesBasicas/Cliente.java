package classesBasicas;


public class Cliente {
	String nome;
	String endereco;
	int idade;
	long cpf;
	long telefone;
	String email;
	Avaliacao avaliacaofisica;
	Treinador treinador;
	

	public Cliente(String nome, String endereco, int idade, long cpf, long telefone, String email, Avaliacao avaliacaoFisica) {
		setNome(nome);
		setEndereco(endereco);
		setIdade(idade);
		setEmail(email);
		setAvaliacaofisica(avaliacaoFisica);
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
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAvaliacaofisica(Avaliacao avaliacaofisica) {
		this.avaliacaofisica = avaliacaofisica;
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
	
	public String getEmail() {
		return email;
	}
	
	public Avaliacao getAvaliacaofisica() {
		return avaliacaofisica;
	}
	
public String toString() {

	return "Nome: " + this.nome + "\nEndereco: " + this.endereco + "\nIdade: " + this.idade + "\nCPF: " + this.cpf + "\nTelefone: " + this.telefone
			+ "\nEmail : " + this.email + "\nAvaliação Fisica\n" + this.avaliacaofisica.toString();
}
}
