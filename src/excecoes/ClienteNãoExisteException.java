package excecoes;

public class ClienteN�oExisteException extends Exception {

	private long cpf;

	public ClienteN�oExisteException(long cpf) {
		super("N�o existe nenhum cliente com esse CPF");
		setCpfClienteN�oExiste(cpf);
	}

	private void setCpfClienteN�oExiste(long cpf) {
		this.cpf = cpf;
	}

	public long getCpf() {
		return cpf;
	}

}
