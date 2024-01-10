/**
  * VentanaPrincipal.java
  * 15 Nov 2023 11:01:39
  * @author Irene Cañadas Pastor
 */
package proyecto;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.UIManager;



// TODO: Auto-generated Javadoc
/**
 * The Class VentanaPrincipal.
 */
public class VentanaPrincipal extends JFrame{
	
	/** The mi barra. */
	private JMenuBar miBarra;
	
	/** The ayuda. */
	private JMenu archivo, registro,ayuda;
	
	/** The acerca de. */
	private JMenuItem salir, altaPisos, bajaPisos, acercaDe;
	
	/** The boton baja. */
	private JButton botonAlta, botonBaja;
	
	/**
	 * Instantiates a new ventana principal.
	 */
	public VentanaPrincipal() {
		super("Gestión Apartamentos Turísticos IRIS APARTMENTS");
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		
		//Poner un color a los paneles 
		 UIManager.put("OptionPane.background", new Color(169,193,217)); 
	     UIManager.put("Panel.background", new Color(169,193,217));
	    
	
		//Le ponemos que el tamano de nuestra ventana sea la mitad de la resolucion de mi pantalla
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension tamanoPantalla= miPantalla.getScreenSize();
		int altoPantalla = tamanoPantalla.height;
		int anchoPantalla = tamanoPantalla.width;
		this.setSize(anchoPantalla/2,altoPantalla/2);
		
		//Ponemos nuestra ventana centrada
		this.setLocationRelativeTo(null);
		
		// Ponemos un icono a nuestra ventana que será el logo
		Image miIcono = miPantalla.getImage(getClass().getResource("/recursos/logo2.png"));
		this.setIconImage(miIcono);
		
		//Creamos nuestro menu y vamos agregandole los elementos
		miBarra = new JMenuBar();

		archivo = new JMenu("Archivo");
		salir = new JMenuItem("Salir");
		
		registro = new JMenu("Registro");
		altaPisos = new JMenuItem("Alta Pisos");
		bajaPisos = new JMenuItem("Baja Pisos");
		
		ayuda= new JMenu("Ayuda");
		acercaDe = new JMenuItem("Acerca de..");
		
		//Aceleradores
		registro.setMnemonic(KeyEvent.ALT_DOWN_MASK);
		altaPisos.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
		bajaPisos.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
		 
		
        //Agregamos los elementos al menu
		archivo.add(salir);
		registro.add(altaPisos);
		registro.add(bajaPisos);
		ayuda.add(acercaDe);
		miBarra.add(archivo);
		miBarra.add(registro);
		miBarra.add(ayuda);
		
		//Creamos los botones
		botonAlta = new JButton();
		botonBaja = new JButton();
		
		//Ruta de los iconos
		ImageIcon icono = new ImageIcon(getClass().getResource("/recursos/iconoNuevo.png"));
		ImageIcon icono2 = new ImageIcon(getClass().getResource("/recursos/iconoEliminar.png"));
		
		// Reescalar el tamaño del ImageIcon 1
        Image image = icono.getImage();
        Image nuevaImagen = image.getScaledInstance(300, 300,  java.awt.Image.SCALE_SMOOTH);
        icono = new ImageIcon(nuevaImagen);
        
     // Reescalar el tamaño del ImageIcon 2
        Image image2 = icono2.getImage();
        Image nuevaImagen2 = image2.getScaledInstance(300, 300,  java.awt.Image.SCALE_SMOOTH);
        icono2 = new ImageIcon(nuevaImagen2);
        
        //Establecemos los iconos para los botones
		botonAlta.setIcon(icono);
		botonBaja.setIcon(icono2);
		
		//Le ponemos un color a los botones
		botonAlta.setBackground(new Color(169,193,217));
		botonBaja.setBackground(new Color(169,193,217));
		
		 //Listeners
		 salir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 mostrarDialogoSalir();
			}
		});
		 
        altaPisos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirVentanaAltaPisos();
            }
        });
        
        bajaPisos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarDialogoBajaPisos();
            }

        });
        
        acercaDe.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mostrarDialogoInformacion();
			}
		});
        
        botonAlta.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				abrirVentanaAltaPisos();
			}
		});
        
        botonBaja.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mostrarDialogoBajaPisos();
			}
		});
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                mostrarDialogoSalir();
            }
        });
		
		//Creamos un panel para los botones y los agregamos
		JPanel panelBotones = new JPanel(new GridLayout(1,1));
		panelBotones.add(botonAlta);
		panelBotones.add(botonBaja);
		
		
		//Agregamos nuestro menu a nuestra ventana al norte y el panelBase
		this.add(miBarra, BorderLayout.NORTH);
		this.add(panelBotones,BorderLayout.CENTER);
		this.setVisible(true);
	}
	
	/**
	 * Mostrar dialogo salir.
	 */
	//Metodo que muestra un mensaje para salir de la aplicacion con su icono propio
	 private void mostrarDialogoSalir() {
	        ImageIcon icono = new ImageIcon(getClass().getResource("/recursos/salir.png"));

	        int opcion = JOptionPane.showConfirmDialog(
	                this,
	                "¿Estas seguro de salir?",
	                "Salir",
	                JOptionPane.YES_NO_OPTION,
	                JOptionPane.QUESTION_MESSAGE,
	                icono);
	        
	        if (opcion == JOptionPane.YES_OPTION) {
	            System.exit(0);
	        }else {
	        	
	        }
	 }
	 
	/**
	 * Mostrar dialogo baja pisos.
	 */
	//Metodo que muestra un mensaje para la opcion de baja de Pisos con su icono propio
	 private void mostrarDialogoBajaPisos() {
	        ImageIcon icono = new ImageIcon(getClass().getResource("/recursos/iconoNoImplementado.png"));
		     
	       JOptionPane.showMessageDialog(this, "La opción Baja Pisos no está desarrollada.", "Advertencia", JOptionPane.WARNING_MESSAGE,icono);
	 }
	 
	/**
	 * Mostrar dialogo informacion.
	 */
	//Metodo que muestra un mensaje con la informacion de la aplicacion con su icono propio
	 private void mostrarDialogoInformacion() {
		        ImageIcon icono = new ImageIcon(getClass().getResource("/recursos/iconoInformacion.png"));
			     
		        JOptionPane.showMessageDialog(null, "Nombre de la empresa: IRIS APARTMENTS\n"+
						"Contacto: Irene Cañadas Pastor\n"+
						"Correo oficial: irisApartments@gmail.com\n"+
						"Telefono: 643112266", "Informacion Basica", JOptionPane.INFORMATION_MESSAGE, icono);
		 }
	
	/**
	 * Abrir ventana alta pisos.
	 */
	//Metodo que abre la ventana de dialogo de Alta Pisos
	 private void abrirVentanaAltaPisos() {
		     VentanaDialogoAltaPisos ventanaDialogo = new VentanaDialogoAltaPisos(null);
		 }
		 
}
