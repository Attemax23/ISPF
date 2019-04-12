
package Datos;

import java.sql.Date;

public class Productos {
    
    private int clavepd;
    private String descripcion;
    private int stock;
    private float precio;
    private String UdMedida;
    private Date fechaIngreso;
    private int numcompra;
    /*un entero muy largo */private long codigobarras;
    private String rutaimagen;
    private int Claveprovedor;
    private String Imagen;
    
    
    public Productos(int clavepd, String descripcion, int stock, float precio, String UdMedida, Date fechaIngreso, int numcompra, long codigobarras, String rutaimagen, int Claveprovedor,String Imagn) {
        this.clavepd = clavepd;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
        this.UdMedida = UdMedida;
        this.fechaIngreso = fechaIngreso;
        this.numcompra = numcompra;
        this.codigobarras = codigobarras;
        this.rutaimagen = rutaimagen;
        this.Claveprovedor = Claveprovedor;
        this.Imagen = Imagn;
    }
    
    public Productos(){
        
    }

    public int getClavepd() {
        return clavepd;
    }

    public void setClavepd(int clavepd) {
        this.clavepd = clavepd;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getUdMedida() {
        return UdMedida;
    }

    public void setUdMedida(String UdMedida) {
        this.UdMedida = UdMedida;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getNumcompra() {
        return numcompra;
    }

    public void setNumcompra(int numcompra) {
        this.numcompra = numcompra;
    }

    public long getCodigobarras() {
        return codigobarras;
    }

    public void setCodigobarras(long codigobarras) {
        this.codigobarras = codigobarras;
    }

    public String getRutaimagen() {
        return rutaimagen;
    }

    public void setRutaimagen(String rutaimagen) {
        this.rutaimagen = rutaimagen;
    }

    public int getClaveprovedor() {
        return Claveprovedor;
    }

    public void setClaveprovedor(int Claveprovedor) {
        this.Claveprovedor = Claveprovedor;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }
    
    
    
    
    
}
