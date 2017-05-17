package Vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;
import Controlador.ControladorImpl;
import Modelo.Modelo;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame implements Vista {

	private ControladorImpl controlador=new ControladorImpl();
	
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private ButtonGroup botones= new ButtonGroup();
	/**ct
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.r
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(153, 83, 105, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(153, 139, 105, 20);
		contentPane.add(passwordField);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setForeground(new Color(255, 255, 255));
		lblUsuario.setBounds(187, 61, 46, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setForeground(new Color(255, 255, 255));
		lblContrasea.setBounds(176, 114, 71, 14);
		contentPane.add(lblContrasea);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//new MenuInicio().setVisible(true);

				controlador.pasarMenuInicio();
				dispose();
			}
		});
		btnNewButton.setBounds(153, 192, 105, 23);
		contentPane.add(btnNewButton);
	}
	@Override
	public void setControlador(Controlador controlador) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setModelo(Modelo modelo) {
		// TODO Auto-generated method stub
		
	}
}
