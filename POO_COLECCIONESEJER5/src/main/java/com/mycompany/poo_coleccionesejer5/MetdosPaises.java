/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_coleccionesejer5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class MetdosPaises {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    /// CONJUNTO
    HashSet<AtributosPaises> paises = new HashSet();
    // HAY QUE CONVERTIR EL HashSet a LISTA PARA PODER ORDENARLO
    ArrayList<AtributosPaises> paiseslista = new ArrayList(paises);
    // Collections.sort(paiseslista);

    public void crearPaises() {

        String respuesta = "si";
        do {
            System.out.println("Ingrese nombre del pais");
            String pais = (leer.next());

            System.out.println("desea agregar otro pais a la lista");
            System.out.println(" si / no");
            respuesta = leer.next();
            //Si no creo mi HasCode en"AtributosPaises" no encontrara duplicidad porque su parametro es espacio de mmoria    

            paises.add(new AtributosPaises(pais));
            paiseslista.add(new AtributosPaises(pais));
        } while (respuesta.equalsIgnoreCase("si"));

    }

    public void motrarPaises() {
//// ACA UTILIZAMOS EL HASHSET PARA QUE NO INGRESE DUPLICADOS
        for (AtributosPaises pais : paises) {
            System.out.println(pais);

        }

    }

    ///CON ESTE METODO ORDENAMOS EL CONJUNTO CON COMPARATOR
/// esto  es lo mismo que 
    public static Comparator<AtributosPaises> compararNombre = (AtributosPaises objeto1, AtributosPaises objeto2) -> objeto1.getPais().compareTo(objeto2.getPais());

///QUE ESTO
////       public static Comparator<AtributosCinema> compararMayorque = new Comparator<AtributosCinema>() { // Creamos un objeto comparator 
////        @Override // Usamos el override para traer un metodo de otra clase y poder usarlo
////        public int compare (AtributosCinema objeto1, AtributosCinema objeto2) { // Le pasamos dos objetos a comparar
////                             
////         return   objeto1.getDuracion().compareTo(objeto2.getDuracion());      // Los comparamos usando el get y el compareTo
////        }
////    };
    public void ordenarPorOrdenAlfabetico() {/// ACA UTILIZAMOS EL ARRAY PORQUE EL HASHSET NO SIRVE
        System.out.println("Paises ordenados por orden Alfabetico");
        System.out.println("**********************************");

        paiseslista.sort(compararNombre);

//        for (AtributosPaises paise : paiseslista) {
//            System.out.println(paise);
//
//        }
    }

    public void buscarElimar() {
        System.out.println("Ingrese el PAIS que  desea ELIMINAR de la lista");
        String varElegido = leer.next();
        
        /// acca utilizamos el conjunto HASHSET

// Uso el iterador, porque si uso FOREACH da error
        Iterator<AtributosPaises> it = paises.iterator();
        while (it.hasNext()) {
            if (it.next().getPais().equals(varElegido)) { // Si se cumple la condicion de encontrar "Ese pais elegido,lo elimina)
                it.remove();
            }

        }
        System.out.println("El pais no se encontro");

    }

    public void Menu() {

        int numeros = 0;

        do {
            System.out.println("""
                               Menu
                               1. INGRESAR PAIS
                               2. ELIMINAR PAIS
                               3. SALIR
                               """);
            numeros = leer.nextInt();

            switch (numeros) {

                case 1:
                    crearPaises();
                    ordenarPorOrdenAlfabetico();
                    motrarPaises();

                    break;

                case 2:
                    buscarElimar();
                    ordenarPorOrdenAlfabetico();
                    motrarPaises();
                    break;

                case 3:

                    System.out.println("fin del programa");

                    break;
            }

        } while (numeros != 3);

    }

}
