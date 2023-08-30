package Main;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import Modelo.Divisa;

public class Main {
	public static void main(String[] args) {
	    SwingUtilities.invokeLater(() -> {
	    	Divisa dv = new Divisa();
	    	dv.CrearConversion();
	    });
	}
}
