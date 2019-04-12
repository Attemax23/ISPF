
package Datos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MantenimientoProductos {
    
    Statement sentenciaSQL;
    BDOConexion con;
    
    
    public void RegistroNuevo(Productos pdto) throws  ClassNotFoundException, InstantiationException,IllegalAccessException{  
        //para hacer un registro nuevo necesitamos el objeto de productos (en etste caso)
         try{
        con = new BDOConexion();
        
     /*   sentenciaSQL = con.Conectarse().createStatement();
        sentenciaSQL.executeUpdate("INSERT INTO tblprodutos(clavepdto,descripcion,stock,precio,udmedida,fecha_ingreso,nocompra,codbarras,rutaimagen,claveprov,imagen) VALUES(" +pdto.getClavepdto()+",'"+ pdto.getDescripcion()+"',"+pdto.getStock()+","+pdto.getPrecio()+",'"+pdto.getUdMedida()+"','"+pdto.getFechaIngreso()+"',"+pdto.getNumcompra()+","+pdto.getCodigobarras()+",'"+pdto.getRutaimagen()+"',"+pdto.getClaveprovedor()+",'"+pdto.getImagen()+"')");
       */
     String insertar="INSERT INTO tblprodutos(clavepdto,descripcion,stock,precio,udmedida,fecha_ingreso,nocompra,codbarras,rutaimagen,claveprov,imagen) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
     // *******************Convertir la imagen a bits*********************************
             FileInputStream archivofoto;
             archivofoto= new FileInputStream(pdto.getImagen());
             //********************************************************************
             PreparedStatement pst= con.Conectarse().prepareStatement(insertar);
             pst.setInt(1, pdto.getClavepd());
             pst.setString(2, pdto.getDescripcion());
             pst.setInt(3, pdto.getStock());
             pst.setFloat(4,pdto.getPrecio());
             pst.setString(5, pdto.getUdMedida());
             pst.setDate(6,pdto.getFechaIngreso());
             pst.setInt(7,pdto.getNumcompra());
             pst.setLong(8,pdto.getCodigobarras());
             pst.setString(9,pdto.getRutaimagen());
             pst.setInt(10,pdto.getClaveprovedor());
             pst.setBinaryStream(11, archivofoto);
     
             int n=pst.executeUpdate();
             if(n>0){
                 JOptionPane.showMessageDialog(null,"Registro Guardado","Confiramcion",JOptionPane.INFORMATION_MESSAGE);
             }
     con.CerrarConexion();
     
} catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"clase no encontrada "+ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MantenimientoProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
  // aqui se combina codigo de java con codigo de SQLServer
        
    }
    
    
    
}
