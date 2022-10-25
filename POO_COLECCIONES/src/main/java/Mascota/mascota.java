/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mascota;

import EjemploMascotas.ServicioMascota;

/**
 *
 * @author User
 */
public class mascota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioMascota sermac = new ServicioMascota();
        
        /// asi parezcan iguales con cada linea se ingresa una mascota diferente
        
        sermac.crearMascota();
        sermac.crearMascota();
        
        
        
        sermac.mostrarMascotas();
        
    }

    
    
}
