package excecoes;

public class IdadeInvalidaException extends Exception{
	private int idade;
	public IdadeInvalidaException(int idade) {
	super("Idade invalida");
	setIdadeInvalida(idade);
	
	}
	
	public void setIdadeInvalida(int idade){
		this.idade = idade;
	}
	
	public int getIdadeInvalida(){
		return idade;
	}
}
