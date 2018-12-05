# Actividad_2_Procesos
Programa simlador de una BARRA DE TAREAS el cual abre mis aplicaciones mas utilizadas.


```java



import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Window.Type;

public class Actividad_2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Actividad_2 frame = new Actividad_2();
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
	public Actividad_2() {
		setType(Type.POPUP);
		setTitle("Desarrollar una barra de tareas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 838, 144);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(10, 11, 784, 48);
		toolBar.setBackground(SystemColor.activeCaption);
		contentPane.add(toolBar);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		toolBar.add(panel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.activeCaption);
		panel.add(panel_4);
		
		JButton btnApp1 = new JButton("Aplicacion 1:Internet");
		panel_4.add(btnApp1);
		btnApp1.setHorizontalAlignment(SwingConstants.LEFT);
		btnApp1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProcessBuilder pb = new ProcessBuilder("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe","");
				try {
					pb.start();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel.add(panel_1);
		
		
		JButton btnApp2 = new JButton("Aplicacion 2: Spotify");
		btnApp2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProcessBuilder pb = new ProcessBuilder("C:\\Users\\vesprada\\AppData\\Roaming\\Spotify\\Spotify.exe","");
				try {
					pb.start();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		panel_1.add(btnApp2);
		btnApp2.setVerticalAlignment(SwingConstants.TOP);
		btnApp2.setHorizontalAlignment(SwingConstants.LEADING);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.activeCaption);
		panel.add(panel_2);
		
		JButton btnApp3 = new JButton("Aplicacion 3: Eclipse");
		btnApp3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProcessBuilder pb = new ProcessBuilder("C:\\Users\\vesprada\\eclipse\\java-photon\\eclipse\\eclipse.exe","");
				try {
					pb.start();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnApp3.setVerticalAlignment(SwingConstants.TOP);
		btnApp3.setHorizontalAlignment(SwingConstants.LEADING);
		panel_2.add(btnApp3);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setBackground(SystemColor.activeCaption);
		
		JButton btnApp4 = new JButton("Aplicacion 4: CMD");
		btnApp4.setVerticalAlignment(SwingConstants.TOP);
		btnApp4.setHorizontalAlignment(SwingConstants.LEADING);
		panel_3.add(btnApp4);
		btnApp4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/C", "start");
					pb.start();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	}
}




´´´
