package excecoes;

public class InputMismatchException extends Exception {

	private String  formato;

	public InputMismatchException(String formato) {
		super("Formato inválido");
		setInputMismatchException(formato);
	}

	private void setInputMismatchException(String formato) {
		this.formato = formato;
	}

	public String getInputMismatchException() {
		return formato;
	}

}
