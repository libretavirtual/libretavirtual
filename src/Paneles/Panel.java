package Paneles;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JLabel;



public class Panel extends Container{

public ImageIcon icono;
public JLabel labelTitulo;

public Panel(){
	
 icono = new ImageIcon (getClass().getResource("/imagenes/portada.jpg"));
 labelTitulo= new JLabel();
 labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 28));
 labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
 labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
 labelTitulo.setText("IMAGEN DE FONDO");
 labelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder
 (javax.swing.border.BevelBorder.LOWERED));
 labelTitulo.setBounds(20, 10, 300, 40);
 add(labelTitulo);
} 

public void paint (Graphics g)
	{
	Rectangle r = g.getClipBounds();
	g.setColor(this.getBackground());
	g.fillRect (r.x, r.y, r.width, r.height);
	g.drawImage (icono.getImage(), 0, 0, this.getWidth(),
	this.getHeight(), this.getBackground(), this);
	super.paint(g);
 }
}