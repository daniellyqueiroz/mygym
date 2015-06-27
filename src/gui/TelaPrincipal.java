package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class TelaPrincipal {
	private static final long serialVersionUID = 1L;


	private JFrame Frame;

		public TelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Frame = new JFrame();
		Frame.setBounds(100, 100, 358, 262);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.getContentPane().setLayout(null);
		
		JButton btnCliente = new JButton("Cliente");
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCliente.setBounds(10, 149, 89, 23);
		Frame.getContentPane().add(btnCliente);
		
		JButton btnTreinador = new JButton("Treinador");	
		btnTreinador.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnTreinador.setBounds(109, 149, 88, 23);
		Frame.getContentPane().add(btnTreinador);
		
		JButton btnAdministrador = new JButton("Administrador");
		btnAdministrador.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAdministrador.setBounds(207, 149, 125, 23);
		Frame.getContentPane().add(btnAdministrador);
		
		JLabel lblMyGym = new JLabel("My Gym");
		lblMyGym.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyGym.setFont(new Font("Candara", Font.BOLD, 47));
		lblMyGym.setBounds(80, 44, 181, 48);
		Frame.getContentPane().add(lblMyGym);
	}
}
