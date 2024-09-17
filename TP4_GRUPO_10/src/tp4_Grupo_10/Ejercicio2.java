package tp4_Grupo_10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

//import net.miginfocom.swing.MigLayout;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
//import com.jgoodies.forms.layout.FormSpecs;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JLabel lblNotaTps;
	private JComboBox cmbNotaTp;
	private JTextField textField;
	private JTextField textField_1;

	public Ejercicio2() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 505, 350);
		setTitle("Promedio");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cmbNotaTp = new JComboBox();
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(25, 23, 304, 145);
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{27, 70, 192, 0};
		gbl_panel.rowHeights = new int[]{30, 30, 30, 30, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNota1 = new JLabel("Nota 1:");
		GridBagConstraints gbc_lblNota1 = new GridBagConstraints();
		gbc_lblNota1.anchor = GridBagConstraints.WEST;
		gbc_lblNota1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNota1.gridx = 1;
		gbc_lblNota1.gridy = 0;
		panel.add(lblNota1, gbc_lblNota1);
		
		txtNota1 = new JTextField();
		GridBagConstraints gbc_txtNota1 = new GridBagConstraints();
		gbc_txtNota1.anchor = GridBagConstraints.WEST;
		gbc_txtNota1.insets = new Insets(0, 0, 5, 0);
		gbc_txtNota1.gridx = 2;
		gbc_txtNota1.gridy = 0;
		panel.add(txtNota1, gbc_txtNota1);
		txtNota1.setColumns(10);
		
		JLabel lblNota2 = new JLabel("Nota 2:");
		GridBagConstraints gbc_lblNota2 = new GridBagConstraints();
		gbc_lblNota2.anchor = GridBagConstraints.WEST;
		gbc_lblNota2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNota2.gridx = 1;
		gbc_lblNota2.gridy = 1;
		panel.add(lblNota2, gbc_lblNota2);
		
		txtNota2 = new JTextField();
		GridBagConstraints gbc_txtNota2 = new GridBagConstraints();
		gbc_txtNota2.anchor = GridBagConstraints.WEST;
		gbc_txtNota2.insets = new Insets(0, 0, 5, 0);
		gbc_txtNota2.gridx = 2;
		gbc_txtNota2.gridy = 1;
		panel.add(txtNota2, gbc_txtNota2);
		txtNota2.setColumns(10);
		
		JLabel lblNota3 = new JLabel("Nota 3:");
		GridBagConstraints gbc_lblNota3 = new GridBagConstraints();
		gbc_lblNota3.anchor = GridBagConstraints.WEST;
		gbc_lblNota3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNota3.gridx = 1;
		gbc_lblNota3.gridy = 2;
		panel.add(lblNota3, gbc_lblNota3);
		
		txtNota3 = new JTextField();
		GridBagConstraints gbc_txtNota3 = new GridBagConstraints();
		gbc_txtNota3.anchor = GridBagConstraints.WEST;
		gbc_txtNota3.insets = new Insets(0, 0, 5, 0);
		gbc_txtNota3.gridx = 2;
		gbc_txtNota3.gridy = 2;
		panel.add(txtNota3, gbc_txtNota3);
		txtNota3.setColumns(10);
		
		lblNotaTps = new JLabel("TPs");
		GridBagConstraints gbc_lblNotaTps = new GridBagConstraints();
		gbc_lblNotaTps.anchor = GridBagConstraints.WEST;
		gbc_lblNotaTps.insets = new Insets(0, 0, 0, 5);
		gbc_lblNotaTps.gridx = 1;
		gbc_lblNotaTps.gridy = 3;
		panel.add(lblNotaTps, gbc_lblNotaTps);
		JComboBox<String> cmbNotaTp_1 = new JComboBox<>();
		GridBagConstraints gbc_cmbNotaTp_1 = new GridBagConstraints();
		gbc_cmbNotaTp_1.anchor = GridBagConstraints.WEST;
		gbc_cmbNotaTp_1.gridx = 2;
		gbc_cmbNotaTp_1.gridy = 3;
		panel.add(cmbNotaTp_1, gbc_cmbNotaTp_1);
		cmbNotaTp_1.addItem("Aprobado");
		cmbNotaTp_1.addItem("Desaprobado");
		
		JButton btnNewButton = new JButton("CALCULAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(339, 23, 124, 48);
		contentPane.add(btnNewButton);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNuevo.setBounds(339, 72, 124, 48);
		contentPane.add(btnNuevo);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(339, 121, 124, 48);
		contentPane.add(btnSalir);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(25, 181, 304, 99);
		contentPane.add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{27, 70, 192, 0};
		gbl_panel_1.rowHeights = new int[]{30, 30, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblPromedio = new JLabel("Promedio:");
		GridBagConstraints gbc_lblPromedio = new GridBagConstraints();
		gbc_lblPromedio.anchor = GridBagConstraints.WEST;
		gbc_lblPromedio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPromedio.gridx = 1;
		gbc_lblPromedio.gridy = 0;
		panel_1.add(lblPromedio, gbc_lblPromedio);
		
		textField = new JTextField();
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.WEST;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 0;
		panel_1.add(textField, gbc_textField);
		
		JLabel lblCondicion = new JLabel("Condicion");
		GridBagConstraints gbc_lblCondicion = new GridBagConstraints();
		gbc_lblCondicion.anchor = GridBagConstraints.WEST;
		gbc_lblCondicion.insets = new Insets(0, 0, 0, 5);
		gbc_lblCondicion.gridx = 1;
		gbc_lblCondicion.gridy = 1;
		panel_1.add(lblCondicion, gbc_lblCondicion);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.anchor = GridBagConstraints.WEST;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 1;
		panel_1.add(textField_1, gbc_textField_1);
	}

	
	public void cambiarVisibilidad(boolean estado)
	{
		setVisible(true);
	}
}
