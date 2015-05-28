package excecoes;

public class CpfClienteNãoExisteException extends Exception {

	private long cpf;

	public CpfClienteNãoExisteException(long cpf) {
		super("Não existe nenhum cliente com esse CPF");
		setCpfClienteNãoExiste(cpf);
	}

	private void setCpfClienteNãoExiste(long cpf) {
		this.cpf = cpf;
	}

	public long getCpf() {
		return cpf;
	}

}
