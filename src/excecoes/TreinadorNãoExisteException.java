package excecoes;

public class TreinadorNãoExisteException extends Exception{
	
	private long cpf;

	public TreinadorNãoExisteException(long cpf) {
		super("Não existe nenhum treinador com esse CPF");
		setTreinadorNãoExisteException(cpf);
		
	}

	private void setTreinadorNãoExisteException(long cpf2) {
		this.cpf = cpf;
		
	}

	private long getTreinadorNãoExisteException (){
		
		return cpf;
	}
}
