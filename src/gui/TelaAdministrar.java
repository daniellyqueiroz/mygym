package gui;

import java.awt.Window;
import java.util.HashMap;
import java.util.Map;

import javax.swing.UIManager;


public class TelaAdministrar {
	

		
		private static Administrador windowAdministrador;
		private static Login windowLogin;
		
		
		public TelaAdministrar() {
			
			
			windowAdministrador = new Administrador();
			
			
		}

		public static void proximaTela(String telaAbrir, String telaFechar) {
			windowLogin.frame.setVisible(false);
			
			if (windowAdministrador != null) {
				
			}
			windowAdministrador.frame.setVisible(true);
			
		}

		public static void main(String[] args) {
		
			
				
				new TelaAdministrar();

				String telaFechar = "Login";
				String telaAbrir = "Administrador";
				
				proximaTela(telaAbrir, telaFechar);
				
			
			
		}
}


