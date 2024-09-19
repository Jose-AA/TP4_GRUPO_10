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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;


public class Ejercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;	
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtFechaNac;
	private JLabel lblResultado;
	private JLabel lblAdvertenciaTelefono;
	private JLabel lblAdvertenciaNombre;
	private JLabel lblAdvertenciaApellido;
	
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
		btnMostrar.addActionListener(new eventoBtnMostrar(txtNombre, txtApellido, txtTelefono, txtFechaNac));
		
		JLabel lblDatos = new JLabel("Los datos ingresados fueron: ");
		lblDatos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDatos.setBounds(59, 242, 172, 14);
		contentPane.add(lblDatos);
		
		lblResultado = new JLabel();
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblResultado.setBounds(59, 268, 366, 14);
		contentPane.add(lblResultado);
		
		
		lblAdvertenciaTelefono = new JLabel("");
		lblAdvertenciaTelefono.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAdvertenciaTelefono.setBounds(9, 130, 89, 14);
		contentPane.add(lblAdvertenciaTelefono);
		
		lblAdvertenciaNombre = new JLabel("");
		lblAdvertenciaNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAdvertenciaNombre.setBounds(9, 32, 89, 14);
		contentPane.add(lblAdvertenciaNombre);
		
		lblAdvertenciaApellido = new JLabel("");
		lblAdvertenciaApellido.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAdvertenciaApellido.setBounds(9, 82, 89, 14);
		contentPane.add(lblAdvertenciaApellido);
		
	}
	
	public void cambiarVisibilidad(boolean estado)
	{
		setVisible(true);
	}
	
	class eventoBtnMostrar implements ActionListener
	{
		//Creo variables para recibir los txt
		private JTextField txtNombre, txtApellido, txtTelefono, txtFechaNac;
		
		///Recibo los parametros mediante el constructor
		public eventoBtnMostrar(JTextField Nombre, JTextField Apellido, JTextField Telefono, JTextField FechaNac)
		{
			txtNombre = Nombre;
			txtApellido = Apellido;
			txtTelefono = Telefono;
			txtFechaNac = FechaNac;
		}
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
            boolean validarCampos = true;

            txtNombre.setBackground(Color.WHITE);
            txtApellido.setBackground(Color.WHITE);
            txtTelefono.setBackground(Color.WHITE);
            txtFechaNac.setBackground(Color.WHITE);

            //Valido si los campos estan vacios
            if (txtNombre.getText().trim().isEmpty()) { 
                txtNombre.setBackground(Color.RED);
                validarCampos = false;
            }
            if (txtApellido.getText().trim().isEmpty()) {
                txtApellido.setBackground(Color.RED);
                validarCampos = false;
            }
            if (txtTelefono.getText().trim().isEmpty()) {
                txtTelefono.setBackground(Color.RED);
                validarCampos = false;
            }
            //Valido que el textbox de telefono solo contenga numeros mediante expreison regular
            else if (!txtTelefono.getText().matches("\\d+")) 
            {
            txtTelefono.setBackground(Color.RED);
            lblAdvertenciaTelefono.setVisible(true);
            lblAdvertenciaTelefono.setForeground(Color.RED);
            lblAdvertenciaTelefono.setText("Solo numeros.");
            
            validarCampos = false;
            }
            //Validar solo letras en nombre y apellido
            if(!txtNombre.getText().matches("[a-zA-Z]+"))
            {
            	txtNombre.setBackground(Color.RED);
            	lblAdvertenciaNombre.setVisible(true);
            	lblAdvertenciaNombre.setForeground(Color.RED);
            	lblAdvertenciaNombre.setText("Solo letras.");
            	validarCampos = false;
            }
            if(!txtApellido.getText().matches("[a-zA-Z]+"))
            {
            	txtApellido.setBackground(Color.RED);
            	lblAdvertenciaApellido.setVisible(true);
            	lblAdvertenciaApellido.setForeground(Color.RED);
            	lblAdvertenciaApellido.setText("Solo letras.");
            	validarCampos = false;
            }
            if (txtFechaNac.getText().trim().isEmpty()) {
                txtFechaNac.setBackground(Color.RED);
                validarCampos = false;
            }

            if (validarCampos) {
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                String telefono = txtTelefono.getText();
                String fechaNac = txtFechaNac.getText();

                String resultado = nombre + " " + apellido + " | " + telefono + " | " + fechaNac;

                lblResultado.setText(resultado);

                ///Seteo los txt vacios
                txtNombre.setText("");
                txtApellido.setText("");
                txtTelefono.setText("");
                txtFechaNac.setText("");
                lblAdvertenciaTelefono.setText("");
            } 
            else 
            {
                lblResultado.setText("");
            }

		}	
			
		}
}