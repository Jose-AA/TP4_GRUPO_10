package tp4_Grupo_10;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaContenedora extends JFrame {

	private static final long serialVersionUID = 1L;	
	private JPanel contentPane;
	public VentanaContenedora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 342);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEjercicio1 = new JButton("Ejercicio 1");
		btnEjercicio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejercicio1 Ventana1 = new Ejercicio1();
				Ventana1.cambiarVisibilidad(true);
			}
		});
		btnEjercicio1.setBounds(196, 52, 108, 42);
		contentPane.add(btnEjercicio1);
		
		JButton btnEjercicio2 = new JButton("Ejercicio 2");
		btnEjercicio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejercicio2 ventana2 = new Ejercicio2();
				ventana2.cambiarVisibilidad(true);
			}
		});
		btnEjercicio2.setBounds(196, 123, 108, 42);
		contentPane.add(btnEjercicio2);
		
		JButton btnEjercicio3 = new JButton("Ejercicio 3");
		btnEjercicio3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejercicio3 Ventana3 = new Ejercicio3();
				Ventana3.cambiarVisibilidad(true);
			}
		});
		btnEjercicio3.setBounds(196, 192, 108, 42);
		contentPane.add(btnEjercicio3);
			
	}
	
	public void cambiarVisibilidad(boolean estado)
	{
		setVisible(true);
	}
	
	
	

}
