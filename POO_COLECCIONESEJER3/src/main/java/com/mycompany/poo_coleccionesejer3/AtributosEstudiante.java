/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_coleccionesejer3;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class AtributosEstudiante {
    private String nombre;
    private ArrayList<Integer> notas;

    public AtributosEstudiante() {
    }

    public AtributosEstudiante(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "AtributosEstudiante{" + "nombre=" + nombre + ", notas=" + notas + '}';
    }

   
    
}
