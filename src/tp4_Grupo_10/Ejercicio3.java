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
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio3 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtHoras;
    private JRadioButton rdbtnWindows;
    private JRadioButton rdbtnMac_1;
    private JRadioButton rdbtnLinux;
    private JCheckBox chckbxProgramacion;
    private JCheckBox chckbxAdministracion;
    private JCheckBox chckbxDiseoGrafico;
    private JButton btnAceptar;
	
	public Ejercicio3() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 505, 376);
		setTitle("Seleccion multiple");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelSO = new JPanel();
		panelSO.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelSO.setBounds(35, 32, 415, 50);
		contentPane.add(panelSO);
		panelSO.setLayout(null);
		
		JLabel lblElijeUnSistema = new JLabel("Elije un sistema operativo");
		lblElijeUnSistema.setBounds(12, 17, 162, 16);
		lblElijeUnSistema.setFont(new Font("Tahoma", Font.BOLD, 12));
		panelSO.add(lblElijeUnSistema);
		
		rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnWindows.setBounds(177, 13, 85, 25);
		panelSO.add(rdbtnWindows);
		
		rdbtnMac_1 = new JRadioButton("Mac");
		rdbtnMac_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnMac_1.setBounds(269, 13, 57, 25);
		panelSO.add(rdbtnMac_1);
		
		rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnLinux.setBounds(333, 13, 61, 25);
		panelSO.add(rdbtnLinux);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbtnWindows);
		grupo.add(rdbtnMac_1);
		grupo.add(rdbtnLinux);
		
		JPanel panelEspecialidad = new JPanel();
		panelEspecialidad.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelEspecialidad.setBounds(35, 105, 415, 106);
		contentPane.add(panelEspecialidad);
		panelEspecialidad.setLayout(null);
		
		JLabel lblElijeUnaEspecialidad = new JLabel("Elije una especialidad");
		lblElijeUnaEspecialidad.setBounds(26, 46, 157, 15);
		lblElijeUnaEspecialidad.setFont(new Font("Tahoma", Font.BOLD, 12));
		panelEspecialidad.add(lblElijeUnaEspecialidad);
		
		chckbxProgramacion = new JCheckBox("Programaci\u00F3n");
		chckbxProgramacion.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxProgramacion.setBounds(225, 9, 122, 25);
		panelEspecialidad.add(chckbxProgramacion);
		
		chckbxAdministracion = new JCheckBox("Administraci\u00F3n");
		chckbxAdministracion.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxAdministracion.setBounds(225, 41, 122, 25);
		panelEspecialidad.add(chckbxAdministracion);
		
		chckbxDiseoGrafico = new JCheckBox("Dise\u00F1o Gr\u00E1fico");
		chckbxDiseoGrafico.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxDiseoGrafico.setBounds(225, 73, 122, 25);
		panelEspecialidad.add(chckbxDiseoGrafico);
		
		JLabel lblHoras = new JLabel("Cantidad de horas en el computador:");
		lblHoras.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHoras.setBounds(45, 233, 240, 27);
		contentPane.add(lblHoras);
		
		txtHoras = new JTextField();
		txtHoras.setBounds(297, 235, 116, 22);
		contentPane.add(txtHoras);
		txtHoras.setColumns(10);
		
		btnAceptar = new JButton("ACEPTAR");
		btnAceptar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				if(!rdbtnWindows.isSelected() && !rdbtnMac_1.isSelected() && !rdbtnLinux.isSelected()) {
					JOptionPane.showMessageDialog(contentPane, "Debe marcar al menos un S.O.", "Error", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				
				Boolean chkSelected = false;
				
				if(chckbxProgramacion.isSelected() || chckbxAdministracion.isSelected() || chckbxDiseoGrafico.isSelected()) {
					chkSelected = true;
				}
				
				if (chkSelected == false) {
				    JOptionPane.showMessageDialog(contentPane, "Debe marcar al menos una especialidad", "Error", JOptionPane.INFORMATION_MESSAGE);
				    return;
				}

				String inputText = txtHoras.getText();

				if (inputText.isEmpty()) {
				    JOptionPane.showMessageDialog(contentPane, "No ha indicado la cantidad de horas", "Error", JOptionPane.INFORMATION_MESSAGE);
				    return;
				}

				if (!inputText.matches("\\d+")) {
				    JOptionPane.showMessageDialog(contentPane, "Solo se permiten números", "Error", JOptionPane.INFORMATION_MESSAGE);
				    return;
				}

			    
			    String soSeleccionado = "";
		        if (rdbtnWindows.isSelected()) {
		            soSeleccionado = "Windows";
		        } else if (rdbtnMac_1.isSelected()) {
		            soSeleccionado = "Mac";
		        } else if (rdbtnLinux.isSelected()) {
		            soSeleccionado = "Linux";
		        }

		        String especialidadesSeleccionadas = "";
		        if (chckbxProgramacion.isSelected()) {
		            especialidadesSeleccionadas += "Programación ";
		        }
		        if (chckbxAdministracion.isSelected()) {
		            especialidadesSeleccionadas += "Administración ";
		        }
		        if (chckbxDiseoGrafico.isSelected()) {
		            especialidadesSeleccionadas += "Diseño Gráfico ";
		        }

		        String mensajeFinal = "S.O. seleccionado: " + soSeleccionado + 
		                              "\nEspecialidades seleccionadas: " + especialidadesSeleccionadas.toString() + 
		                              "\nHoras indicadas: " + inputText;
		        
		        JOptionPane.showMessageDialog(contentPane, mensajeFinal, "Resumen", JOptionPane.INFORMATION_MESSAGE);
			}
			
			
			
		});
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnAceptar.setBounds(327, 291, 106, 25);
		contentPane.add(btnAceptar);
	}
		
		public void cambiarVisibilidad(boolean estado)
		{
			setVisible(true);
		}
}
