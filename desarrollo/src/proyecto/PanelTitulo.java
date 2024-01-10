/**
  * Panel.java
  * 15 Nov 2023 13:03:14
  * @author Irene Cañadas Pastor
 */
package proyecto;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

// TODO: Auto-generated Javadoc
/**
 * The Class PanelTitulo.
 */
public class PanelTitulo extends JPanel{

	/** The titulo. */
	private JLabel titulo;
	
	/** The imagen. */
	private ImageIcon imagen;
	
	/** The ayuda imagen. */
	private Image imagenReescalada, ayudaImagen;
	
	/** The icono. */
	private JLabel icono;
	
	
		/**
		 * Instantiates a new panel titulo.
		 */
		public PanelTitulo() {
			// Creo el Layout del panel
			this.setLayout(new FlowLayout(FlowLayout.CENTER));
			
			titulo = new JLabel("Gestión Apartamentos Turísticos IRIS APARTMENTS");
			titulo.setFont(new Font("Bevan", Font.BOLD, 22));
			titulo.setForeground(new Color(242,240,223));
			
			imagen = new ImageIcon(getClass().getResource("/recursos/logo2.png"));
			ayudaImagen = imagen.getImage();
			imagenReescalada = ayudaImagen.getScaledInstance(200, 100, Image.SCALE_SMOOTH);
			imagen = new ImageIcon(imagenReescalada);
			icono = new JLabel(imagen);
			
			this.add(icono);
			this.add(titulo);
			
			this.setBackground(new Color(96,120,144));
			
		}
	}
	

