package tp4_Grupo_10;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Ejercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;	
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtFechaNac;
	public Ejercicio1() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 505, 342);
		setTitle("Contactos");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNombre.setBounds(108, 36, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblApellido.setBounds(108, 85, 46, 14);
		contentPane.add(lblApellido);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTelefono.setBounds(108, 130, 54, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblFechaNac = new JLabel("Fecha Nac.");
		lblFechaNac.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFechaNac.setBounds(108, 173, 70, 14);
		contentPane.add(lblFechaNac);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(215, 33, 172, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(215, 82, 172, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(215, 127, 172, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		txtFechaNac = new JTextField();
		txtFechaNac.setBounds(215, 170, 172, 20);
		contentPane.add(txtFechaNac);
		txtFechaNac.setColumns(10);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(298, 201, 89, 23);
		contentPane.add(btnMostrar);
		
		JLabel lblDatos = new JLabel("Los datos ingresados fueron: ");
		lblDatos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDatos.setBounds(59, 261, 172, 14);
		contentPane.add(lblDatos);
		
		JLabel lblResultado = new JLabel("Aqui van los datos");
		lblResultado.setBounds(273, 261, 172, 14);
		contentPane.add(lblResultado);
	}
	
	public void cambiarVisibilidad(boolean estado)
	{
		setVisible(true);
	}
}