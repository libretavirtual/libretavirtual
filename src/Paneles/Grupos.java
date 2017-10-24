package Paneles;

import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.MatteBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import de.craften.ui.swingmaterial.MaterialIconButton;
import Principal.RSButtonMetro;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Grupos extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTable TablaNotas;

	/**
	 * Create the panel.
	 */
	public Grupos() {
		setBackground(Color.MAGENTA);
		JLabel txt = new JLabel("");
		txt.setForeground(Color.GRAY);
		txt.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JPanel panel_1 = new JPanel();
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		add(txt);
		add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel_1.add(panel, BorderLayout.NORTH);
		panel.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.GRAY));
		panel.setBackground(Color.WHITE);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/menugris.png")));
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/aestegris.png")));
		
		JLabel lblInicio = new JLabel("Grupos");
		lblInicio.setForeground(Color.GRAY);
		lblInicio.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblInicio.setIcon(new ImageIcon(Grupos.class.getResource("/Imagenes/feeedback.png")));
		
		JLabel label_2 = new JLabel("");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(51)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(label_1)
					.addGap(4)
					.addComponent(lblInicio, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
					.addGap(87)
					.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(11)
					.addComponent(label))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(20)
					.addComponent(label_1))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(11)
					.addComponent(lblInicio))
				.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_1.add(panel_2, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.X_AXIS));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel_3.add(scrollPane_1);
		
		TablaNotas = new JTable();
		scrollPane_1.setViewportView(TablaNotas);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_1.add(panel_4, BorderLayout.WEST);
		
		JScrollPane scrollPane = new JScrollPane();
		
		RSButtonMetro btnmtrCrear = new RSButtonMetro();
		
		btnmtrCrear.setFont(new Font("Dialog", Font.BOLD, 14));
		btnmtrCrear.setColorBorde(null);
		btnmtrCrear.setColorPressed(SystemColor.textHighlight);
		btnmtrCrear.setColorNormal(new Color(0, 102, 255));
		btnmtrCrear.setColorHover(SystemColor.textHighlight);
		btnmtrCrear.setBackground(new Color(0, 102, 255));
		btnmtrCrear.setText("Crear");
		
		RSButtonMetro btnmtrEliminar = new RSButtonMetro();
		
		btnmtrEliminar.setFont(new Font("Dialog", Font.BOLD, 14));
		btnmtrEliminar.setColorBorde(null);
		btnmtrEliminar.setColorPressed(new Color(169, 169, 169));
		btnmtrEliminar.setColorNormal(new Color(192, 192, 192));
		btnmtrEliminar.setColorTextPressed(Color.DARK_GRAY);
		btnmtrEliminar.setColorTextNormal(Color.DARK_GRAY);
		btnmtrEliminar.setColorTextHover(Color.DARK_GRAY);
		btnmtrEliminar.setColorHover(new Color(169, 169, 169));
		btnmtrEliminar.setBackground(new Color(192, 192, 192));
		btnmtrEliminar.setText("Eliminar");
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(btnmtrCrear, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnmtrEliminar, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(23)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(btnmtrCrear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnmtrEliminar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		
		
		DefaultTableModel modelo=new DefaultTableModel();
		table = new JTable(modelo);
		modelo.addColumn("");
		scrollPane.setRowHeaderView(table);
		panel_4.setLayout(gl_panel_4);
		
		
		btnmtrCrear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				modelo.addRow(new Object[] {""});	
		
			}
		});
		
		btnmtrEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				modelo.removeRow(modelo.getRowCount()-1);
			}
		});
	
	
	
	}
}
