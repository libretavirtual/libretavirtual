package Paneles;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import java.awt.SystemColor;
import javax.swing.border.MatteBorder;

import Controlador.Consultas;
import Principal.MaterialButton;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.MouseInfo;
import java.awt.Point;

import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import jpass.JRPasswordField;
import Principal.MaterialTextField;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Registro extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int x,y;
	/**
	 * Create the panel.
	 */
	public Registro(JFrame frame,JPanel panelcontenedordalso) {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 490, 514);
		add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 153, 255));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 102, 255)));
		panel_2.setBackground(SystemColor.textHighlight);
		panel_2.setBounds(0, 0, 490, 31);
		panel_1.add(panel_2);
		
		JLabel label = new JLabel("-");
		label.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 102, 255)));
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label.setBackground(new Color(30, 144, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				label.setBackground(SystemColor.textHighlight);
			}
			@SuppressWarnings({ "deprecation", "static-access" })
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setExtendedState(frame.CROSSHAIR_CURSOR);
			}
		});
		label.setOpaque(true);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 25));
		label.setBackground(SystemColor.textHighlight);
		label.setBounds(428, 0, 31, 31);
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("X");
		label_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 102, 255)));
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				label_1.setBackground(new Color(30, 144, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				label_1.setBackground(SystemColor.textHighlight);
			}
		});
		label_1.setOpaque(true);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_1.setBackground(SystemColor.textHighlight);
		label_1.setBounds(459, 0, 31, 31);
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.addMouseMotionListener(new MouseMotionAdapter() {
			
			public void mouseDragged(MouseEvent e) {
				Point point = MouseInfo.getPointerInfo().getLocation();
				frame.setLocation(point.x - x, point.y - y);
			}
		});
		label_2.addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {
				 x = e.getX();
	             y = e.getY();
			}
		});
		label_2.setBounds(0, 0, 428, 31);
		panel_2.add(label_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(10, 42, 470, 461);
		panel_1.add(panel_3);
		
		JLabel label_3 = new JLabel("Registro");
		label_3.setBounds(10, 0, 460, 39);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(SystemColor.textHighlight);
		label_3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 30));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 45, 470, 313);
		panel_4.setForeground(SystemColor.textHighlight);
		panel_4.setBackground(Color.WHITE);
		
		JLabel label_4 = new JLabel("Datos Personales");
		label_4.setForeground(Color.BLACK);
		label_4.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		
		JLabel label_5 = new JLabel("Contrase\u00F1a");
		label_5.setForeground(Color.BLACK);
		label_5.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		
		JLabel label_6 = new JLabel("Nombre de usuario");
		label_6.setForeground(Color.BLACK);
		label_6.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		
		JLabel label_7 = new JLabel("Repetir contrase\u00F1a");
		label_7.setForeground(Color.BLACK);
		label_7.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		
		JLabel label_8 = new JLabel("Apellido");
		label_8.setForeground(Color.BLACK);
		label_8.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		
		JLabel label_9 = new JLabel("Correo electronico");
		label_9.setForeground(Color.BLACK);
		label_9.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		
		JLabel label_10 = new JLabel("Nombre ");
		label_10.setForeground(Color.BLACK);
		label_10.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		
		JRPasswordField passwordField = new JRPasswordField();
		passwordField.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(220, 220, 220)));
		passwordField.setBackground(new Color(245, 245, 245));
		
		JRPasswordField passwordField_1 = new JRPasswordField();
		passwordField_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(220, 220, 220)));
		passwordField_1.setBackground(new Color(245, 245, 245));
		
		MaterialTextField txtApellido = new MaterialTextField();
		txtApellido.setSelectionColor(SystemColor.textHighlight);
		txtApellido.setBackground(new Color(245, 245, 245));
		
		MaterialTextField txtNombre = new MaterialTextField();
		txtNombre.setSelectionColor(SystemColor.textHighlight);
		txtNombre.setBackground(new Color(245, 245, 245));
		
		MaterialTextField txtCorreo = new MaterialTextField();
		txtCorreo.setSelectionColor(SystemColor.textHighlight);
		txtCorreo.setBackground(new Color(245, 245, 245));
		
		MaterialTextField txtUsuario = new MaterialTextField();
		txtUsuario.setSelectionColor(SystemColor.textHighlight);
		txtUsuario.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtUsuario.setBackground(new Color(245, 245, 245));
		
		JLabel errnom = new JLabel("*");
		errnom.setVisible(false);
		errnom.setForeground(Color.RED);
		errnom.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		
		JLabel errrepetircontra = new JLabel("*");
		errrepetircontra.setVisible(false);
		errrepetircontra.setForeground(Color.RED);
		errrepetircontra.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		
		JLabel errusr = new JLabel("*");
		errusr.setVisible(false);
		errusr.setForeground(Color.RED);
		errusr.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		
		JLabel errcontra = new JLabel("*");
		errcontra.setVisible(false);
		errcontra.setForeground(Color.RED);
		errcontra.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		
		JLabel errape = new JLabel("*");
		errape.setVisible(false);
		errape.setForeground(Color.RED);
		errape.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		
		JLabel errcorreo = new JLabel("*");
		errcorreo.setVisible(false);
		errcorreo.setForeground(Color.RED);
		errcorreo.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		
		JLabel label_17 = new JLabel("Profesor");
		label_17.setForeground(Color.BLACK);
		label_17.setFont(new Font("Microsoft YaHei", Font.BOLD, 13));
		
		JRadioButton radioButton = new JRadioButton("");
		radioButton.setBackground(Color.WHITE);
		JRadioButton radioButton_1 = new JRadioButton("");
		radioButton_1.setBackground(Color.WHITE);
		
		radioButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				radioButton_1.setSelected(true);
				radioButton.setSelected(false);
			}
		});
		
		radioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				radioButton.setSelected(true);
				radioButton_1.setSelected(false);
			}
		});
		
		
		JLabel label_18 = new JLabel("Alumno");
		label_18.setForeground(Color.BLACK);
		label_18.setFont(new Font("Microsoft YaHei", Font.BOLD, 13));
		
		
		
		JLabel errcombox = new JLabel("*");
		errcombox.setVisible(false);
		errcombox.setForeground(Color.RED);
		errcombox.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		
		JLabel label_20 = new JLabel("Datos de usuario");
		label_20.setForeground(Color.BLACK);
		label_20.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 460, Short.MAX_VALUE)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(label_4, GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_4.createSequentialGroup()
									.addGap(9)
									.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
										.addComponent(label_5)
										.addComponent(label_6)
										.addComponent(label_7)
										.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_9)))
								.addGroup(gl_panel_4.createSequentialGroup()
									.addGap(10)
									.addComponent(label_10)))
							.addGap(18)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_4.createSequentialGroup()
									.addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_panel_4.createSequentialGroup()
									.addComponent(passwordField_1, GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addComponent(txtApellido, GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
								.addComponent(txtNombre, GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
								.addComponent(txtCorreo, GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
								.addGroup(gl_panel_4.createSequentialGroup()
									.addComponent(txtUsuario, GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_4.createSequentialGroup()
									.addGap(17)
									.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
										.addComponent(errnom, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
										.addComponent(errrepetircontra, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
										.addComponent(errusr, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
										.addComponent(errcontra, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
										.addComponent(errape, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel_4.createSequentialGroup()
									.addGap(18)
									.addComponent(errcorreo, GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGap(77)
							.addComponent(label_17, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(radioButton)
							.addGap(51)
							.addComponent(label_18, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(radioButton_1)
							.addGap(26)
							.addComponent(errcombox, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_20, GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE))
					.addGap(25))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 313, Short.MAX_VALUE)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(label_4)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(errnom)
						.addComponent(label_10)
						.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(errape)
						.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_9)
						.addComponent(txtCorreo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(errcorreo, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(label_20, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_6)
						.addComponent(errusr, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_5)
						.addComponent(errcontra, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(passwordField_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_7)
						.addComponent(errrepetircontra)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
							.addComponent(radioButton)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.TRAILING)
								.addComponent(label_18)
								.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
									.addComponent(errcombox)
									.addComponent(radioButton_1))))
						.addComponent(label_17))
					.addGap(20))
		);
		panel_4.setLayout(gl_panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 364, 470, 87);
		panel_5.setBorder(null);
		panel_5.setBackground(Color.WHITE);
		
		MaterialButton materialButton = new MaterialButton();
		materialButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				Thread hilo2=new Thread(new Runnable() {
					public void run() {
						try {
							@SuppressWarnings("deprecation")
							String contraseña=new String(passwordField_1.getText());
							@SuppressWarnings("deprecation")
							String confcontraseña=new String(passwordField.getText());
							Thread.sleep(470);
							
					
							if(contraseña.length()==0){
								errcontra.setVisible(true);
							}else{
								errcontra.setVisible(false);
							}
							if(contraseña.equals(confcontraseña)){
								errrepetircontra.setVisible(false);	
							}else{
								errrepetircontra.setVisible(true);
							}
							
							if(radioButton.isSelected()==false && radioButton_1.isSelected()==false){
								errcombox.setVisible(true);
							}else{
								errcombox.setVisible(false);
							}
							if(txtNombre.getText().length()==0){
								errnom.setVisible(true);
							}else{
								errnom.setVisible(false);
							}
							if(txtCorreo.getText().length()==0){
								errcorreo.setVisible(true);
							}else{
								errcorreo.setVisible(false);
							}
							if(txtUsuario.getText().length()==0){
								errusr.setVisible(true);
								
							}else{
								errusr.setVisible(false);
								
							}
						
							if(txtApellido.getText().length()==0){
								errape.setVisible(true);
							}else{
								errape.setVisible(false);
							}
						
							if(contraseña.length()==0||confcontraseña.length()==0||txtCorreo.getText().length()==0||txtNombre.getText().length()==0||txtApellido.getText().length()==0||txtUsuario.getText().length()==0||(radioButton.isSelected()==false && radioButton_1.isSelected()==false)||(!confcontraseña.equals(contraseña))){
								JOptionPane.showMessageDialog(panel, "Hay elementos sin llenar o incoerentes, revise por favor");
							}else{
								boolean prof=false;
								
								if(radioButton.isSelected()==true){
									prof=true;
								}else{
									prof=false;
								}
								
								Consultas co=new Consultas();
								if(co.registrar(txtUsuario.getText(), contraseña, txtNombre.getText(), txtApellido.getText(), txtCorreo.getText(), prof)){
									
									new CambiaPanel(panel, new Carga_RegistroTabla(frame,txtUsuario.getText(),panelcontenedordalso));
									
									
								}
								
							}
							
	
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					
				});
				hilo2.start();	
				
				
				
						
				
				
			}
		});
		
		
		materialButton.setText("Registrarse");
		materialButton.setRippleColor(Color.WHITE);
		materialButton.setForeground(Color.WHITE);
		materialButton.setBackground(SystemColor.textHighlight);
		
		JLabel label_21 = new JLabel("\u00BFYa tienes cuenta?");
		label_21.setForeground(Color.BLACK);
		label_21.setFont(new Font("Segoe UI Black", Font.BOLD, 11));
		
		JLabel label_22 = new JLabel("<HTML><U>Inicia sesion aqui</U></HTML>");
		label_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new CambiaPanel(panel, new Carga_RegistroLogin(frame));
			}
		});
		label_22.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_22.setForeground(SystemColor.textHighlight);
		label_22.setFont(new Font("Segoe UI Black", Font.BOLD, 11));
		label_22.setBackground(SystemColor.menu);
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGap(0, 460, Short.MAX_VALUE)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addContainerGap()
							.addComponent(materialButton, GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(117)
							.addComponent(label_21)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_22, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 87, Short.MAX_VALUE)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(materialButton, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_21)
						.addComponent(label_22, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_5.setLayout(gl_panel_5);
		panel_3.setLayout(null);
		panel_3.add(label_3);
		panel_3.add(panel_4);
		panel_3.add(panel_5);
		
		
	}
}
