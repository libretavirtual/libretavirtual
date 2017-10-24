package Paneles;

import javax.swing.JPanel;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.border.MatteBorder;

import Controlador.Consultas;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.MouseInfo;
import java.awt.Point;

import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.LayoutStyle.ComponentPlacement;
import de.craften.ui.swingmaterial.MaterialPasswordField;
import de.craften.ui.swingmaterial.MaterialTextField;
import Principal.MaterialButton;

import javax.swing.BoxLayout;
import java.awt.Cursor;

@SuppressWarnings("serial")
public class Login extends JPanel {
	private int x,y;
	/**
	 * Create the panel.
	 */
	public Login(JFrame fra,JPanel panelcontenedordalso) {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 0, 490, 514);
		add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.X_AXIS));
		
		JPanel panel_4 = new JPanel();
		panel_5.add(panel_4);
		panel_4.setBackground(new Color(0, 153, 255));
		panel_4.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 42, 470, 460);
		panel_4.add(panel_1);
		panel_1.setBackground(Color.WHITE);
		
		JLabel label_3 = new JLabel("Libreta Virtual");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(SystemColor.textHighlight);
		label_3.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 43));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		
		JLabel label_4 = new JLabel("\u00BFNo tienes cuenta?");
		label_4.setForeground(Color.BLACK);
		label_4.setFont(new Font("Segoe UI Black", Font.BOLD, 11));
		
		JLabel label_5 = new JLabel("<HTML><U>Creala gratis aqui</U></HTML>");
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				new CambiaPanel(panel_5, new Carga_LoginRegister(fra,panelcontenedordalso));
			}
		});
		label_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_5.setForeground(SystemColor.textHighlight);
		label_5.setFont(new Font("Segoe UI Black", Font.BOLD, 11));
		label_5.setBackground(SystemColor.menu);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 450, Short.MAX_VALUE)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(97)
					.addComponent(label_4)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
					.addGap(90))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 40, Short.MAX_VALUE)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_5)
						.addComponent(label_4)))
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(null);
		panel_3.setBackground(Color.WHITE);
		
		MaterialPasswordField materialPasswordField = new MaterialPasswordField();
		materialPasswordField.setLabel("Contrase\u00F1a");
		
		MaterialTextField mtrltxtfldMatias = new MaterialTextField();
		mtrltxtfldMatias.setText("matias");
		mtrltxtfldMatias.setLabel("Nombre de Usuario");
		
		MaterialButton materialButton = new MaterialButton();
		materialButton.addMouseListener(new MouseAdapter() {
			@Override
			
			public void mouseClicked(MouseEvent e) {
				Thread hilo=new Thread(new Runnable() {
					
					
					@SuppressWarnings("deprecation")
					String pass=new String(materialPasswordField.getText());
					
					public void run() {
					
						try {
								Thread.sleep(40);
							
								if(mtrltxtfldMatias.getText().length()!=0 && pass.length()!=0){	
									Consultas co=new Consultas();
									if(	co.autenticacion(mtrltxtfldMatias.getText(), pass)==true){
										
										new CambiaPanel(panelcontenedordalso, new Carga_RegistroTabla(fra,mtrltxtfldMatias.getText(),panelcontenedordalso));
										
									}
								}else{
									JOptionPane.showMessageDialog(null, "Complete todas las casillas");
								}
						} catch (Exception e) {
							System.err.println("Error"+e);					
						}
						
					}
				});
				hilo.start();		
			}
		});
		materialButton.setText("Iniciar sesion");
		materialButton.setRippleColor(Color.BLUE);
		materialButton.setForeground(Color.WHITE);
		materialButton.setBackground(SystemColor.textHighlight);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 450, Short.MAX_VALUE)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(materialPasswordField, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
						.addComponent(mtrltxtfldMatias, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
						.addComponent(materialButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 318, Short.MAX_VALUE)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(59)
					.addComponent(mtrltxtfldMatias, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(materialPasswordField, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
					.addComponent(materialButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_3.setLayout(gl_panel_3);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 470, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label_3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
						.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 461, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(3))
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 490, 31);
		panel_4.add(panel);
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 102, 255)));
		panel.setBackground(SystemColor.textHighlight);
		
		JLabel label = new JLabel("X");
		label.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 102, 255)));
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				label.setBackground(new Color(30, 144, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				label.setBackground(SystemColor.textHighlight);
			}
		});
		label.setOpaque(true);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 25));
		label.setBackground(SystemColor.textHighlight);
		label.setBounds(459, 0, 31, 31);
		panel.add(label);
		
		JLabel label_1 = new JLabel("-");
		label_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 102, 255)));
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label_1.setBackground(new Color(30, 144, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				label_1.setBackground(SystemColor.textHighlight);
			}
			@SuppressWarnings({ "deprecation", "static-access" })
			@Override
			public void mouseClicked(MouseEvent e) {
				fra.setExtendedState(fra.CROSSHAIR_CURSOR);
			}
		});
		label_1.setOpaque(true);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_1.setBackground(SystemColor.textHighlight);
		label_1.setBounds(428, 0, 31, 31);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("");
	
		
		label_2.addMouseMotionListener(new MouseMotionAdapter() {
			
			public void mouseDragged(MouseEvent e) {
				Point point = MouseInfo.getPointerInfo().getLocation();
				fra.setLocation(point.x - x, point.y - y);
			}
		});
		label_2.addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {
				 x = e.getX();
	             y = e.getY();
			}
		});
		label_2.setBounds(0, 0, 428, 31);
		panel.add(label_2);

	}
}
