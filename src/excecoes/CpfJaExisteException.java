package excecoes;

public class CpfJaExisteException extends Exception{

	private long cpf;
	
	public CpfJaExisteException(long cpf) {
		super("Esse CPF ja existe");
		setCpfJaExiste(cpf);
	}
	
	public void setCpfJaExiste(long cpf){
		this.cpf = cpf;
	}
	
	public long getCpfJaExiste(){
		return cpf;
	}

}
