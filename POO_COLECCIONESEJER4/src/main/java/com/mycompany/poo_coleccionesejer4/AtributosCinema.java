/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_coleccionesejer4;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author User
 */
public class AtributosCinema {

    private String titulo;
    private String director;
    private Integer duracion;

   

    public AtributosCinema() {
    }

    public AtributosCinema(String titulo, String director, Integer duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        
    }

    public String getTitulo() {
        return titulo;
    }
//
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }
    
    
  
    
    
    public static Comparator<AtributosCinema> compararTitulo = new Comparator<AtributosCinema>() { // Creamos un objeto comparator 
        @Override // Usamos el override para traer un metodo de otra clase y poder usarlo
        public int compare (AtributosCinema objeto1, AtributosCinema objeto2) { // Le pasamos dos objetos a comparar
        
            return   objeto1.getTitulo().compareTo(objeto2.getTitulo());      // Los comparamos usando el get y el compareTo
                
            }
         
         
        
    };
    
    
    
    
    
    

     
    

    @Override
    public String toString() {
        return '(' + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + "horas"+ '}';
    }

   

   

}
