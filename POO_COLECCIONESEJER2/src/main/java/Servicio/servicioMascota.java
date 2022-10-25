/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import com.mycompany.poo_coleccionesejer2.Mascota;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class servicioMascota {

    private Scanner leer;
    private List<String> mascotas;

    public servicioMascota() {
        this.leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        this.mascotas = new ArrayList();
    }

    public void crearMascota() {

        String op = "s";

        do {

            System.out.println("Por favor escriba la raza del perro ");
            String raza = leer.next();
            
            mascotas.add(raza);
          
           
           System.out.println("Desea ingresar mas razas ");
            op = leer.next();

        } while (op.equalsIgnoreCase("s"));
        

    }

    public void mostrarMascotas() {

        // for each
        System.out.println("Las razas de las  mascotas actuales de la lista son: ");
        for (String aux : mascotas) {

            System.out.println(aux.toString());

        }

    }

    public void RecorrerArray() {
        System.out.println("Ingrese una raza de perro para eliminarla");
        String eliminar = leer.next();
/// creamos el itarator
        Iterator<String> iterator = mascotas.iterator();

        while (iterator.hasNext()) {

            String aux = iterator.next();


/// con este eliminamos la raza
            if (aux.equalsIgnoreCase(eliminar)) {
                iterator.remove();

            }

        }

        /// con este mostramos el array nuevo
        System.out.println("Las razas de las  mascotas actuales de la lista son: ");
        for (String aux : mascotas) {

            System.out.println(aux.toString());

        }

    }

}


