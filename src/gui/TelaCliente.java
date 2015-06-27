package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.List;
import javax.swing.JScrollBar;
import javax.swing.JButton;

public class TelaCliente extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCliente frame = new TelaCliente();
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
	public TelaCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 243, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTreinonomeDo = new JLabel("treino \"nome do treino\"");
		lblTreinonomeDo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTreinonomeDo.setBounds(10, 29, 168, 27);
		contentPane.add(lblTreinonomeDo);
		
		List list = new List();
		list.setBounds(10, 62, 207, 346);
		contentPane.add(list);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(10, 443, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setBounds(128, 443, 89, 23);
		contentPane.add(btnImprimir);
	}
}
