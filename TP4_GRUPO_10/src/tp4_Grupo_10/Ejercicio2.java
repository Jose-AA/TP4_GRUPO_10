package tp4_Grupo_10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;

public class Ejercicio2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JLabel lblNotaTps;
	private JComboBox cmbNotaTp;

	public Ejercicio2() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 505, 342);
		setTitle("Promedio");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{111, 32, 31, 86, 0};
		gbl_contentPane.rowHeights = new int[]{61, 0, 0, 20, 0, 31, 20, 31, 20, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNota1 = new JLabel("Nota 1");
		GridBagConstraints gbc_lblNota1 = new GridBagConstraints();
		gbc_lblNota1.anchor = GridBagConstraints.WEST;
		gbc_lblNota1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNota1.gridx = 1;
		gbc_lblNota1.gridy = 1;
		contentPane.add(lblNota1, gbc_lblNota1);
		
		txtNota1 = new JTextField();
		GridBagConstraints gbc_txtNota1 = new GridBagConstraints();
		gbc_txtNota1.anchor = GridBagConstraints.WEST;
		gbc_txtNota1.fill = GridBagConstraints.VERTICAL;
		gbc_txtNota1.insets = new Insets(0, 0, 5, 0);
		gbc_txtNota1.gridx = 3;
		gbc_txtNota1.gridy = 1;
		contentPane.add(txtNota1, gbc_txtNota1);
		txtNota1.setColumns(10);
		
		JLabel lblNota2 = new JLabel("Nota 2");
		GridBagConstraints gbc_lblNota2 = new GridBagConstraints();
		gbc_lblNota2.anchor = GridBagConstraints.WEST;
		gbc_lblNota2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNota2.gridx = 1;
		gbc_lblNota2.gridy = 4;
		contentPane.add(lblNota2, gbc_lblNota2);
		
		txtNota2 = new JTextField();
		GridBagConstraints gbc_txtNota2 = new GridBagConstraints();
		gbc_txtNota2.anchor = GridBagConstraints.NORTHWEST;
		gbc_txtNota2.insets = new Insets(0, 0, 5, 0);
		gbc_txtNota2.gridx = 3;
		gbc_txtNota2.gridy = 4;
		contentPane.add(txtNota2, gbc_txtNota2);
		txtNota2.setColumns(10);
		
		JLabel lblNota3 = new JLabel("Nota 3");
		GridBagConstraints gbc_lblNota3 = new GridBagConstraints();
		gbc_lblNota3.anchor = GridBagConstraints.WEST;
		gbc_lblNota3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNota3.gridx = 1;
		gbc_lblNota3.gridy = 6;
		contentPane.add(lblNota3, gbc_lblNota3);
		
		cmbNotaTp = new JComboBox();
		
		txtNota3 = new JTextField();
		GridBagConstraints gbc_txtNota3 = new GridBagConstraints();
		gbc_txtNota3.insets = new Insets(0, 0, 5, 0);
		gbc_txtNota3.anchor = GridBagConstraints.NORTHWEST;
		gbc_txtNota3.gridx = 3;
		gbc_txtNota3.gridy = 6;
		contentPane.add(txtNota3, gbc_txtNota3);
		txtNota3.setColumns(10);
		
		lblNotaTps = new JLabel("Nota TPs");
		GridBagConstraints gbc_lblNotaTps = new GridBagConstraints();
		gbc_lblNotaTps.insets = new Insets(0, 0, 5, 5);
		gbc_lblNotaTps.gridx = 1;
		gbc_lblNotaTps.gridy = 8;
		contentPane.add(lblNotaTps, gbc_lblNotaTps);
		GridBagConstraints gbc_cmbNotaTp_1 = new GridBagConstraints();
		gbc_cmbNotaTp_1.insets = new Insets(0, 0, 5, 0);
		gbc_cmbNotaTp_1.anchor = GridBagConstraints.WEST;
		gbc_cmbNotaTp_1.gridx = 3;
		gbc_cmbNotaTp_1.gridy = 8;
		JComboBox<String> cmbNotaTp_1 = new JComboBox<>();
		cmbNotaTp_1.addItem("Aprobado");
		cmbNotaTp_1.addItem("Desaprobado");
		contentPane.add(cmbNotaTp_1, gbc_cmbNotaTp_1);
	}

	
	public void cambiarVisibilidad(boolean estado)
	{
		setVisible(true);
	}
}
