package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class BDOConexion {
   
    private Connection conexion=null;   //variable para conexion
    private Statement sentenciaSQL; //variable para crear sentencias: insert into, select, delete, update
    private ResultSet resultado;   //generar tablas temporales 
    
    public BDOConexion() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
        String controlador="com.mysql.jdbc.Driver";
        Class.forName(controlador).newInstance();
        
        String URL="jdbc:mysql://localhost:3306/bdabarrotes?zeroDateTimeBehavior=convertToNulll";
        String usuario="root";
        String contraseña="";
        
        conexion=DriverManager.getConnection(URL, usuario, contraseña);
    }
    
    public Connection Conectarse(){
        return conexion;
    }
    
    public void CerrarConexion() throws SQLException{
        if(resultado !=null){
            resultado.close();
        }
        if(sentenciaSQL !=null){
            sentenciaSQL.close();
        }
        if(conexion !=null){
            conexion.close();
        }
    }
}
