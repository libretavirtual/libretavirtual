
package Principal;

import java.awt.SystemColor;
import javax.swing.JFrame;
import javax.swing.JPanel;
import Controlador.Coneccion;
import Paneles.CambiaPanel;
import Paneles.Login;
import sun.security.util.SecurityConstants.AWT;

import java.awt.Color;
import org.edisoncor.gui.progressBar.ProgressBarRound;

import com.sun.awt.AWTUtilities;
import com.sun.javafx.geom.Rectangle;
import com.sun.javafx.tk.Toolkit;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;

import java.awt.Cursor;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.SwingConstants;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import javax.swing.BoxLayout;

public class Cargar_programa extends JFrame implements ActionListener{

	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		new Cargar_programa();
	
	}
	
	private JPanel contentPane;
	private ProgressBarRound barra; 
	private JFrame frame;
	private JPanel panel,panel_1,principal,panelcontenedordalso;
	private JLabel label_1,label,lblNoSeHa;
	private MaterialButtomRectangle mtrlbtmrctnglReintentar,mtrlbtmrctnglSalir;
	private Dimension tamañoPantalla;
	private Rectangle pantalla;
	public ImageIcon icono;
	Panel miPanel;
	
	public Cargar_programa() {
		panel();
		panel2();
		hilo();
		panelcambiante();
		panelpro();
		panelcontenedor();
		CrearFrame();
		
		mtrlbtmrctnglReintentar.addActionListener(this);
		mtrlbtmrctnglSalir.addActionListener(this);
	}
	private void panelpro() {
		panelcontenedordalso=new JPanel();
		panelcontenedordalso.setBackground(new Color(0, 153, 255));
		panelcontenedordalso.setLayout(new BoxLayout(panelcontenedordalso, BoxLayout.X_AXIS));
		panelcontenedordalso.add(principal);		
	}
	private void panelcambiante() {
		
		principal=new JPanel();
		principal.setBackground(new Color(0, 153, 255));
		principal.setLayout(null);
		principal.add(panel);
		principal.add(panel_1);	
	}

	private void hilo() {
		Thread hilo=new Thread(new Runnable() {
			int val=0;
			Coneccion con=new Coneccion();
			public void run() {
				try {
					while(val<=100){
						barra.setValue(val);
						label.setText(val+"%");
						val ++;
						Thread.sleep(20);
					}
					boolean comp=true;
					if(con.comprueba(comp)==true){
						new CambiaPanel(panelcontenedordalso, new Login(frame,panelcontenedordalso));	
					}else{
						lblNoSeHa.setVisible(true);
						mtrlbtmrctnglReintentar.setVisible(true);
						mtrlbtmrctnglSalir.setVisible(true);
						}
					} catch (Exception e) {	
				}
			}
		});
		hilo.start();		
	}
	private void panel2() {
		panel_1 = new JPanel();
		panel_1.setBounds(10, 163, 470, 351);
		panel_1.setBackground(Color.WHITE);
		
		barra = new ProgressBarRound();
		barra.setPreferredSize(new Dimension(146, 7));
		barra.setDireccionDeSombra(0);
		barra.setDistanciaDeSombra(0);
		barra.setBorderPainted(false);
		barra.setColorDeTexto(Color.WHITE);
		barra.setColorDeSombra(Color.WHITE);
		barra.setColorDeBorde(Color.WHITE);
		barra.setBounds(55, 221, 352, 16);
		barra.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		barra.setBorder(null);
		barra.setBorde(0.0f);
		barra.setBackground(Color.WHITE);
		barra.setAlignmentX(2.0f);
		barra.setForeground(new Color(5, 160, 255));
		
		label = new JLabel("");
		label.setBounds(417, 218, 33, 19);
		
		lblNoSeHa = new JLabel("No se ha podido conectar con la base de datos");
		lblNoSeHa.setVisible(false);
		lblNoSeHa.setBounds(55, 87, 352, 32);
		lblNoSeHa.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNoSeHa.setHorizontalAlignment(SwingConstants.CENTER);
		
		mtrlbtmrctnglSalir = new MaterialButtomRectangle();
		mtrlbtmrctnglSalir.setBounds(244, 130, 141, 35);
		mtrlbtmrctnglSalir.setForeground(new Color(255, 255, 255));
		mtrlbtmrctnglSalir.setVisible(false);
		mtrlbtmrctnglSalir.setText("Salir");
		mtrlbtmrctnglSalir.setRippleColor(new Color(51, 255, 51));
		mtrlbtmrctnglSalir.setBackground(new Color(191, 35, 36));
		
		mtrlbtmrctnglReintentar = new MaterialButtomRectangle();
		mtrlbtmrctnglReintentar.setBounds(76, 130, 141, 35);
		mtrlbtmrctnglReintentar.setForeground(new Color(255, 255, 255));
		mtrlbtmrctnglReintentar.setVisible(false);
		mtrlbtmrctnglReintentar.setBackground(new Color(71, 193, 84));
		mtrlbtmrctnglReintentar.setRippleColor(new Color(51, 255, 51));
		mtrlbtmrctnglReintentar.setText("Reintentar");
		
		panel_1.setLayout(null);
		panel_1.add(lblNoSeHa);
		panel_1.add(mtrlbtmrctnglReintentar);
		panel_1.add(mtrlbtmrctnglSalir);
		panel_1.add(barra);
		panel_1.add(label);
	}
	private void panel() {
		panel = new JPanel();
		panel.setBounds(10, 0, 470, 163);
		panel.setBackground(Color.WHITE);
		
		label_1 = new JLabel("Libreta Virtual");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(SystemColor.textHighlight);
		label_1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 43));
		
		//layout del panel
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_1, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addComponent(label_1, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);	
	}
	private void panelcontenedor() {
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		contentPane.add(panelcontenedordalso);	
	}
	private void CrearFrame() {
		frame = new JFrame();
		frame.setUndecorated(true);
		
		
		
		frame.setContentPane(contentPane);
		frame.setVisible(true);
		frame.setBackground(Color.blue);
		frame.setSize(490, 514);
		frame.setLocationRelativeTo(null);
		frame.setIconImage(new ImageIcon(getClass().getResource("../Imagenes/Library-icon.png")).getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mtrlbtmrctnglReintentar){  
			Thread hilo2=new Thread(new Runnable() {
				public void run() {
					try {
						int val=0;
						Coneccion con=new Coneccion();
						Thread.sleep(470);
						
						lblNoSeHa.setVisible(false);
						mtrlbtmrctnglReintentar.setVisible(false);
						mtrlbtmrctnglSalir.setVisible(false);
						
						while(val<=100){
							barra.setValue(val);
							label.setText(val+"%");
							val ++;
							Thread.sleep(30);
						}
						
						boolean comp=true;
						
						if(con.comprueba(comp)==true){
							
							new CambiaPanel(panelcontenedordalso, new Login(frame,panelcontenedordalso));	
						}else{
							lblNoSeHa.setVisible(true);
							mtrlbtmrctnglReintentar.setVisible(true);
							mtrlbtmrctnglSalir.setVisible(true);
							}
					}catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
			hilo2.start();	
        }
		if (e.getSource() == mtrlbtmrctnglSalir){  
			Thread hilo2=new Thread(new Runnable() {
				public void run() {
					try {
						Thread.sleep(650);
						System.exit(0);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
			hilo2.start();		
        }
	}
}