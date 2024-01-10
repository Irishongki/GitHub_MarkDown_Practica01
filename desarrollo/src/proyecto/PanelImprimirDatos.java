/**
  * PanelImprimirDatos.java
  * 24 Nov 2023 21:35:01
  * @author Irene Cañadas Pastor
 */
package proyecto;


import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

// TODO: Auto-generated Javadoc
/**
 * The Class PanelImprimirDatos.
 */
public class PanelImprimirDatos extends JPanel{
	
	/** The panel datos arrendador. */
	PanelDatosArrendador panelDatosArrendador;
	
	/** The panel datos inmueble. */
	PanelDatosInmueble panelDatosInmueble;
	 
 	/** The tabbed pane. */
 	JTabbedPane tabbedPane;
	 
 	/** The etiqueta datos inmueble. */
 	JLabel etiquetaDatosArrendador, etiquetaDatosInmueble;
	
	/**
	 * Instantiates a new panel imprimir datos.
	 */
	public PanelImprimirDatos() {
		this.setLayout(new GridLayout(2,1));
		
		panelDatosArrendador = new PanelDatosArrendador();
		panelDatosInmueble = new PanelDatosInmueble();
		
		// Crear el JTabbedPane
        tabbedPane = new JTabbedPane();
        
        // Panel de Datos del Arrendador
        JPanel arrendadorPanel = new JPanel();
        arrendadorPanel.setLayout(new GridLayout(3, 2));
        etiquetaDatosArrendador = new JLabel("Datos del Arrendador");
        arrendadorPanel.add(etiquetaDatosArrendador);

        // Panel de Datos del Inmueble
        JPanel inmueblePanel = new JPanel();
        inmueblePanel.setLayout(new GridLayout(3, 2));
        etiquetaDatosInmueble = new JLabel("Datos del Inmueble");
        inmueblePanel.add(etiquetaDatosInmueble);


        // Agregar las pestañas al JTabbedPane
        tabbedPane.addTab("Arrendador", arrendadorPanel);
        tabbedPane.addTab("Inmueble", inmueblePanel);

        
        // Agregar el JTabbedPane al JFrame
        this.add(tabbedPane);
       
    }	
	 
}
	
	

