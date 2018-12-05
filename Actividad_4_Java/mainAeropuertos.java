
Creacion de un Programa que Filtre aeropuertos segun un nombre/ciudada pasados.

```java

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javafx.scene.control.ComboBox;

import java.nio.file.*;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class mainAeropuertos extends JFrame {
	static ArrayList<Aeropuerto> aviones = new ArrayList<Aeropuerto>();
	static File f1 = new File("aeropuertos.txt");

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 * 
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		DescargarDatos();
		 muestraContenido(f1);

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainAeropuertos frame = new mainAeropuertos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/**
	 * Create the frame.
	 */
	public mainAeropuertos() {
		setTitle("Filtrado de Aeropuertos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 262);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setBounds(42, 73, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JComboBox<Aeropuerto> comboBox = new JComboBox<Aeropuerto>();
		comboBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Aeropuerto a = new Aeropuerto((Aeropuerto)comboBox.getSelectedItem());
				try {
					Desktop.getDesktop().browse(new URI("https://www.google.com/maps/search/?api=1&query="+a.getCoordenada1()+","+a.getCoordenadas2()));
				} catch (IOException | URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
	
		comboBox.setBounds(157, 73, 372, 20);
		contentPane.add(comboBox);

		JButton btnNewButton = new JButton("Buscar");

		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				
				for (int i = 0; i < aviones.size(); i++) {
					if (aviones.get(i).getNombre().toLowerCase().contains(textField.getText().toLowerCase())
							|| aviones.get(i).getCiudad().toLowerCase().contains(textField.getText().toLowerCase())) {
						
						comboBox.addItem(aviones.get(i));

					}

				}
			}
		});
		
		
		
		btnNewButton.setBounds(42, 113, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblIntroduce = new JLabel("Introduce el aeropuerto a buscar :");
		lblIntroduce.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIntroduce.setBounds(10, 31, 201, 23);
		contentPane.add(lblIntroduce);

	}

	public static void DescargarDatos() throws IOException {
		
		URL aeropuertos = new URL("https://raw.githubusercontent.com/jpatokal/openflights/master/data/airports.dat");
		java.net.URLConnection conn = aeropuertos.openConnection();

		
			String linea;
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			FileWriter fw = new FileWriter(f1);
            BufferedWriter bw  = new BufferedWriter(fw);
            
            


            while ((linea = br.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
                
            		}
        
            
            bw.close();
	
	}



	public static void muestraContenido(File f1) throws FileNotFoundException, IOException {
	      String cadena;

	      FileReader f = new FileReader(f1);
	      BufferedReader b = new BufferedReader(f);
	      
	      
	      while((cadena = b.readLine())!=null) {
	         String[] avion = cadena.split(",");
	         
	        	 
	        	 
	        	 aviones.add(new Aeropuerto(avion[0],avion[1],avion[2],avion[3],avion[4],avion[6],avion[7]));
	         }
	      b.close();
	      }
	}
	




```
