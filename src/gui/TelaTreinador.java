package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class TelaTreinador extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaTreinador frame = new TelaTreinador();
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
	public TelaTreinador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 292, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblnomeDoTreinador = new JLabel("\"nome do treinador\"");
		lblnomeDoTreinador.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblnomeDoTreinador.setBounds(24, 11, 195, 33);
		contentPane.add(lblnomeDoTreinador);
		
		JButton btnCriarTreino = new JButton("Criar treino");
		btnCriarTreino.setBounds(123, 70, 120, 23);
		contentPane.add(btnCriarTreino);
		
		JButton btnRevisarAluno = new JButton("Revisar Aluno");
		btnRevisarAluno.setBounds(123, 104, 120, 23);
		contentPane.add(btnRevisarAluno);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(10, 228, 89, 23);
		contentPane.add(btnCancelar);
	}

}
