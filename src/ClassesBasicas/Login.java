package classesBasicas;

public class Login {

	private String login;
	private String senha;
	public Login(String login, String senha) {
		
		setLogin(login);
		setSenha(senha);
		
	}
	
	public String geUsuario() {
		return login;
	}
	public String getSenha() {
		return senha;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
