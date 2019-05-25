package com.restaurant.entiy;
// Generated 25-05-2019 13:17:54 by Hibernate Tools 4.3.1



/**
 * Producto generated by hbm2java
 */
public class Producto  implements java.io.Serializable {


     private int idProducto;
     private TipoProducto tipoProducto;
     private String descripcion;
     private String nombre;
     private Integer precio;

    public Producto() {
    }

	
    public Producto(int idProducto) {
        this.idProducto = idProducto;
    }
    public Producto(int idProducto, TipoProducto tipoProducto, String descripcion, String nombre, Integer precio) {
       this.idProducto = idProducto;
       this.tipoProducto = tipoProducto;
       this.descripcion = descripcion;
       this.nombre = nombre;
       this.precio = precio;
    }
   
    public int getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public TipoProducto getTipoProducto() {
        return this.tipoProducto;
    }
    
    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }




}

