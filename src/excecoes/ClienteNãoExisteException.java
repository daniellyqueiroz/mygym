package excecoes;

public class ClienteNãoExisteException extends Exception {

	private long cpf;

	public ClienteNãoExisteException(long cpf) {
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
