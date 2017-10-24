package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Coneccion {
	/*
	private String USERNAMEonline = "sql10187565";
	private String PASSWORDonline = "XCBkNTSG46";
	private String Hostonline="sql10.freemysqlhosting.net";
	private String Basededatosonline="sql10187565";
	*/
	private boolean ola=true;
	private String USERNAME= "root";
	private String PASSWORD= "";
	private String HOST = "localhost";
	private String PORT = "3306";
	private String DATABASE = "libretavirtual";
	private String CLASSNAME = "com.mysql.jdbc.Driver";
	
	
	
	private String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
	
	
	private Connection con;
	
	
	public Coneccion(){
		try {
			Class.forName(CLASSNAME);
			con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (ClassNotFoundException e) {
			System.err.println("Error "+e);
		}catch(SQLException e){
			ola=false;
		}
	}
	
	
	
	public Connection getConeccion(){
		return con;
	}
	
	public boolean comprueba(boolean comp){
		if(ola==false){
			return comp=false;
		}else{
			return comp=true;
		}
		
		
	}
	
}
