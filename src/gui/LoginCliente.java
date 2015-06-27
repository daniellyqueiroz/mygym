package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class LoginCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginCliente frame = new LoginCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 305, 210);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblDigiteSeuCpf = new JLabel("Digite seu CPF");
		lblDigiteSeuCpf.setBounds(39, 28, 127, 20);
		lblDigiteSeuCpf.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel label = new JLabel("");
		label.setBounds(198, 5, 159, 55);
		
		textField = new JTextField();
		textField.setBounds(39, 59, 154, 20);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(198, 65, 159, 55);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(39, 113, 75, 23);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(162, 113, 79, 23);
		contentPane.setLayout(null);
		contentPane.add(lblDigiteSeuCpf);
		contentPane.add(label);
		contentPane.add(textField);
		contentPane.add(label_1);
		contentPane.add(btnCancelar);
		contentPane.add(btnConfirmar);
	}
}
