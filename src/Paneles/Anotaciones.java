package Paneles;

import java.awt.Color;
import java.awt.Event;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.MatteBorder;

import Controlador.Consultas;

import java.awt.BorderLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JEditorPane;
import Principal.MaterialButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;

import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.BoxLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultEditorKit;

public class Anotaciones extends JPanel {
	
	
	private static final long serialVersionUID = 1L;
	private JTable table;

	
	
	public Anotaciones(String user) {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.GRAY));
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.NORTH);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Anotaciones.class.getResource("/Imagenes/menugris.png")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Anotaciones.class.getResource("/Imagenes/aestegris.png")));
		
		JLabel label_2 = new JLabel("Anotaciones");
		label_2.setForeground(Color.GRAY);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JLabel label_3 = new JLabel("");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(51)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)))
					.addGap(15))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		add(panel_1, BorderLayout.WEST);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		add(panel_2, BorderLayout.EAST);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		add(panel_3, BorderLayout.SOUTH);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		add(panel_4, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 255));
		panel_6.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(169, 169, 169)));
		
		JEditorPane editorPane = new JEditorPane();
		ActionMap acciones = editorPane.getActionMap();
		Action accionCopiar = acciones.get(DefaultEditorKit.copyAction);
		Action accionPegar = acciones.get(DefaultEditorKit.pasteAction);
		Action accionCortar = acciones.get(DefaultEditorKit.cutAction);
		
		accionCopiar.putValue(Action.NAME, "Copiar");
		accionCopiar.putValue(
				Action.ACCELERATOR_KEY,
				KeyStroke.getAWTKeyStroke('C', Event.CTRL_MASK)); 
		
		
		
		
		
		
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_6, GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(editorPane, GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(editorPane, GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
						.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE))
					.addContainerGap())
		);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_7.setLayout(null);
		
		JLabel ArchivoNuevo = new JLabel("");
		ArchivoNuevo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				ArchivoNuevo.setIcon(new ImageIcon(Anotaciones.class.getResource("/Imagenes/Nuevo2.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				ArchivoNuevo.setIcon(new ImageIcon(Anotaciones.class.getResource("/Imagenes/Nuevo.png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		ArchivoNuevo.setHorizontalAlignment(SwingConstants.CENTER);
		ArchivoNuevo.setIcon(new ImageIcon(Anotaciones.class.getResource("/Imagenes/Nuevo.png")));
		ArchivoNuevo.setBounds(0, 0, 46, 46);
		panel_7.add(ArchivoNuevo);
		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
		gl_panel_6.setHorizontalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_7, GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
					.addGap(179))
		);
		gl_panel_6.setVerticalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addGap(1)
					.addComponent(panel_7, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(0))
		);
		
		JLabel Guardar = new JLabel("");
		Guardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				Guardar.setIcon(new ImageIcon(Anotaciones.class.getResource("/Imagenes/guardar2.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Guardar.setIcon(new ImageIcon(Anotaciones.class.getResource("/Imagenes/guardar.png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		Guardar.setHorizontalAlignment(SwingConstants.CENTER);
		Guardar.setIcon(new ImageIcon(Anotaciones.class.getResource("/Imagenes/guardar.png")));
		Guardar.setBounds(46, 0, 46, 46);
		panel_7.add(Guardar);
		
		JLabel Deshacer = new JLabel("");
		Deshacer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				Deshacer.setIcon(new ImageIcon(Anotaciones.class.getResource("/Imagenes/deshacer2.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Deshacer.setIcon(new ImageIcon(Anotaciones.class.getResource("/Imagenes/deshacer.png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		Deshacer.setIcon(new ImageIcon(Anotaciones.class.getResource("/Imagenes/deshacer.png")));
		Deshacer.setHorizontalAlignment(SwingConstants.CENTER);
		Deshacer.setBounds(102, 0, 46, 46);
		panel_7.add(Deshacer);
		
		JLabel Rehacer = new JLabel("");
		Rehacer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				Rehacer.setIcon(new ImageIcon(Anotaciones.class.getResource("/Imagenes/rehacer2.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Rehacer.setIcon(new ImageIcon(Anotaciones.class.getResource("/Imagenes/rehacer.png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		Rehacer.setIcon(new ImageIcon(Anotaciones.class.getResource("/Imagenes/rehacer.png")));
		Rehacer.setHorizontalAlignment(SwingConstants.CENTER);
		Rehacer.setBounds(148, 0, 46, 46);
		panel_7.add(Rehacer);
		
		JLabel Cortar = new JLabel("");
		Cortar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				Cortar.setIcon(new ImageIcon(Anotaciones.class.getResource("/Imagenes/Cortar2.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Cortar.setIcon(new ImageIcon(Anotaciones.class.getResource("/Imagenes/Cortar.png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		Cortar.setIcon(new ImageIcon(Anotaciones.class.getResource("/Imagenes/Cortar.png")));
		Cortar.setHorizontalAlignment(SwingConstants.CENTER);
		Cortar.setBounds(202, 0, 46, 46);
		panel_7.add(Cortar);
		
		JLabel Copiar = new JLabel("");
		Copiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				Copiar.setIcon(new ImageIcon(Anotaciones.class.getResource("/Imagenes/Copiar2.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Copiar.setIcon(new ImageIcon(Anotaciones.class.getResource("/Imagenes/Copiar.png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		Copiar.setHorizontalAlignment(SwingConstants.CENTER);
		Copiar.setIcon(new ImageIcon(Anotaciones.class.getResource("/Imagenes/Copiar.png")));
		Copiar.setBounds(248, 0, 46, 46);
		panel_7.add(Copiar);
		
		JLabel Pegar = new JLabel("");
		Pegar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				Pegar.setIcon(new ImageIcon(Anotaciones.class.getResource("/Imagenes/Pegar2.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Pegar.setIcon(new ImageIcon(Anotaciones.class.getResource("/Imagenes/Pegar.png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		Pegar.setIcon(new ImageIcon(Anotaciones.class.getResource("/Imagenes/Pegar.png")));
		Pegar.setHorizontalAlignment(SwingConstants.CENTER);
		Pegar.setBounds(294, 0, 46, 46);
		panel_7.add(Pegar);
		
		JLabel Separador1 = new JLabel("");
		Separador1.setIcon(new ImageIcon(Anotaciones.class.getResource("/Imagenes/Division.png")));
		Separador1.setHorizontalAlignment(SwingConstants.CENTER);
		Separador1.setBounds(92, 0, 10, 46);
		panel_7.add(Separador1);
		
		JLabel Separador2 = new JLabel("");
		Separador2.setHorizontalAlignment(SwingConstants.CENTER);
		Separador2.setIcon(new ImageIcon(Anotaciones.class.getResource("/Imagenes/Division.png")));
		Separador2.setBounds(192, 0, 10, 46);
		panel_7.add(Separador2);
		panel_6.setLayout(gl_panel_6);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.X_AXIS));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_5.add(scrollPane);
		
		table = new JTable();
		table.setShowGrid(false);
		table.setShowHorizontalLines(false);
		table.setForeground(new Color(0, 102, 204));
		table.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Nota 1"},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
			},
			new String[] {
				"Titulo"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		scrollPane.setViewportView(table);
		panel_4.setLayout(gl_panel_4);

	}
}
