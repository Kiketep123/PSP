




import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.awt.event.ActionEvent;

public class Actividad_3 extends JFrame {

	private JPanel contentPane;
	private final JComboBox comboBox = new JComboBox();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Actividad_3 frame = new Actividad_3();
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
	public Actividad_3() {
		setTitle("Abrir aplicaciones del SO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 437, 187);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(143, 188, 143));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.setBorder(new TitledBorder(null, "Elige que elemento deseas visualizar :", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(22, 19, 373, 107);
		contentPane.add(panel);
		panel.setLayout(null);
		comboBox.setBounds(10, 49, 223, 20);
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Aplicacion de PDF", "Abrir una hoja de calculo", "Version Instalada de Java"}));
		
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(comboBox.getSelectedItem().toString()) {
				case "Aplicacion de PDF":
					try {
						Process p = Runtime.getRuntime().exec("C:\\Program Files (x86)\\Adobe\\Acrobat Reader DC\\Reader\\AcroRd32.exe");
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					break;
				case "Abrir una hoja de calculo":
					try {
						Process p = Runtime.getRuntime().exec("C:\\Program Files\\LibreOffice\\program\\scalc.exe");
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					break;
				case "Version Instalada de Java":

					try {


						String line;
						Process p = Runtime.getRuntime().exec("cmd.bat");
					
						
						BufferedReader input =  
						        new BufferedReader  
						          (new InputStreamReader(p.getInputStream()));  
						
						      while ((line = input.readLine()) != null) {  
						        System.out.println(line);  
						      }  
						      input.close();  
						    
							    
							      
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
					
					break;
					
					
				
				}
			}
		});
		
		
	}
}





