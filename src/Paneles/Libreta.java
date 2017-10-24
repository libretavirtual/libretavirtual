package Paneles;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;

import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;

import Animacion.Animacion;
import Controlador.Consultas;
import Principal.RSButtonMetro;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Cursor;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;



public class Libreta extends JPanel {
	/**
	 * 
	 */
	private int x,y;
	private static final long serialVersionUID = 1L;
	private RSButtonMetro uno,dos,tres,seis,siete,buttonMetro;
	private JPanel panel_4,principal  ;
	public int largo= 524 , ancho= 280;
	/**
	 * Create the panel.
	 */
	public Libreta(JFrame frame,String user,JPanel panelcontenedordalso) {
		setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(169, 169, 169), new Color(128, 128, 128)));
		setBackground(Color.WHITE);
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.textHighlight);
		
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Libreta.class.getResource("/Imagenes/Minimizarnormal.png")));
		
		
		if(frame.getExtendedState() == JFrame.MAXIMIZED_BOTH){
			 label_2.setIcon(new ImageIcon(Libreta.class.getResource("/Imagenes/Minimizarnormal.png")));
		}else{
			label_2.setIcon(new ImageIcon(Libreta.class.getResource("/Imagenes/maximizarnormal.png")));
		}
		
		JLabel label = new JLabel("");
	
		label.addMouseMotionListener(new MouseMotionAdapter() {
			
			public void mouseDragged(MouseEvent e) {
				Point point = MouseInfo.getPointerInfo().getLocation();
				frame.setLocation(point.x - x, point.y - y);
			}
		});
		label.addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {
				 x = e.getX();
	             y = e.getY();
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 2){
					if(frame.getExtendedState() == JFrame.MAXIMIZED_BOTH){
						frame.setSize(800,600);
						frame.setLocationRelativeTo(null);
						label_2.setIcon(new ImageIcon(Libreta.class.getResource("/Imagenes/maximizarnormal.png")));
			        }else{
			        	frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
			            label_2.setIcon(new ImageIcon(Libreta.class.getResource("/Imagenes/Minimizarnormal.png")));
			        }
				}
			}
		});
			
		
		
		JLabel label_1 = new JLabel("-");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label_1.setBackground(new Color(30, 144, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				label_1.setBackground(SystemColor.textHighlight);
			}
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setExtendedState(JFrame.ICONIFIED);
			}
		});
		
		
		label_1.setOpaque(true);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_1.setBackground(SystemColor.textHighlight);
		
		
		
		label_2.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				
				
				
				if(frame.getExtendedState() == JFrame.MAXIMIZED_BOTH){
					frame.setSize(800,600);
					frame.setLocationRelativeTo(null);
					label_2.setIcon(new ImageIcon(Libreta.class.getResource("/Imagenes/maximizarnormal.png")));
					if(dos.isSelected()){
		        		largo=524;
						ancho=280;
						new CambiaPanel(principal, new PaginaWeb(largo,ancho));
		        	}

		        }else{
		        	if(dos.isSelected()){
						largo=1340;
			        	ancho=580;
			        	new CambiaPanel(principal, new PaginaWeb(largo,ancho));
					}
		        	
		        	frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		            label_2.setIcon(new ImageIcon(Libreta.class.getResource("/Imagenes/Minimizarnormal.png")));
		        }
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				if(frame.getExtendedState() == JFrame.MAXIMIZED_BOTH){
					label_2.setIcon(new ImageIcon(Libreta.class.getResource("/Imagenes/Minimizarpress.png")));
				}else{
					label_2.setIcon(new ImageIcon(Libreta.class.getResource("/Imagenes/maximizarpress.png")));
				}
			}
			public void mouseExited(MouseEvent e) {
				if(frame.getExtendedState() == JFrame.MAXIMIZED_BOTH){
					label_2.setIcon(new ImageIcon(Libreta.class.getResource("/Imagenes/Minimizarnormal.png")));
				}else{
					label_2.setIcon(new ImageIcon(Libreta.class.getResource("/Imagenes/maximizarnormal.png")));
				}
			}
		});
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label_3 = new JLabel("X");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);;
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				label_3.setBackground(new Color(30, 144, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				label_3.setBackground(SystemColor.textHighlight);
			}
		});
		
		label_3.setOpaque(true);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_3.setBackground(SystemColor.textHighlight);
		
		principal = new JPanel();
		principal.setBackground(Color.WHITE);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 153, 255));
		
		
		
		
		buttonMetro = new RSButtonMetro();
		buttonMetro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent a) {
				
				int posicion =panel_4.getX();
				int posicion3=principal.getWidth();
				
				
				if(posicion <-1){
					Animacion.mover_derecha(-222, 0, 2, 2, panel_4);
					Animacion.mover_derecha(0, 222, 2, 2, principal);
					principal.setSize(posicion3-222,principal.getHeight());
				}else{
					Animacion.mover_izquierda(0, -222, 2, 2, panel_4);
					Animacion.mover_izquierda(222, 0, 2, 2, principal);
					principal.setSize(posicion3+222,principal.getHeight());
					
					
				}
				
			}
		});
		
		
		
		
		buttonMetro.setIcon(new ImageIcon(Libreta.class.getResource("/Imagenes/menu.png")));
		buttonMetro.setForeground(new Color(0, 153, 255));
		buttonMetro.setColorTextPressed(new Color(0, 153, 255));
		buttonMetro.setColorTextNormal(new Color(0, 153, 255));
		buttonMetro.setColorTextHover(new Color(0, 153, 255));
		buttonMetro.setColorPressed(new Color(0, 153, 255));
		buttonMetro.setColorNormal(new Color(0, 153, 255));
		buttonMetro.setColorHover(new Color(0, 153, 255));
		buttonMetro.setColorBorde(null);
		buttonMetro.setBackground(new Color(0, 153, 255));
		
		
		JLabel imagen = new JLabel("");
		imagen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new CambiaPanel(principal, new Configuraciones(user));
			}
		});
		imagen.setHorizontalAlignment(SwingConstants.RIGHT);
		imagen.setHorizontalTextPosition(SwingConstants.LEFT);
		imagen.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		imagen.setBounds(394, 36, 86, 72);
		imagen.setForeground(Color.WHITE);
		imagen.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel label_5 = new JLabel("");
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				new CambiaPanel(principal, new Configuraciones(user));
			}
		});
		label_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(buttonMetro, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
					.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(imagen, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap(47, Short.MAX_VALUE)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel_3.createSequentialGroup()
							.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
								.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
								.addComponent(buttonMetro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())
						.addComponent(imagen, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)))
		);
		panel_3.setLayout(gl_panel_3);
		
		panel_4 = new JPanel();
		panel_4.setBackground(new Color(239, 238, 244));
		
		uno = new RSButtonMetro();
		uno.setIcon(new ImageIcon(Libreta.class.getResource("/Imagenes/home.png")));
		uno.setText("  Inicio");
		uno.setHorizontalAlignment(SwingConstants.LEFT);
		uno.setFont(new Font("Tahoma", Font.BOLD, 22));
		uno.setColorTextPressed(new Color(169, 169, 169));
		uno.setColorTextNormal(new Color(169, 169, 169));
		uno.setColorTextHover(new Color(169, 169, 169));
		uno.setColorPressed(new Color(211, 211, 211));
		uno.setColorNormal(new Color(211, 211, 211));
		uno.setColorHover(new Color(211, 211, 211));
		uno.setBackground(new Color(211, 211, 211));
		uno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                unoMousePressed(evt);
            }
            private void unoMousePressed(java.awt.event.MouseEvent evt) {
                
            	uno.setSelected(true);
                dos.setSelected(false);
                tres.setSelected(false);
                seis.setSelected(false);
                siete.setSelected(false);
            }
        });
	uno.addActionListener(new java.awt.event.ActionListener() {
	    public void actionPerformed(java.awt.event.ActionEvent evt) {
	        unoActionPerformed(evt);
	    }
	    private void unoActionPerformed(java.awt.event.ActionEvent evt) {
	    	new CambiaPanel(principal, new Inicio());
	        if(uno.isSelected()){
	            uno.setColorNormal(new Color(204,204,204));
	            uno.setColorHover(new Color(204,204,204));
	            uno.setColorPressed(new Color(204,204,204));
	            
	            dos.setColorNormal(new Color(239,238,244));
	            dos.setColorHover(new Color(204,204,204));
	            dos.setColorPressed(new Color(204,204,204));
	            
	            tres.setColorNormal(new Color(239,238,244));
	            tres.setColorHover(new Color(204,204,204));
	            tres.setColorPressed(new Color(204,204,204));
	            
	            seis.setColorNormal(new Color(239,238,244));
	            seis.setColorHover(new Color(204,204,204));
	            seis.setColorPressed(new Color(204,204,204));
	            
	            siete.setColorNormal(new Color(239,238,244));
	            siete.setColorHover(new Color(204,204,204));
	            siete.setColorPressed(new Color(204,204,204));
	            
	        }else{
	            uno.setColorNormal(new Color(239,238,244));
	            uno.setColorHover(new Color(204,204,204));
	            uno.setColorPressed(new Color(204,204,204));
	        }
	    }
	});
		
		
		
		dos = new RSButtonMetro();
		dos.setIcon(new ImageIcon(Libreta.class.getResource("/Imagenes/web.png")));
		dos.setText("  Pagina Web");
		dos.setHorizontalAlignment(SwingConstants.LEFT);
		dos.setFont(new Font("Tahoma", Font.BOLD, 22));
		dos.setColorTextPressed(new Color(169, 169, 169));
		dos.setColorTextNormal(new Color(169, 169, 169));
		dos.setColorTextHover(new Color(169, 169, 169));
		dos.setColorPressed(new Color(211, 211, 211));
		dos.setColorNormal(new Color(239, 238, 244));
		dos.setColorHover(new Color(211, 211, 211));
		dos.setBackground(new Color(239, 238, 244));
		dos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dosMousePressed(evt);
            }

				 private void dosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dosMousePressed
				        uno.setSelected(false);
				        dos.setSelected(true);
				        tres.setSelected(false);
				        seis.setSelected(false);
				        siete.setSelected(false);
				        
				    }
        });
	dos.addActionListener(new java.awt.event.ActionListener() {
	    public void actionPerformed(java.awt.event.ActionEvent evt) {
	        dosActionPerformed(evt);
	    }
	    private void dosActionPerformed(java.awt.event.ActionEvent evt) {
	    	if(frame.getExtendedState() == JFrame.MAXIMIZED_BOTH){
	    		largo=1340;
	        	ancho=580;
	        	new CambiaPanel(principal, new PaginaWeb(largo,ancho));
	        }else{
	        	largo=524;
				ancho=280;
				new CambiaPanel(principal, new PaginaWeb(largo,ancho));
	        	
	        }
	    	
	    	
	        if(dos.isSelected()){
	            dos.setColorNormal(new Color(204,204,204));
	            dos.setColorHover(new Color(204,204,204));
	            dos.setColorPressed(new Color(204,204,204));
	            
	            uno.setColorNormal(new Color(239,238,244));
	            uno.setColorHover(new Color(204,204,204));
	            uno.setColorPressed(new Color(204,204,204));
	            
	            tres.setColorNormal(new Color(239,238,244));
	            tres.setColorHover(new Color(204,204,204));
	            tres.setColorPressed(new Color(204,204,204));
	            
	            seis.setColorNormal(new Color(239,238,244));
	            seis.setColorHover(new Color(204,204,204));
	            seis.setColorPressed(new Color(204,204,204));
	            
	            siete.setColorNormal(new Color(239,238,244));
	            siete.setColorHover(new Color(204,204,204));
	            siete.setColorPressed(new Color(204,204,204));
	          
	        }else{
	            dos.setColorNormal(new Color(239,238,244));
	            dos.setColorHover(new Color(204,204,204));
	            dos.setColorPressed(new Color(204,204,204));
	        }
	    }
	});
	
		
		
		tres = new RSButtonMetro();
		tres.setIcon(new ImageIcon(Libreta.class.getResource("/Imagenes/feeedback.png")));
		tres.setText("  Grupos");
		tres.setHorizontalAlignment(SwingConstants.LEFT);
		tres.setFont(new Font("Tahoma", Font.BOLD, 22));
		tres.setColorTextPressed(new Color(169, 169, 169));
		tres.setColorTextNormal(new Color(169, 169, 169));
		tres.setColorTextHover(new Color(169, 169, 169));
		tres.setColorPressed(new Color(211, 211, 211));
		tres.setColorNormal(new Color(239, 238, 244));
		tres.setColorHover(new Color(211, 211, 211));
		tres.setBackground(new Color(239, 238, 244));
		tres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tresMousePressed(evt);
            }
            private void tresMousePressed(java.awt.event.MouseEvent evt) {
                uno.setSelected(false);
                dos.setSelected(false);
                tres.setSelected(true);
                seis.setSelected(false);
                siete.setSelected(false);
            }
        });
		tres.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent evt) {
		        tresActionPerformed(evt);
		    }
		    private void tresActionPerformed(java.awt.event.ActionEvent evt) {
		    	new CambiaPanel(principal, new Grupos());
		        if(tres.isSelected()){
		            tres.setColorNormal(new Color(204,204,204));
		            tres.setColorHover(new Color(204,204,204));
		            tres.setColorPressed(new Color(204,204,204));
		            
		            uno.setColorNormal(new Color(239,238,244));
		            uno.setColorHover(new Color(204,204,204));
		            uno.setColorPressed(new Color(204,204,204));
		            
		            dos.setColorNormal(new Color(239,238,244));
		            dos.setColorHover(new Color(204,204,204));
		            dos.setColorPressed(new Color(204,204,204));
		        
		            seis.setColorNormal(new Color(239,238,244));
		            seis.setColorHover(new Color(204,204,204));
		            seis.setColorPressed(new Color(204,204,204));
		            
		            siete.setColorNormal(new Color(239,238,244));
		            siete.setColorHover(new Color(204,204,204));
		            siete.setColorPressed(new Color(204,204,204));
		        }else{
		            tres.setColorNormal(new Color(239,238,244));
		            tres.setColorHover(new Color(204,204,204));
		            tres.setColorPressed(new Color(204,204,204));
		        }
		    }
		});
		
		seis = new RSButtonMetro();
		seis.setIcon(new ImageIcon(Libreta.class.getResource("/Imagenes/settings.png")));
		seis.setText("  Configuracion");
		seis.setHorizontalAlignment(SwingConstants.LEFT);
		seis.setFont(new Font("Tahoma", Font.BOLD, 22));
		seis.setColorTextPressed(new Color(169, 169, 169));
		seis.setColorTextNormal(new Color(169, 169, 169));
		seis.setColorTextHover(new Color(169, 169, 169));
		seis.setColorPressed(new Color(211, 211, 211));
		seis.setColorNormal(new Color(239, 238, 244));
		seis.setColorHover(new Color(211, 211, 211));
		seis.setBackground(new Color(239, 238, 244));
		seis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                seisMousePressed(evt);
            }
            private void seisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seisMousePressed
				uno.setSelected(false);
				dos.setSelected(false);
				tres.setSelected(false);
				seis.setSelected(true);
				siete.setSelected(false);
				
			}
        });
	seis.addActionListener(new java.awt.event.ActionListener() {
	    public void actionPerformed(java.awt.event.ActionEvent evt) {
	        seisActionPerformed(evt);
	    }
	    private void seisActionPerformed(java.awt.event.ActionEvent evt) {
	    	new CambiaPanel(principal, new Configuraciones(user));

	    	if(seis.isSelected()){
	            uno.setColorNormal(new Color(239,238,244));
	            uno.setColorHover(new Color(204,204,204));
	            uno.setColorPressed(new Color(204,204,204));
	            
	            dos.setColorNormal(new Color(239,238,244));
	            dos.setColorHover(new Color(204,204,204));
	            dos.setColorPressed(new Color(204,204,204));
	            
	            tres.setColorNormal(new Color(239,238,244));
	            tres.setColorHover(new Color(204,204,204));
	            tres.setColorPressed(new Color(204,204,204));
	            
	            seis.setColorNormal(new Color(204,204,204));
	            seis.setColorHover(new Color(204,204,204));
	            seis.setColorPressed(new Color(204,204,204));
	            
	            siete.setColorNormal(new Color(239,238,244));
	            siete.setColorHover(new Color(204,204,204));
	            siete.setColorPressed(new Color(204,204,204));
	        }else{
	            seis.setColorNormal(new Color(239,238,244));
	            seis.setColorHover(new Color(204,204,204));
	            seis.setColorPressed(new Color(204,204,204));
	        }
	    }
	});
	
		
		
		siete = new RSButtonMetro();
		siete.setIcon(new ImageIcon(Libreta.class.getResource("/Imagenes/logout-xxl.png")));
		siete.setText("  Cerrar Sesion");
		siete.setHorizontalAlignment(SwingConstants.LEFT);
		siete.setFont(new Font("Tahoma", Font.BOLD, 22));
		siete.setColorTextPressed(new Color(169, 169, 169));
		siete.setColorTextNormal(new Color(169, 169, 169));
		siete.setColorTextHover(new Color(169, 169, 169));
		siete.setColorPressed(new Color(211, 211, 211));
		siete.setColorNormal(new Color(239, 238, 244));
		siete.setColorHover(new Color(211, 211, 211));
		siete.setBackground(new Color(239, 238, 244));
		siete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sieteMousePressed(evt);
            }
            private void sieteMousePressed(java.awt.event.MouseEvent evt) {
                uno.setSelected(false);
                dos.setSelected(false);
                tres.setSelected(false);
                seis.setSelected(false);
                siete.setSelected(true);
            }
		@Override
		public void mouseClicked(MouseEvent ev) {
			frame.setSize(490, 514);
			new CambiaPanel(panelcontenedordalso, new Carga_RegistroLogin(frame));	
		}
        });
	siete.addActionListener(new java.awt.event.ActionListener() {
	    public void actionPerformed(java.awt.event.ActionEvent evt) {
	        sieteActionPerformed(evt);
	    }
	    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {
	        if(siete.isSelected()){
	            uno.setColorNormal(new Color(239,238,244));
	            uno.setColorHover(new Color(204,204,204));
	            uno.setColorPressed(new Color(204,204,204));
	            
	            dos.setColorNormal(new Color(239,238,244));
	            dos.setColorHover(new Color(204,204,204));
	            dos.setColorPressed(new Color(204,204,204));
	            
	            tres.setColorNormal(new Color(239,238,244));
	            tres.setColorHover(new Color(204,204,204));
	            tres.setColorPressed(new Color(204,204,204));
	 
	            seis.setColorNormal(new Color(239,238,244));
	            seis.setColorHover(new Color(204,204,204));
	            seis.setColorPressed(new Color(204,204,204));
	            
	            siete.setColorNormal(new Color(204,204,204));
	            siete.setColorHover(new Color(204,204,204));
	            siete.setColorPressed(new Color(204,204,204));
	        }else{
	            siete.setColorNormal(new Color(239,238,244));
	            siete.setColorHover(new Color(204,204,204));
	            siete.setColorPressed(new Color(204,204,204));
	        }
	    }
	});
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

		
		
		
		
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addComponent(uno, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
				.addComponent(dos, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
				.addComponent(tres, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
				.addComponent(seis, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
				.addComponent(siete, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(22)
					.addComponent(uno, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addComponent(dos, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addComponent(tres, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
					.addComponent(seis, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(0)
					.addComponent(siete, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(11))
		);
		panel_4.setLayout(gl_panel_4);
		panel.add(panel_1);
		add(panel);
		
		
		ImageIcon imguser=new ImageIcon("src/Imagenes/register-icon.png");
		Icon icono=new ImageIcon(imguser.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_DEFAULT));
		imagen.setIcon(icono);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
				.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addComponent(principal, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 370, Short.MAX_VALUE)
						.addComponent(principal, GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)))
		);
		principal.setLayout(new BoxLayout(principal, BoxLayout.X_AXIS));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(label, GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addComponent(label_2)
					.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addComponent(label, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
				.addComponent(label_1)
				.addComponent(label_2)
				.addComponent(label_3)
		);
		panel_2.setLayout(gl_panel_2);
		panel_1.setLayout(gl_panel_1);
		this.repaint();
		
		Consultas con=new Consultas();
		String Nombre =new String (con.datos(user));

	}
	
	
}
