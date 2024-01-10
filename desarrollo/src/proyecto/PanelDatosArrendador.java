/**
  * PanelDatosArrendador.java
  * 19 Nov 2023 19:23:14
  * @author Irene Cañadas Pastor
 */
package proyecto;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import java.awt.GridLayout;


import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

// TODO: Auto-generated Javadoc
/**
 * The Class PanelDatosArrendador.
 */
public class PanelDatosArrendador extends JPanel{
	
	/** The etiqueta nombre. */
	private JLabel etiquetaNombre;
	
	/** The etiqueta apellidos. */
	private JLabel etiquetaApellidos;
	
	/** The etiqueta DNI. */
	private JLabel etiquetaDNI;
	
	/** The etiqueta telefono. */
	private JLabel etiquetaTelefono;
	
	/** The nombre. */
	private JTextField nombre;
	
	/** The apellidos. */
	private JTextField apellidos;
	
	/** The dni. */
	private JFormattedTextField dni;
	
	/** The telefono. */
	private JFormattedTextField telefono;
	
	
	/**
	 * Instantiates a new panel datos arrendador.
	 */
	public PanelDatosArrendador() {
		this.setLayout(new GridLayout(4,2));
		this.setBackground(new Color(202,204,182));
	
		etiquetaNombre = new JLabel("Nombre:");
		nombre= new JTextField(25);
		
		etiquetaApellidos = new JLabel("Apellidos:");
		apellidos = new JTextField(25);
		
		
		etiquetaDNI = new JLabel("DNI:");
		etiquetaTelefono= new JLabel("Telefono:");
		
		try {
			MaskFormatter dniMask = new MaskFormatter("########U");
			MaskFormatter telefonoMask = new MaskFormatter("#########");
			
			dni = new JFormattedTextField(dniMask);
			dni.setFocusLostBehavior(JFormattedTextField.COMMIT);
			
			telefono = new JFormattedTextField(telefonoMask);
			telefono.setFocusLostBehavior(JFormattedTextField.COMMIT);
			
			dni.setPreferredSize(new Dimension(105,20));
			telefono.setPreferredSize(new Dimension(305,20));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Le damos un estilo a las etiquetas
		etiquetaNombre.setFont(new Font("Serif", Font.BOLD, 20));
		etiquetaApellidos.setFont(new Font("Serif", Font.BOLD, 20));
		etiquetaDNI.setFont(new Font("Serif", Font.BOLD, 20));
		etiquetaTelefono.setFont(new Font("Serif", Font.BOLD, 20));
		
		//Le damos un color a las etiquetas
		etiquetaNombre.setForeground(Color.BLACK);
		etiquetaApellidos.setForeground(Color.BLACK);
		etiquetaDNI.setForeground(Color.BLACK);
		etiquetaTelefono.setForeground(Color.BLACK);
		

		this.add(etiquetaNombre);
		this.add(nombre);
		this.add(etiquetaApellidos);
		this.add(apellidos);
		this.add(etiquetaDNI);
		this.add(dni);
		this.add(etiquetaTelefono);
		this.add(telefono);
		
	}
	
	/**
	 * Obtener datos arrendador.
	 *
	 * @return the string
	 */
	public String obtenerDatosArrendador() {
		return "Nombre: "+ nombre.getText()+
					  "  Apellidos: "+ apellidos.getText()+
					  "  DNI: "+ dni.getText() + 
					  "  Telefono: "+ telefono.getText();
	}

	
	/**
	 * Limpiar datos.
	 */
	public void limpiarDatos() {
		nombre.setText("");
		apellidos.setText("");
		dni.setText("");
		telefono.setText("");
	
	}
}
