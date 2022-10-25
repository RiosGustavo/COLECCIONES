/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploMascotas2;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import mascota2.mascota2;



/**
 *
 * @author User
 */
public class ServicioMascotas2 {
     private Scanner leer;
     
     // se cambio el tipo String del ejemplo anterior por mascota
    private List<mascota2> mascotas;

    public ServicioMascotas2() {
        this.leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        this.mascotas = new ArrayList();
    }

    
    // ya no es void sino mascota
    public mascota2 crearMascota() {
        System.out.println("Introducir Nombre");
        String nombre = leer.next();
        System.out.println("Introducri Apodo");
        String apodo = leer.next();
        System.out.println("Introducir Tipo");
        String tipo = leer.next();

        
        /// se creo un return del tipo mascota con los datos que recibe el constructor
        return new mascota2();
    }

    public void mostrarMascotas() {

        // for each
        System.out.println("Las mascotas actuales de la lista son: ");
        for (mascota2 aux : mascotas) {
            
            System.out.println(aux);

        }
        System.out.println("Cantidad "+mascotas.size());

    }
    
    
}
