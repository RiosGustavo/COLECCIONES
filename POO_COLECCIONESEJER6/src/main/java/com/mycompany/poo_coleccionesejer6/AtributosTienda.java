/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_coleccionesejer6;

/**
 *
 * @author User
 */
public class AtributosTienda {
   
   
    private String nombre;   //(codigo)
    
     private Integer precio;

    public AtributosTienda() {
    }

    public AtributosTienda(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "AtributosTienda{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }

   

   

   

   
    
}
