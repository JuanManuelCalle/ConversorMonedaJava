package Modelo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Modelo.Conversor;

public class Divisa {
	public void CrearConversion(){
		JFrame opt = new JFrame("Conversor de divisas");
		opt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		opt.setLayout(new FlowLayout());
		
		JComboBox<String> CurrencyComboBox = new JComboBox<>(new String[] {"Dólares (USD)", "Euros (EUR)", "Yenes Japoneses (JPY)", "Libras Esterlinas (GBP)", "Peso Colombiano (COP)"});
		JTextField amountField = new JTextField(10);
		JButton converBtn = new JButton("Convertir");
		JLabel resultLabel = new JLabel("Resultado de la conversion es: ");
		
		converBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String seleccionado = (String) CurrencyComboBox.getSelectedItem();
				double monto = Double.parseDouble(amountField.getText());
				Conversor convertir = new Conversor();
				double montoConvertido = convertir.DivisaConvert(monto, seleccionado);
				DecimalFormat df = new DecimalFormat("#.##");
				ObtenerDivisa odv = new ObtenerDivisa();
				resultLabel.setText("Resultado: " + df.format(montoConvertido) + " " + odv.ObtenerModena(seleccionado));
				
				 try {
	                    if (monto< 0) {
	                        throw new NumeroNoValidoException("El monto no puede ser menor a 0");
	                    }
	                } catch (NumeroNoValidoException ex) {
	                    resultLabel.setText("Error: Ingresa un número válido");
	                }

			}
		});
		
		opt.add(CurrencyComboBox);
		opt.add(amountField);
		opt.add(converBtn);
		opt.add(resultLabel);
		
		opt.pack();
		opt.setVisible(true);
	}
}
