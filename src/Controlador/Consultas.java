package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class Consultas extends Coneccion{
	
	
	public boolean modificar(String Usuario,String Nombre){
		PreparedStatement pst=null;
		try {
			String Consulta="UPDATE libretavirtual SET Nombre= ? WHERE NombredeUsuario= ?";
			pst=getConeccion().prepareStatement(Consulta);
			pst.setString(1,Nombre);
			pst.setString(2, Usuario);
			
			
			if(pst.executeUpdate()==1){
				return true;
			}	
		} catch (Exception e) {
			System.err.println("Errores "+e);
			
		}
		
		return false;
		
		
	}
	
	
	
	public boolean autenticacion(String Usuarios ,String Contraseña){
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			String Consulta="select * from 	libretavirtual where NombredeUsuario = ? and Contraseña = ?";
			pst = getConeccion().prepareStatement(Consulta);
			pst.setString(1, Usuarios);
			pst.setString(2, Contraseña);
			rs=pst.executeQuery();
			
			if(rs.absolute(1)){
				return true;
			}
		} catch (Exception e) {
			System.err.println("Errores "+e);
			
		}finally {
			
			try {
				if(getConeccion() != null)getConeccion().close();
				if(pst != null)pst.close();
				if(rs != null)rs.close();
			} catch (Exception e2) {
				System.err.println("Error "+e2);
			}
		
		}
		return false;
	}
	
	
	
	public boolean profesor(String user){
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			String Consulta="select Profesor from libretavirtual where NombredeUsuario = ?";
			pst = getConeccion().prepareStatement(Consulta);
			pst.setString(1, user);
			rs=pst.executeQuery();
			
			while (rs.next())
			{
			
			if((boolean) rs.getObject("Profesor")){
				return true;
			}
			
			}
			rs.close();
			
			
		} catch (Exception e) {
			System.err.println("Errores "+e);
			
		}finally {
			
			try {
				if(getConeccion() != null)getConeccion().close();
				if(pst != null)pst.close();
				if(rs != null)rs.close();
			} catch (Exception e2) {
				System.err.println("Error "+e2);
			}
		
		}
		return false;
	}
	
	public String datos(String Usuario){
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			String consulta="select Nombre,Apellido,Correo from libretavirtual where NombredeUsuario = ?";
			pst=getConeccion().prepareStatement(consulta);
			pst.setString(1, Usuario);
			rs=pst.executeQuery();
			
			while (rs.next())
			{
			if(rs.absolute(1)){
				String nom=new String((String) rs.getObject("Nombre"));
				String ap=new String((String)  rs.getObject("Apellido"));
				String msn=new String((String)  rs.getObject("Correo"));
				
				return nom+"-"+ap+"-"+msn;
				}
			}
			rs.close();
		} catch (Exception e) {
			System.err.println("Errores "+e);
		}
		return null;
	}
	
	public boolean GuardarAnotaciones(String Usuario,String Nota){
			PreparedStatement pst=null;
		
		try {
			String prueba="UPDATE anotaciones SET NotasGuardadas= ? WHERE NombredeUsuario= ?";
			//String Consulta="insert into anotaciones (NotasGuardadas) values(?)";
			pst=getConeccion().prepareStatement(prueba);
			pst.setString(1,Nota );
			pst.setString(2,Usuario );
			
			
			if(pst.executeUpdate()==1){
				return true;
			}	
		} catch (Exception e) {
			System.err.println("Errores "+e);
			
		}
		
		return false;
	}
	
	
	public boolean registrar(String Usuarios,String Contraseña,String Nombre,String Apellido, String Correo,boolean profesor){
		PreparedStatement pst=null;
		
		try {
			String Consulta="insert into libretavirtual (NombredeUsuario, Contraseña, Nombre, Apellido, Correo, Profesor) values(?,?,?,?,?,?)";
			pst=getConeccion().prepareStatement(Consulta);
			
			pst.setString(1,Usuarios );
			pst.setString(2,Contraseña );
			pst.setString(3,Nombre );
			pst.setString(4,Apellido );
			pst.setString(5,Correo);
			pst.setBoolean(6,profesor);
			
			
			if(pst.executeUpdate()==1){
				return true;
			}
			
		} catch (Exception e) {
			//usuario ya registrado, error de primary key
			System.err.println("Error "+e);
		
		}finally {
			try {
				
				if(getConeccion() != null)getConeccion().close();
				if(pst != null)pst.close();
			
			}catch(Exception e){
				System.err.println("Error "+e);
			}
		}
		
		return false;
	}
	
}
