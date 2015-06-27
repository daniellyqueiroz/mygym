package gui;

import javax.swing.JFrame;

import negocios.IMyGymFachada;
import negocios.MyGymFachada;


public abstract class TelaFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	protected static IMyGymFachada fachada = new MyGymFachada();
}
