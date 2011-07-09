/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hospitalpets.control;

import java.sql.*;

/**
 *
 * @author Miguel Angel
 */
public class CrearBaseDeDatos {
    private static Connection conectar;
	private static Statement sentencia;
	private static CrearBaseDeDatos con = null;

	public CrearBaseDeDatos(){
		conectado("","root","hospitalpets");
	}
	public static void conectado(String contrasenia, String nombre_usuario, String dataBase){
		conectar = null;
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();

                        conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/?",nombre_usuario,"");
			sentencia = conectar.createStatement();

                        sentencia.executeUpdate("CREATE DATABASE IF NOT EXISTS "+dataBase);
                        sentencia.executeUpdate("USE "+dataBase);
		}catch(Exception e){
			 System.out.println("Error en conexion"+e);
                        return;
		}
	}
       
}
