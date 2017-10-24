package Paneles;

import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.MatteBorder;

import Controlador.Consultas;

import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;
import Principal.MaterialTextField;
import java.awt.Component;
import java.awt.Cursor;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import Principal.RSButtonMetro;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import Principal.MaterialButton;
import javax.swing.JScrollBar;

public class Configuraciones extends JPanel {
	
	private RSButtonMetro buttonMetro_1,buttonMetro_2,buttonMetro ;
	private MaterialTextField Correo,Apellido,Nombre;
	/**
	 * Create the panel.
	 */
	public Configuraciones(String user) {
		setBackground(Color.BLUE);
		setSize(669,529);
		
		JPanel panel_1 = new JPanel();
		panel_1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel_1.setForeground(SystemColor.text);
		panel_1.setBorder(null);
		panel_1.setBackground(Color.RED);
		
		
		Consultas con=new Consultas();
		String ol=new String(con.datos(user));
		String []  bar = ol. split("-");
		
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel Configs = new JPanel();
		Configs.setBorder(new MatteBorder(0, 1, 1, 1, (Color) new Color(169, 169, 169)));
		Configs.setBackground(Color.WHITE);
		Configs.setBackground(new java.awt.Color(255, 255, 255));
		panel_1.add(Configs, BorderLayout.CENTER);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new MatteBorder(1, 0, 1, 0, (Color) new Color(169, 169, 169)));
		panel_6.setBackground(new Color(255, 255, 255));
		
		JLabel label_3 = new JLabel("Nombre");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setFont(new Font("Dialog", Font.BOLD, 18));
		
		JLabel label_4 = new JLabel("Apellido");
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setFont(new Font("Dialog", Font.BOLD, 18));
		
		Apellido = new MaterialTextField();
		Apellido.setDisabledTextColor(new Color(105, 105, 105));
		Apellido.setEnabled(false);
		Apellido.setEditable(false);
		Apellido.setText("Sosa");
		
		Nombre = new MaterialTextField();
		Nombre.setDisabledTextColor(new Color(105, 105, 105));
		Nombre.setEnabled(false);
		Nombre.setEditable(false);
		Nombre.setText("Matias");
		
		buttonMetro = new RSButtonMetro();
		buttonMetro.setIcon(new ImageIcon(Configuraciones.class.getResource("/Imagenes/lapiz2.png")));
		
		
		buttonMetro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sieteMousePressed(evt);
            }
            private void sieteMousePressed(java.awt.event.MouseEvent evt) {
            	buttonMetro.setSelected(true);
            	buttonMetro_1.setSelected(false);
            	buttonMetro_2.setSelected(false);
                
            }
		@Override
		public void mouseClicked(MouseEvent ev) {
			
		}
        });
		buttonMetro.addActionListener(new java.awt.event.ActionListener() {
	    public void actionPerformed(java.awt.event.ActionEvent evt) {
	        sieteActionPerformed(evt);
	    }
	    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {
	        if(buttonMetro.isSelected()){
	        	Nombre.setEnabled(true);
				Nombre.setEditable(true);
	            
				Apellido.setEnabled(false);
				Apellido.setEditable(false);
	            
				Correo.setEnabled(false);
				Correo.setEditable(false);
	            
	           
	        }else{
	        	Nombre.setEnabled(false);
				Nombre.setEditable(false);
	        }
	    }
	});

		buttonMetro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				buttonMetro.setIcon(new ImageIcon(Configuraciones.class.getResource("/Imagenes/lapiz.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				buttonMetro.setIcon(new ImageIcon(Configuraciones.class.getResource("/Imagenes/lapiz2.png")));
			}
		});
		
		buttonMetro.setText("<HTML><U>Editar</U></HTML>");
		buttonMetro.setForeground(new Color(0, 102, 255));
		buttonMetro.setFont(new Font("Tahoma", Font.BOLD, 9));
		buttonMetro.setColorTextPressed(new Color(30, 144, 255));
		buttonMetro.setColorTextNormal(new Color(0, 102, 255));
		buttonMetro.setColorTextHover(new Color(30, 144, 255));
		buttonMetro.setColorPressed(Color.WHITE);
		buttonMetro.setColorNormal(Color.WHITE);
		buttonMetro.setColorHover(Color.WHITE);
		buttonMetro.setColorBorde(null);
		buttonMetro.setBackground(Color.WHITE);
		
		buttonMetro_1 = new RSButtonMetro();
		buttonMetro_1.setIcon(new ImageIcon(Configuraciones.class.getResource("/Imagenes/lapiz2.png")));
		
		
		buttonMetro_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sieteMousePressed(evt);
            }
            private void sieteMousePressed(java.awt.event.MouseEvent evt) {
            	buttonMetro.setSelected(false);
            	buttonMetro_1.setSelected(true);
            	buttonMetro_2.setSelected(false);
                
            }
		@Override
		public void mouseClicked(MouseEvent ev) {
			
		}
        });
		buttonMetro_1.addActionListener(new java.awt.event.ActionListener() {
	    public void actionPerformed(java.awt.event.ActionEvent evt) {
	        sieteActionPerformed(evt);
	    }
	    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {
	        if(buttonMetro_1.isSelected()){
	        	Nombre.setEnabled(false);
				Nombre.setEditable(false);
	            
				Apellido.setEnabled(true);
				Apellido.setEditable(true);
	            
				Correo.setEnabled(false);
				Correo.setEditable(false);
	            
	           
	        }else{
	        	Apellido.setEnabled(false);
				Apellido.setEditable(false);
	        }
	    }
	});

		
		buttonMetro_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				buttonMetro_1.setIcon(new ImageIcon(Configuraciones.class.getResource("/Imagenes/lapiz.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				buttonMetro_1.setIcon(new ImageIcon(Configuraciones.class.getResource("/Imagenes/lapiz2.png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Apellido.setEnabled(true);
				Apellido.setEditable(true);
			}
		});
		buttonMetro_1.setText("<HTML><U>Editar</U></HTML>");
		buttonMetro_1.setForeground(new Color(0, 102, 255));
		buttonMetro_1.setFont(new Font("Tahoma", Font.BOLD, 9));
		buttonMetro_1.setColorTextPressed(new Color(30, 144, 255));
		buttonMetro_1.setColorTextNormal(new Color(0, 102, 255));
		buttonMetro_1.setColorTextHover(new Color(30, 144, 255));
		buttonMetro_1.setColorPressed(Color.WHITE);
		buttonMetro_1.setColorNormal(Color.WHITE);
		buttonMetro_1.setColorHover(Color.WHITE);
		buttonMetro_1.setColorBorde(null);
		buttonMetro_1.setBackground(Color.WHITE);
		
		JLabel label_2 = new JLabel("");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setIcon(new ImageIcon(Configuraciones.class.getResource("/Imagenes/android.png")));
		
		JLabel lblContacto = new JLabel("Contacto");
		lblContacto.setHorizontalAlignment(SwingConstants.LEFT);
		lblContacto.setFont(new Font("Dialog", Font.BOLD, 18));
		
		Correo = new MaterialTextField();
		Correo.setDisabledTextColor(new Color(105, 105, 105));
		Correo.setEditable(false);
		Correo.setEnabled(false);
		Correo.setText("Correo@gmail.com");
		
		Nombre.setText(bar[0]);
		Apellido.setText(bar[1]);
		Correo.setText(bar[2]);
		
		buttonMetro_2 = new RSButtonMetro();
		buttonMetro_2.setIcon(new ImageIcon(Configuraciones.class.getResource("/Imagenes/lapiz2.png")));
		
		buttonMetro_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sieteMousePressed(evt);
            }
            private void sieteMousePressed(java.awt.event.MouseEvent evt) {
            	buttonMetro.setSelected(false);
            	buttonMetro_1.setSelected(false);
            	buttonMetro_2.setSelected(true);
                
            }
		@Override
		public void mouseClicked(MouseEvent ev) {
			
		}
        });
		buttonMetro_2.addActionListener(new java.awt.event.ActionListener() {
	    public void actionPerformed(java.awt.event.ActionEvent evt) {
	        sieteActionPerformed(evt);
	    }
	    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {
	        if(buttonMetro_2.isSelected()){
	        	Nombre.setEnabled(false);
				Nombre.setEditable(false);
	            
				Apellido.setEnabled(false);
				Apellido.setEditable(false);
	            
				Correo.setEnabled(true);
				Correo.setEditable(true);
	            
	           
	        }else{
	        	Correo.setEnabled(false);
	        	Correo.setEditable(false);
	        }
	    }
	});
		buttonMetro_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				buttonMetro_2.setIcon(new ImageIcon(Configuraciones.class.getResource("/Imagenes/lapiz.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				buttonMetro_2.setIcon(new ImageIcon(Configuraciones.class.getResource("/Imagenes/lapiz2.png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Correo.setEnabled(true);
				Correo.setEditable(true);
			}
		});
		buttonMetro_2.setText("<HTML><U>Editar</U></HTML>");
		buttonMetro_2.setForeground(new Color(0, 102, 255));
		buttonMetro_2.setFont(new Font("Tahoma", Font.BOLD, 9));
		buttonMetro_2.setColorTextPressed(new Color(30, 144, 255));
		buttonMetro_2.setColorTextNormal(new Color(0, 102, 255));
		buttonMetro_2.setColorTextHover(new Color(30, 144, 255));
		buttonMetro_2.setColorPressed(Color.WHITE);
		buttonMetro_2.setColorNormal(Color.WHITE);
		buttonMetro_2.setColorHover(Color.WHITE);
		buttonMetro_2.setColorBorde(null);
		buttonMetro_2.setBackground(Color.WHITE);
		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
		gl_panel_6.setHorizontalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_6.createSequentialGroup()
							.addGap(168)
							.addGroup(gl_panel_6.createParallelGroup(Alignment.TRAILING)
								.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel_6.createParallelGroup(Alignment.TRAILING)
								.addComponent(Apellido, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(Nombre, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_6.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(buttonMetro_1, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
								.addComponent(buttonMetro, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)))
						.addGroup(Alignment.TRAILING, gl_panel_6.createSequentialGroup()
							.addGap(168)
							.addComponent(lblContacto, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(Correo, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(buttonMetro_2, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel_6.setVerticalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addGap(34)
					.addGroup(gl_panel_6.createParallelGroup(Alignment.BASELINE)
						.addComponent(Nombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3)
						.addComponent(buttonMetro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(34)
					.addGroup(gl_panel_6.createParallelGroup(Alignment.BASELINE)
						.addComponent(Apellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_4)
						.addComponent(buttonMetro_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(38)
					.addGroup(gl_panel_6.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblContacto, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(Correo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(buttonMetro_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(21))
				.addGroup(gl_panel_6.createSequentialGroup()
					.addGap(22)
					.addComponent(label_2, GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_6.setLayout(gl_panel_6);
		
		MaterialButton mtrlbtnGuardarCambios = new MaterialButton();
		mtrlbtnGuardarCambios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				if(!Nombre.getText().equals(bar[0])){
					System.out.println(con.modificar(user, Nombre.getText()));
				}
				
				Nombre.setEnabled(false);
				Nombre.setEditable(false);
				Apellido.setEnabled(false);
				Apellido.setEditable(false);
				Correo.setEnabled(false);
				Correo.setEditable(false);
				
			}
		});
		mtrlbtnGuardarCambios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		mtrlbtnGuardarCambios.setForeground(new Color(255, 255, 255));
		mtrlbtnGuardarCambios.setBackground(new Color(30, 144, 255));
		mtrlbtnGuardarCambios.setText("Guardar Cambios");
		
		MaterialButton mtrlbtnCancelar = new MaterialButton();
		mtrlbtnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Nombre.setText(bar[0]);
				Apellido.setText(bar[1]);
				Correo.setText(bar[2]);
				
				Nombre.setEnabled(false);
				Nombre.setEditable(false);
				Apellido.setEnabled(false);
				Apellido.setEditable(false);
				Correo.setEnabled(false);
				Correo.setEditable(false);
			}
		});
		mtrlbtnCancelar.setRippleColor(Color.LIGHT_GRAY);
		mtrlbtnCancelar.setText("Cancelar");
		mtrlbtnCancelar.setForeground(Color.BLACK);
		mtrlbtnCancelar.setBackground(new Color(211, 211, 211));
		GroupLayout gl_Configs = new GroupLayout(Configs);
		gl_Configs.setHorizontalGroup(
			gl_Configs.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Configs.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Configs.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Configs.createSequentialGroup()
							.addComponent(panel_6, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
							.addGap(8))
						.addGroup(Alignment.TRAILING, gl_Configs.createSequentialGroup()
							.addComponent(mtrlbtnGuardarCambios, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(mtrlbtnCancelar, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_Configs.setVerticalGroup(
			gl_Configs.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Configs.createSequentialGroup()
					.addGap(26)
					.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_Configs.createParallelGroup(Alignment.LEADING)
						.addComponent(mtrlbtnGuardarCambios, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(mtrlbtnCancelar, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(140, Short.MAX_VALUE))
		);
		Configs.setLayout(gl_Configs);
		
		
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
		);
		
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_3.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_3.setBackground(Color.WHITE);
		panel_1.add(panel_3, BorderLayout.WEST);
		
		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_4.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		panel_4.setBackground(Color.WHITE);
		panel_1.add(panel_4, BorderLayout.EAST);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_1.add(panel_2, BorderLayout.SOUTH);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(169, 169, 169)));
		panel_5.setBackground(new Color(255, 255, 255));
		panel_1.add(panel_5, BorderLayout.NORTH);
		
		
		JPanel panel = new JPanel();
		panel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel.setBorder(null);
		panel.setBackground(Color.WHITE);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/menugris.png")));
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/aestegris.png")));
		
		JLabel lblInicio = new JLabel("Configuraciones");
		lblInicio.setForeground(Color.GRAY);
		lblInicio.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblInicio.setIcon(new ImageIcon(Configuraciones.class.getResource("/Imagenes/settings.png")));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(14)
					.addComponent(label)
					.addGap(4)
					.addComponent(label_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblInicio)
					.addContainerGap(351, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblInicio, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(Alignment.TRAILING, gl_panel.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(label_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
		);
		panel_5.setLayout(gl_panel_5);
		setLayout(groupLayout);
		
		
		
		
	}
}
