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
		
		JButton btnNewButton = new JButton("Ejercicio 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejercicio1 Ventana1 = new Ejercicio1();
				Ventana1.cambiarVisibilidad(true);
			}
		});
		btnNewButton.setBounds(196, 52, 108, 42);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ejercicio 2");
		btnNewButton_1.setBounds(196, 123, 108, 42);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Ejercicio 3");
		btnNewButton_2.setBounds(196, 192, 108, 42);
		contentPane.add(btnNewButton_2);
			
	}
	
	public void cambiarVisibilidad(boolean estado)
	{
		setVisible(true);
	}
	
	
	

}
