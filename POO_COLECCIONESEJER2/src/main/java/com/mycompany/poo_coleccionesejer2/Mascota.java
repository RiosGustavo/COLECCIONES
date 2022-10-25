/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo_coleccionesejer2;

import Servicio.servicioMascota;

/**
 *
 * @author User
 */
public class Mascota {

    public static void main(String[] args) {
       servicioMascota crear = new servicioMascota();
       
       crear.crearMascota();
       crear.mostrarMascotas();
       crear.RecorrerArray();
    }
}
