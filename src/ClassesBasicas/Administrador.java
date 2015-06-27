package classesBasicas;


public class Administrador {

	private Login login;
	
	public Administrador(Login login) {
		setLogin(login);
		
		
	}
	
	public void setLogin(Login login) {
		this.login = login;
	}
	
	
	public Login getLogin() {
		return login;
	}
	
	
}
