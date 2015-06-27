package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JButton;

public class TelaRevisarAluno extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRevisarAluno frame = new TelaRevisarAluno();
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
	public TelaRevisarAluno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBounds(10, 11, 166, 213);
		contentPane.add(list);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(209, 228, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnRevisar = new JButton("Revisar");
		btnRevisar.setBounds(319, 228, 89, 23);
		contentPane.add(btnRevisar);
	}
}
