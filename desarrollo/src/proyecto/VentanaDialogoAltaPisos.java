/**
  * VentanaDialogoAltaPisos.java
  * 19 Nov 2023 18:02:26
  * @author Irene Cañadas Pastor
 */
package proyecto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

// TODO: Auto-generated Javadoc
/**
 * The Class VentanaDialogoAltaPisos.
 */
public class VentanaDialogoAltaPisos extends JDialog{
	
	/** The datos tercer panel. */
	private String datosSegundoPanel, datosTercerPanel;
	
	/**
	 * Instantiates a new ventana dialogo alta pisos.
	 *
	 * @param parent the parent
	 */
	public VentanaDialogoAltaPisos(Frame parent) {
        super(parent, "Alta Pisos", true);
        this.setLayout(new BorderLayout());
        
        //El tamano de la pantalla es la resolucion de la pantalla
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize);
        
     // Ponemos un icono a nuestra ventana dialogo que será el logo
     	Image miIcono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/recursos/logo2.png"));
     	this.setIconImage(miIcono);
        
     	//Llamamos a nuestros paneles
     	PanelTitulo panelTitulo = new PanelTitulo();
     	PanelDatosArrendador panelDatosArrendador = new PanelDatosArrendador();
     	PanelDatosInmueble panelDatosInmueble = new PanelDatosInmueble();
     	PanelImprimirDatos panelImprimirDatos= new PanelImprimirDatos();
     	
     	//Le ponemos un borde a los paneles
     	panelTitulo.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED, new Color(142,158,130), new Color(202,204,182)));
     	
     	TitledBorder titulo = new TitledBorder("Datos Arrendador");
     	titulo.setTitlePosition(TitledBorder.TOP);
     	titulo.setTitleJustification(TitledBorder.CENTER);
     	titulo.setBorder(BorderFactory.createLineBorder(new Color(142,158,130),7));
     	titulo.setTitleFont(new Font("Serif", Font.BOLD, 24));
     	panelDatosArrendador.setBorder(titulo);
     	
     	TitledBorder titulo2 = new TitledBorder("Datos del Inmueble");
     	titulo2.setTitlePosition(TitledBorder.TOP);
     	titulo2.setTitleJustification(TitledBorder.CENTER);
     	titulo2.setBorder(BorderFactory.createLineBorder(new Color(96,120,144),7));
     	titulo2.setTitleFont(new Font("Serif", Font.BOLD, 24));
     	panelDatosInmueble.setBorder(titulo2);
        
     	Box cajaPaneles= Box.createVerticalBox();
     	Box cajaPaneles2 = Box.createHorizontalBox();
     	cajaPaneles.add(Box.createGlue());
     	cajaPaneles.add(panelTitulo);
    	cajaPaneles.add(Box.createGlue());
     	cajaPaneles.add(panelDatosArrendador);
     	cajaPaneles.add(Box.createGlue());
     	
     	cajaPaneles.add(Box.createGlue());
     	cajaPaneles2.add(panelDatosInmueble);
     	cajaPaneles.add(Box.createGlue());
     	cajaPaneles2.add(panelImprimirDatos);
     	cajaPaneles.add(Box.createGlue());
     	
     	cajaPaneles.add(cajaPaneles2);
     	cajaPaneles.add(Box.createGlue());
     	
     	//Botones y caja de botones
     	Box cajaBotones = Box.createHorizontalBox();
     	JButton nuevo = new JButton("Nuevo");
     	JButton guardar = new JButton("Guardar");
        JButton imprimirDatos = new JButton("Imprimir Datos");
       
       //Listeners
     	 nuevo.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				panelDatosArrendador.limpiarDatos();
 				panelDatosInmueble.limpiarDatos();
 			}
 		});
     	 
     	guardar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				datosSegundoPanel = panelDatosArrendador.obtenerDatosArrendador();
				datosTercerPanel = panelDatosInmueble.obtenerDatosInmueble();
				mostrarDialogoDatosGuardados();
			}
		});
     	
        imprimirDatos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				panelImprimirDatos.etiquetaDatosArrendador.setText(datosSegundoPanel);
				panelImprimirDatos.etiquetaDatosInmueble.setText(datosTercerPanel);
			}
		});
     	
     	cajaPaneles.add(Box.createVerticalStrut(5));
     	cajaBotones.add(nuevo);
     	cajaBotones.add(guardar);
     	cajaBotones.add(imprimirDatos);
     	cajaPaneles.add(cajaBotones);
     	
     	 
     	//Agregamos a nuestro panel Base nuestro Panel Titulo y nuestro panel Botones
        this.add(cajaPaneles, BorderLayout.NORTH);
        this.setVisible(true);
	}
	
	 /**
 	 * Mostrar dialogo datos guardados.
 	 */
 	private void mostrarDialogoDatosGuardados() {   
	       JOptionPane.showMessageDialog(this, "Los Datos se han guardado correctamente", "Guardado", JOptionPane.INFORMATION_MESSAGE);
	 }
}
