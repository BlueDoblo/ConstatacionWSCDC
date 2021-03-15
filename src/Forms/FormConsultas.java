package Forms;
import javax.swing.*;
import java.awt.event.*;

public class FormConsultas extends JFrame {
	
	// Variables Globales
	JLabel b = new JLabel();
	int Contador = 0;
	JButton Consultar = new JButton();
	JButton Encender = new JButton();
	Principal.Principal Consola = new Principal.Principal();
	Principal.Utilidades Afip = new Principal.Utilidades();

	public FormConsultas(){ 

		// Formulario 
		setTitle("Consultas Interactivas a AFIP ");
		setSize(420,380);
		setLayout(null);
	    setLocationRelativeTo(null);
		
		// Boton de Consulta
		Consultar.setBounds(200,300,100,30);
		Consultar.addActionListener(null);
		Consultar.setText("Consultar");
		add(Consultar);
		
		// Boton de Encender
		Encender.setBounds(300,300,100,30);
		Encender.addActionListener(null);
		Encender.setText("Constatar");
		add(Encender);
		
		// Label
		b.setBounds(10,1,220,40);
		add(b); 
	    b.setText("Esperando Seleccion...");
				
		Consultar.addActionListener (new ActionListener() {
			  public void actionPerformed(ActionEvent e) 
			  {
			    b.setText("Has pulsado el botón Consultar");
			  }
			});
		
		Encender.addActionListener (new ActionListener() {
			  public void actionPerformed(ActionEvent e) 
			  {
			    b.setText("Has pulsado el botón Encender");
			    while (true)
			    {
			    Consola.main('1');
			    }
			  }
			});
	};
}	