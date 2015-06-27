package gui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JButton;

public class Administrador extends TelaFrame{

	public JFrame frame;

	
	public Administrador() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenu mnAdministrarCliente = new JMenu("Administrar Cliente");
		mnAdministrarCliente.setBounds(10, 49, 185, 22);
		frame.getContentPane().add(mnAdministrarCliente);
		
		JMenu mnAdministrarTreinador = new JMenu("Administrar Treinador");
		mnAdministrarTreinador.setBounds(10, 82, 185, 22);
		frame.getContentPane().add(mnAdministrarTreinador);
		
		JMenu mnAdministrarAulas = new JMenu("Administrar Aulas");
		mnAdministrarAulas.setBounds(10, 115, 185, 22);
		frame.getContentPane().add(mnAdministrarAulas);
		
		JMenu mnAdministrarMensalidades = new JMenu("Administrar Mensalidades");
		mnAdministrarMensalidades.setBounds(10, 148, 185, 22);
		frame.getContentPane().add(mnAdministrarMensalidades);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(43, 206, 89, 23);
		frame.getContentPane().add(btnVoltar);
		
	}
}
