package tp4_Grupo_10;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	
	public Ejercicio3() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 505, 376);
		setTitle("Seleccion multiple");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(35, 32, 415, 50);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblElijeUnSistema = new JLabel("Elije un sistema operativo");
		lblElijeUnSistema.setBounds(12, 17, 162, 16);
		lblElijeUnSistema.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(lblElijeUnSistema);
		
		JRadioButton rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnWindows.setBounds(177, 13, 85, 25);
		panel.add(rdbtnWindows);
		
		JRadioButton rdbtnMac_1 = new JRadioButton("Mac");
		rdbtnMac_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnMac_1.setBounds(269, 13, 57, 25);
		panel.add(rdbtnMac_1);
		
		JRadioButton rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnLinux.setBounds(333, 13, 61, 25);
		panel.add(rdbtnLinux);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbtnWindows);
		grupo.add(rdbtnMac_1);
		grupo.add(rdbtnLinux);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(35, 105, 415, 106);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblElijeUnaEspecialidad = new JLabel("Elije una especialidad");
		lblElijeUnaEspecialidad.setBounds(26, 46, 157, 15);
		lblElijeUnaEspecialidad.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(lblElijeUnaEspecialidad);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Programaci\u00F3n");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxNewCheckBox.setBounds(225, 9, 122, 25);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxAdministracion = new JCheckBox("Administraci\u00F3n");
		chckbxAdministracion.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxAdministracion.setBounds(225, 41, 122, 25);
		panel_1.add(chckbxAdministracion);
		
		JCheckBox chckbxDiseoGrafico = new JCheckBox("Dise\u00F1o Gr\u00E1fico");
		chckbxDiseoGrafico.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxDiseoGrafico.setBounds(225, 73, 122, 25);
		panel_1.add(chckbxDiseoGrafico);
		
		JLabel lblNewLabel = new JLabel("Cantidad de horas en el computador:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(45, 233, 240, 27);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(297, 235, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("ACEPTAR");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				if(!rdbtnWindows.isSelected() && !rdbtnMac_1.isSelected() && !rdbtnLinux.isSelected()) {
					JOptionPane.showMessageDialog(contentPane,"Error", "Debe marcar al menos un S.O.", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				
				Boolean chkSelected = false;
				
				if(chckbxNewCheckBox.isSelected() || chckbxAdministracion.isSelected() || chckbxDiseoGrafico.isSelected()) {
					chkSelected = true;
				}
				
				if(chkSelected == false) {
					JOptionPane.showMessageDialog(contentPane,"Error", "Debe marcar al menos una especialidad", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				
				JOptionPane.showMessageDialog(contentPane,"Test", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(327, 291, 106, 25);
		contentPane.add(btnNewButton);
	}
		
		public void cambiarVisibilidad(boolean estado)
		{
			setVisible(true);
		}
}
