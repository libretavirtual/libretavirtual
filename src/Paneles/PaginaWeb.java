package Paneles;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.border.MatteBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.border.EtchedBorder;
import java.awt.Dimension;
import de.craften.ui.swingmaterial.MaterialIconButton;
import Principal.MaterialButtomRectangle;
import Principal.MaterialButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;

public class PaginaWeb extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	
	public PaginaWeb(int largo,int ancho) {
		setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(192, 192, 192), new Color(128, 128, 128)));
		setBackground(new Color(255, 255, 255));
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.GRAY));
		panel.setBackground(Color.WHITE);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(PaginaWeb.class.getResource("/Imagenes/menugris.png")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(PaginaWeb.class.getResource("/Imagenes/aestegris.png")));
		
		JLabel label_2 = new JLabel("Pagina web");
		label_2.setForeground(Color.GRAY);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(18)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(226, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(19, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(label_2)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
							.addComponent(label_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(label, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 34, Short.MAX_VALUE)))
					.addGap(18))
		);
		panel.setLayout(gl_panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setForeground(new Color(0, 153, 255));
		lblNewLabel.setBackground(Color.YELLOW);
		lblNewLabel.setVerifyInputWhenFocusTarget(false);
		lblNewLabel.setIgnoreRepaint(true);
		
		
	
		ImageIcon imagen=new ImageIcon(getClass().getResource("/Imagenes/Screenshot_2.png"));
		Image conversion=imagen.getImage();
		Image tamaño=conversion.getScaledInstance(largo, ancho, Image.SCALE_SMOOTH);
		ImageIcon fin=new ImageIcon(tamaño);
		lblNewLabel.setIcon(fin);
		
		MaterialButton mtrlbtnVisitanos = new MaterialButton();
		mtrlbtnVisitanos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mtrlbtnVisitanos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String direccion = "https://libretaestudiante.github.io/";
				try
				                {
				                    Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + direccion);
				                }
				                catch(Exception err)
				                {
				                    JOptionPane.showMessageDialog(null,"Error: "+err);
				                }
			}
		});
		mtrlbtnVisitanos.setFont(new Font("Dialog", Font.BOLD, 16));
		mtrlbtnVisitanos.setForeground(Color.WHITE);
		mtrlbtnVisitanos.setBackground(new Color(0, 153, 255));
		mtrlbtnVisitanos.setText("Visitanos");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
							.addGap(4))
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE))
					.addGap(6))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(331, Short.MAX_VALUE)
					.addComponent(mtrlbtnVisitanos, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
					.addGap(24))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(mtrlbtnVisitanos, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addGap(37))
		);
		setLayout(groupLayout);
	}
}