package excecoes;

public class TreinadorN�oExisteException extends Exception{
	
	private long cpf;

	public TreinadorN�oExisteException(long cpf) {
		super("N�o existe nenhum treinador com esse CPF");
		setTreinadorN�oExisteException(cpf);
		
	}

	private void setTreinadorN�oExisteException(long cpf2) {
		this.cpf = cpf;
		
	}

	private long getTreinadorN�oExisteException (){
		
		return cpf;
	}
}
