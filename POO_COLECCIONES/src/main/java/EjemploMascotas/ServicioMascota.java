/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploMascotas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ServicioMascota {

    private Scanner leer;
    private List<String> mascotas;

    public ServicioMascota() {
        this.leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        this.mascotas = new ArrayList();

    }

    public void crearMascota() {
        System.out.println("Introducir Nombre");
        String nombre = leer.next();
        System.out.println("Introducri Apodo");
        String apodo = leer.next();
        System.out.println("Introducir Tipo");
        String tipo = leer.next();

        mascotas.add(nombre + " " + apodo + " " + tipo);
    }

    public void mostrarMascotas() {

        // for each
        System.out.println("Las mascotas actuales de la lista son: ");
        for (String aux : mascotas) {
            
            System.out.println(aux);

        }
        System.out.println("Cantidad "+mascotas.size());

    }

}
