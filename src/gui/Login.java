package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Login {

	public JFrame frame;
	private JTextField textFieldLogin;
	private JLabel lblSenha;
	private JTextField textFieldSenha;
	private JButton btnCancelar;
	private JButton btnConfirmar;

	
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblLogin.setBounds(24, 44, 56, 16);
		frame.getContentPane().add(lblLogin);
		
		textFieldLogin = new JTextField();
		textFieldLogin.setBounds(24, 71, 219, 20);
		frame.getContentPane().add(textFieldLogin);
		textFieldLogin.setColumns(10);
		
		lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSenha.setBounds(24, 102, 46, 14);
		frame.getContentPane().add(lblSenha);
		
		textFieldSenha = new JTextField();
		textFieldSenha.setBounds(26, 127, 217, 20);
		frame.getContentPane().add(textFieldSenha);
		textFieldSenha.setColumns(10);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(24, 195, 89, 23);
		frame.getContentPane().add(btnCancelar);
		
		btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(274, 195, 89, 23);
		frame.getContentPane().add(btnConfirmar);
		
		
	}
}
