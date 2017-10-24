package Paneles;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.border.MatteBorder;

import java.awt.BorderLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

import javax.swing.border.LineBorder;
import javax.swing.JSlider;
import javax.swing.JEditorPane;
import java.awt.Insets;
import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import de.craften.ui.swingmaterial.MaterialProgressSpinner;
import de.craften.ui.swingmaterial.MaterialPanel;
import org.edisoncor.gui.label.LabelCustom;

import Controlador.Coneccion;

import org.edisoncor.gui.label.LabelBackgroundTitle;
import javax.swing.JSeparator;
import java.awt.Component;
import javax.swing.DebugGraphics;
import java.awt.Panel;
import java.awt.FlowLayout;
import java.awt.Rectangle;

public class Inicio extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Inicio(){
		setBackground(Color.PINK);
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		Panel panel = new Panel();
		panel.setBackground(Color.WHITE);
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.GRAY));
		panel_2.setBackground(Color.WHITE);
		panel.add(panel_2, BorderLayout.NORTH);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/menugris.png")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/aestegris.png")));
		
		JLabel label_2 = new JLabel("Inicio");
		label_2.setForeground(Color.GRAY);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(39)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
					.addGap(195))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(label_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addContainerGap())
						.addComponent(label)))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(19)
					.addComponent(label_2)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel.add(panel_1, BorderLayout.CENTER);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		
		
		Thread hilo2=new Thread(new Runnable() {
			public void run() {
				boolean infinito=true;
				try {
					
					while(infinito==true) {
						lblNewLabel.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/Screenshot_3.png")));
						Thread.sleep(8000);
						lblNewLabel.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/Screenshot_1.png")));
						Thread.sleep(8000);
						lblNewLabel.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/Screenshot_4.png")));
						Thread.sleep(8000);
					}
					
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		hilo2.start();	
		
		
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 381, Short.MAX_VALUE)
					.addGap(10))
		);
		panel_1.setLayout(gl_panel_1);
	
	
	}
}
