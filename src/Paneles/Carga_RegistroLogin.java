package Paneles;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.EmptyBorder;


import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.BoxLayout;

public class Carga_RegistroLogin extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Carga_RegistroLogin(JFrame frame) {
		setBackground(new Color(0, 153, 255));
		setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 153, 255));
		panel_3.setBounds(0, 0, 490, 514);
		add(panel_3);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.X_AXIS));
		
		JPanel panel_2 = new JPanel();
		panel_3.add(panel_2);
		panel_2.setBackground(new Color(0, 153, 255));
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 109, 470, 405);
		panel.setLayout(null);
		panel.setBorder(null);
		panel.setBackground(Color.WHITE);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Carga_RegistroLogin.class.getResource("/Imagenes/giphy.gif")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(10, 116, 450, 156);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Cargando inicio de sesion");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_1.setBounds(10, 265, 450, 34);
		panel.add(label_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 0, 470, 111);
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBackground(Color.WHITE);
		
		JLabel label_2 = new JLabel("Libreta Virtual");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(SystemColor.textHighlight);
		label_2.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 43));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 470, Short.MAX_VALUE)
				.addComponent(label_2, GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 111, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(34, Short.MAX_VALUE)
					.addComponent(label_2))
		);
		panel_1.setLayout(gl_panel_1);
		panel_2.setLayout(null);
		panel_2.add(panel);
		panel_2.add(panel_1);
		Thread hilo=new Thread(new Runnable() {
			int val=0;
			
			@Override
			public void run() {
			
				try {
					while(val<=100){
						val ++;
						Thread.sleep(40);
					}
					frame.setLocationRelativeTo(null);
					new CambiaPanel(panel_3, new Login(frame,panel_3));
					
				} catch (Exception e) {
					
					
				}
				
			}
		});
		hilo.start();
	}

}
