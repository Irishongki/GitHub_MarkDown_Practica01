/**
  * PanelDatosInmueble.java
  * 22 Nov 2023 13:01:09
  * @author Irene Cañadas Pastor
 */
package proyecto;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Calendar;
import java.util.Date;


import javax.swing.BorderFactory;

import javax.swing.ImageIcon;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


// TODO: Auto-generated Javadoc
/**
 * The Class PanelDatosInmueble.
 */
public class PanelDatosInmueble extends JPanel {
    
	/** The etiqueta direccion. */
	private JLabel etiquetaDireccion; 
	
	/** The etiqueta provincia. */
	private JLabel etiquetaProvincia;
	
	/** The etiqueta fecha alta. */
	private JLabel etiquetaFechaAlta;
	
	/** The etiquetafecha disponibilidad. */
	private JLabel etiquetafechaDisponibilidad;
	
	/** The etiqueta numero huespedes. */
	private JLabel etiquetaNumeroHuespedes;
	
	/** The etiqueta numero dormitorios. */
	private JLabel etiquetaNumeroDormitorios;
	
	/** The etiqueta numero banos. */
	private JLabel etiquetaNumeroBanos;
	
	/** The etiqueta numero camas. */
	private JLabel etiquetaNumeroCamas;
	
	/** The etiqueta tipo camas. */
	private JLabel etiquetaTipoCamas;
	
	/** The etiqueta ninos. */
	private JLabel etiquetaNinos;
	
	/** The etiqueta imagenes. */
	private JLabel etiquetaImagenes;
	
	/** The etiqueta precio minimo. */
	private JLabel etiquetaPrecioMinimo;
	
	/** The direccion. */
	private JTextField direccion;
	
	/** The provincia combo box. */
	private JComboBox<String> provinciaComboBox;
	
	/** The fecha alta. */
	private JFormattedTextField fechaAlta;
	
	/** The fecha disponibilidad. */
	private JFormattedTextField fechaDisponibilidad;
	
	/** The num huespedes. */
	private JSpinner numHuespedes;
	
	/** The num dormitorios. */
	private JSpinner numDormitorios;
	
	/** The num banos. */
	private JSpinner numBanos;
	
	/** The num camas spinner. */
	private JSpinner numCamasSpinner;
	
	/** The tipo camas combo box. */
	private JComboBox<String> tipoCamasComboBox ;
	
	/** The ninos check box. */
	private JCheckBox ninosCheckBox;
	
	/** The edad ninos spinner. */
	private JSpinner edadNinosSpinner;
	
	/** The extras text field. */
	private JTextField extrasTextField;
	
	/** The precio minimo. */
	private JTextField precioMinimo;
	
	/** The Constant etiquetaFont. */
	private static final Font etiquetaFont = new Font("Arial", Font.BOLD, 12);
	
	/**
	 * Instantiates a new panel datos inmueble.
	 */
	public PanelDatosInmueble() {
		this.setLayout(new GridBagLayout());
		this.setBackground(new Color(242,240,223));
		
		GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Márgenes entre los componentes
        
		//Inicializamos las etiquetas
		etiquetaDireccion = new JLabel("Dirección: ");
		etiquetaProvincia = new JLabel("Provincia: ");
		etiquetaFechaAlta = new JLabel("Fecha de Alta: ");
		etiquetafechaDisponibilidad = new JLabel("Fecha de Disponibilidad: ");
		etiquetaNumeroHuespedes = new JLabel("Nº de Huéspedes: ");
		etiquetaNumeroDormitorios = new JLabel("Nº de Dormitorios: ");
		etiquetaNumeroBanos = new JLabel("Nº de Baños: ");
		etiquetaNumeroCamas = new JLabel("Nº de Camas: ");
		etiquetaTipoCamas = new JLabel("Tipo de Camas: ");
		etiquetaNinos = new JLabel("¿Niños?: ");
		etiquetaImagenes = new JLabel("Pisos que tenemos: ");
		etiquetaPrecioMinimo = new JLabel("Precio Mínimo: ");
		
		//Le ponemos un estilo y tamaño a nuestras etiquetas
		etiquetaDireccion.setFont(etiquetaFont);
		etiquetaProvincia.setFont(etiquetaFont);
		etiquetaFechaAlta.setFont(etiquetaFont);
		etiquetafechaDisponibilidad.setFont(etiquetaFont);
		etiquetaNumeroHuespedes.setFont(etiquetaFont);
		etiquetaNumeroDormitorios.setFont(etiquetaFont);
		etiquetaNumeroBanos.setFont(etiquetaFont);
		etiquetaNumeroCamas.setFont(etiquetaFont);
		etiquetaTipoCamas.setFont(etiquetaFont);
		etiquetaNinos.setFont(etiquetaFont);
		etiquetaImagenes.setFont(etiquetaFont);
		etiquetaPrecioMinimo.setFont(etiquetaFont);
	
		
		//Direccion
		this.add(etiquetaDireccion);
		direccion= new JTextField(30);
		this.add(direccion);
		
		//Provincias
		this.add(etiquetaProvincia);
		 String[] provincias = {"Selecciona una", "Alava (Araba) - Pais Vasco (Euskadi)",
	                "Albacete - Castilla-La Mancha", "Alicante - Comunidad Valenciana", "Almeria - Andalucia",
	                "Asturias - Principado de Asturias", "Avila - Castilla y Leon", "Badajoz - Extremadura",
	                "Barcelona - Cataluña (Catalunya)", "Burgos - Castilla y Leon", "Cáceres - Extremadura",
	                "Cádiz - Andalucia", "Cantabria - Cantabria",
	                "Castellon (Castello) - Comunidad Valenciana (Comunitat Valenciana)",
	                "Ciudad Real - Castilla-La Mancha", "Cordoba - Andalucia", "Cuenca - Castilla-La Mancha",
	                "Gerona (Girona) - Cataluña (Catalunya)", "Granada - Andalucia", "Guadalajara - Castilla-La Mancha",
	                "Guipuzcoa (Gipuzkoa) - Pais Vasco (Euskadi)", "Huelva - Andalucia", "Huesca - Aragon",
	                "Islas Baleares (Illes Balears) - Islas Baleares (Illes Balears)", "Jaen - Andalucia",
	                "La Coruña (A Coruña) - Galicia", "La Rioja - La Rioja", "Las Palmas - Canarias",
	                "León - Castilla y Leon", "Lerida (Lleida) - Cataluña (Catalunya)", "Lugo - Galicia",
	                "Madrid - Comunidad de Madrid", "Malaga - Andalucia", "Murcia - Region de Murcia",
	                "Navarra (Nafarroa) - Comunidad Foral de Navarra (Nafarroako Foru Komunitate)",
	                "Orense (Ourense) - Galicia", "Palencia - Castilla y Leon", "Pontevedra - Galicia",
	                "Salamanca - Castilla y Leon", "Santa Cruz de Tenerife - Canarias", "Segovia - Castilla y Leon",
	                "Sevilla - Andalucia", "Soria - Castilla y Leon", "Tarragona - Cataluña", "Teruel - Aragon",
	                "Toledo - Castilla-La Mancha", "Valencia - Comunidad Valenciana (Comunitat Valenciana)",
	                "Valladolid - Castilla y Leon", "Vizcaya (Bizkaia) - Pais Vasco (Euskadi)", "Zamora - Castilla y Leon",
	                "Zaragoza - Aragon" };
		 provinciaComboBox = new JComboBox<>(provincias);
	     this.add(provinciaComboBox);
	     
	     //Fecha de Alta
	     gbc.gridx = 0;
	     gbc.gridy = 1;
	     this.add(etiquetaFechaAlta,gbc);
	     gbc.gridx = 1;
	     gbc.gridy = 1;
	     fechaAlta = new JFormattedTextField(java.text.DateFormat.getDateInstance());
	     fechaAlta.setValue(new Date());
	     fechaAlta.setPreferredSize(new Dimension(305,20));
	     this.add(fechaAlta,gbc);

	     //Fecha final de Disponibilidad
	     gbc.gridx = 2;
	     gbc.gridy = 1;
	     this.add(etiquetafechaDisponibilidad,gbc);
	     Calendar calendar = Calendar.getInstance();
	     calendar.add(Calendar.YEAR, 1);
	     fechaDisponibilidad = new JFormattedTextField(java.text.DateFormat.getDateInstance());
	     fechaDisponibilidad.setValue(calendar.getTime());
	     fechaDisponibilidad.setPreferredSize(new Dimension(305,20));
	     gbc.gridx = 3;
	     gbc.gridy = 1;
	     this.add(fechaDisponibilidad,gbc);
	     
	     //Nº de Huespedes
	     gbc.gridx = 0;
	     gbc.gridy = 2;
	     this.add(etiquetaNumeroHuespedes,gbc);
	     gbc.gridx = 1;
	     gbc.gridy = 2;
	     numHuespedes= new JSpinner(new SpinnerNumberModel(1, 1, 8, 1));
	     numHuespedes.setPreferredSize(new Dimension(305,20));
	     this.add(numHuespedes,gbc);
	     
	   //Nº de Dormitorios
	     gbc.gridx = 2;
	     gbc.gridy = 2;
	     this.add(etiquetaNumeroDormitorios,gbc);
	     gbc.gridx = 3;
	     gbc.gridy = 2;
	     numDormitorios= new JSpinner(new SpinnerNumberModel(1, 1, 4, 1));
	     numDormitorios.setPreferredSize(new Dimension(305,20));
	     this.add(numDormitorios,gbc);
	     
	   //Nº de Baños
	     gbc.gridx = 0;
	     gbc.gridy = 3;
	   this.add(etiquetaNumeroBanos,gbc);
	   	 gbc.gridx = 1;
	   	 gbc.gridy = 3;
	   numBanos= new JSpinner(new SpinnerNumberModel(1, 1, 2, 1));
	   numBanos.setPreferredSize(new Dimension(305,20));
	   this.add(numBanos,gbc);
	   
	   //Nº de Camas
	   gbc.gridx = 2;
	   gbc.gridy = 3;
	   this.add(etiquetaNumeroCamas,gbc);
	   gbc.gridx = 3;
	   gbc.gridy = 3;
       numCamasSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 4, 1));
       numCamasSpinner.setPreferredSize(new Dimension(305,20));
       this.add(numCamasSpinner,gbc);
       
       //Tipo de Camas
       gbc.gridx = 0;
	   gbc.gridy = 4;
       this.add(etiquetaTipoCamas,gbc);
       gbc.gridx = 1;
	   gbc.gridy = 4;
       tipoCamasComboBox = new JComboBox<>(new String[]{"Simple", "Doble", "Sofá cama"});
       tipoCamasComboBox.setEnabled(false);
       tipoCamasComboBox.setPreferredSize(new Dimension(305,20));
       this.add(tipoCamasComboBox,gbc);
       
       // Listener para activar/desactivar el JComboBox del tipo de Cama según el número de camas
       numCamasSpinner.addChangeListener(new ChangeListener() {
		@Override
		public void stateChanged(ChangeEvent e) {
			 int numCamas = (int) numCamasSpinner.getValue();
	          tipoCamasComboBox.setEnabled(numCamas > 0);
		}
	});
       
       //Si hay algún niño
       gbc.gridx = 2;
       gbc.gridy = 4;
       add(etiquetaNinos, gbc);
       ninosCheckBox = new JCheckBox();
       gbc.gridx = 3;
       gbc.gridy = 4;
       this.add(ninosCheckBox, gbc);

       //Si hay niños extra
       JPanel extrasNinosPanel = new JPanel(new GridLayout(2, 2));
       extrasNinosPanel.setBackground(new Color(242,240,223));
       extrasNinosPanel.setBorder(BorderFactory.createTitledBorder("Extra Niños"));
       gbc.gridx = 0;
       gbc.gridy = 5;
       gbc.gridwidth = 2;
       this.add(extrasNinosPanel, gbc);
       
       JLabel edadNinosLabel = new JLabel("Edad de niños:");
       edadNinosLabel.setFont(etiquetaFont);
       extrasNinosPanel.add(edadNinosLabel);

       edadNinosSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
       extrasTextField = new JTextField();
       
       // Funcionalidad3: Asigna contenido al cuadro de texto cuando hay un cambio
       edadNinosSpinner.addChangeListener(new ChangeListener() {
		
		@Override
		public void stateChanged(ChangeEvent e) {
			 int edad = (int) edadNinosSpinner.getValue();
             if (edad >= 0 && edad <= 3) {
                 extrasTextField.setText("Cuna");
             } else if (edad >= 4 && edad <= 10) {
                 extrasTextField.setText("Cama supletoria pequeña");
             }
		}
	});
       
       extrasNinosPanel.add(edadNinosSpinner);

       JLabel extrasLabel = new JLabel("Extras:");
       extrasLabel.setFont(etiquetaFont);
       extrasNinosPanel.add(extrasLabel);

       extrasNinosPanel.add(extrasTextField);
       
       extrasNinosPanel.setEnabled(false);
       edadNinosLabel.setEnabled(false);
       edadNinosSpinner.setEnabled(false);
       extrasLabel.setEnabled(false);
       extrasTextField.setEnabled(false);

    // Funcionalidad2: Habilita/deshabilita el panel "Extras Niños" según el estado del checkbox
       ninosCheckBox.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(ninosCheckBox.isSelected()) {
				extrasNinosPanel.setEnabled(true);
				edadNinosLabel.setEnabled(true);
				edadNinosSpinner.setEnabled(true);
				extrasLabel.setEnabled(true);
				extrasTextField.setEnabled(true);
			}else {
				extrasNinosPanel.setEnabled(false);
				edadNinosLabel.setEnabled(false);
				edadNinosSpinner.setEnabled(false);
				extrasLabel.setEnabled(false);
				extrasTextField.setEnabled(false);
			}
		}
	});
      
    // Panel de Imágenes
      
       JPanel imagenesPanel = new JPanel(new GridLayout(1, 3, 1, 5));
       gbc.gridx = 0;
       gbc.gridy = 6;
       gbc.gridwidth = 4;
       
       this.add(imagenesPanel, gbc);

        
    // Importo y reescalo las imagenes
       String[] imageNames = {"/recursos/apartament.jpg", "/recursos/apartament2.jpg", "/recursos/apartament3.jpg",
    		   "/recursos/apartament5.jpg"};

       for (String imageName : imageNames) {
           ImageIcon imageIcon = new ImageIcon(getClass().getResource(imageName));
           Image scaledImage = imageIcon.getImage().getScaledInstance(250, 220, Image.SCALE_SMOOTH);
           imageIcon = new ImageIcon(scaledImage);
           imagenesPanel.add(new JLabel(imageIcon));
       }
       
       
  
     //Precio Minimo
       gbc.gridx = 1;
       gbc.gridy = 5;
       this.add(etiquetaPrecioMinimo,gbc);
       gbc.gridx = 3;
       gbc.gridy = 5;
       precioMinimo= new JTextField();
       precioMinimo.setPreferredSize(new Dimension(305,20));
       calcularPrecioMinimo();
       this.add(precioMinimo,gbc);
	}
	
	/**
	 * Obtener datos inmueble.
	 *
	 * @return the string
	 */
	public String obtenerDatosInmueble() {
		return "Dirección: "+ direccion.getText()+ "\n"+
				"  Provincia: "+ provinciaComboBox.getSelectedItem()+ "\n"+
				"  Fecha de Alta: "+ fechaAlta.getText()+ "\n"+
				"  Fecha de Disponibilidad: "+ fechaDisponibilidad.getText()+ "\n"+
				"  Nº de Huéspedes: "+ numHuespedes.getValue()+ "\n"+
				"  Nº de Dormitorios: "+ numDormitorios.getValue()+ "\n"+
				"  Nº de Baños: "+ numBanos.getValue()+ "\n"+
				"  Nº de Camas: "+ numCamasSpinner.getValue() + "\n"+
				"  Tipo de Camas: "+ tipoCamasComboBox.getSelectedIndex()+ "\n"+
				"  Extras: "+ extrasTextField.getText()+ "\n"+
				"  Precio Minimo: "+ precioMinimo.getText();
				
	}

	
	/**
	 * Limpiar datos.
	 */
	public void limpiarDatos() {
		direccion.setText("");
		provinciaComboBox.setSelectedIndex(0);
		fechaAlta.setValue(new Date());
		Calendar calendar = Calendar.getInstance();
	    calendar.add(Calendar.YEAR, 1);
		fechaDisponibilidad.setValue(calendar.getTime());
		numHuespedes.setValue(1);
		numDormitorios.setValue(1);
		numBanos.setValue(1);
		numCamasSpinner.setValue(0);
		tipoCamasComboBox.setSelectedIndex(0);
		ninosCheckBox.setSelected(false);
		edadNinosSpinner.setValue(0);
		extrasTextField.setText("");
		precioMinimo.setText("");
	}
	
	private void calcularPrecioMinimo() {
        // Obtenemos los valores de los componentes
        int banos = (int) numBanos.getValue();
        int camasSimples = 0, camasDobles = 0,sofasCama = 0;
        int cunasOCamasSupletorias;

        if (numCamasSpinner.getValue() == "Simple") {
        	 camasSimples = (int) numCamasSpinner.getValue();
        }else if(numCamasSpinner.getValue() == "Dobles") {
        	camasDobles = (int) numCamasSpinner.getValue();
        }else if(numCamasSpinner.getValue() == "Sofá cama") {
        	sofasCama = (int) numCamasSpinner.getValue();
        }
        
        if(extrasTextField.getText() != null) {
        	 cunasOCamasSupletorias = 12;
        }else {
        	cunasOCamasSupletorias = 0;
        }
        // Realiza el cálculo del precio mínimo
        int precioMinimoValor = camasDobles * 20 +
                sofasCama * 15 +
                camasSimples * 15 +
                banos * 25 +
                cunasOCamasSupletorias;

        // Muestra el resultado en el JTextField
        precioMinimo.setText(String.valueOf(precioMinimoValor));
    }
	
}
