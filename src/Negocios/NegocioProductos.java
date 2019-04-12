
package Negocios;

import Datos.MantenimientoProductos;
import Datos.Productos;


public class NegocioProductos {
    
MantenimientoProductos mp;    
    
    public void puente_registro(Productos pdto) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        mp = new MantenimientoProductos();
        mp.RegistroNuevo(pdto);
    }
    
}
