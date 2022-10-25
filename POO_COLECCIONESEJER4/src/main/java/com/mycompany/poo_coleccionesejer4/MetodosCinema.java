/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_coleccionesejer4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class MetodosCinema {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    ArrayList<AtributosCinema> peliculas = new ArrayList<>();

    public void crearPelicula() {

        /// llamamos el arrayList para crear y agregar peliculas
        System.out.println("Ingrese los datos de la pelicula a crear");

        String respuesta = "si";

        do {

            System.out.println("Titulo de la pelicula");
            String titulo = leer.next();

            System.out.println("Director de la pelicula");
            String director = leer.next();

            System.out.println("Duracion de la pelicula en horas");
            Integer duracion = leer.nextInt();

            System.out.println("desea agregar otra pelicula a la lista");
            System.out.println(" si / no");
            respuesta = leer.next();

            peliculas.add(new AtributosCinema(titulo, director, duracion));

        } while (respuesta.equalsIgnoreCase("si"));

    }

    public void mostrarPeliculas() {
        // utilizo el FOREACH - ATAJO NETBEANS fore+TAB - Forma rapida de recorrer colecciones  
        System.out.println("El listado de peliculas ingresado Es:");
        System.out.println("*****************************");

        for (AtributosCinema pelicula : peliculas) {
            System.out.println(pelicula);
        }

        System.out.println("*****************************");

    }

    // public static Comparator<AtributosCinema> compararMayorque = new Comparator<AtributosCinema>() { // Creamos un objeto comparator 
      //  @Override // Usamos el override para traer un metodo de otra clase y poder usarlo
//        public int compare (AtributosCinema objeto1, AtributosCinema objeto2) { // Le pasamos dos objetos a comparar
//        
//            if (objeto1.getDuracion() > 1 && objeto2.getDuracion() >1){
//                System.out.println(objeto1.getDuracion().compareTo(objeto2.getDuracion()));  
//                
//            }
//         
//         return   objeto1.getDuracion().compareTo(objeto2.getDuracion());      // Los comparamos usando el get y el compareTo
//        }
  //  };
    
    public void ordenarDuracionHora() {
        
        System.out.println("Peliculas ordenadas por Duracion mayor a una hora");
        System.out.println("**********************************");
        for (AtributosCinema pelicula : peliculas) {
            if(pelicula.getDuracion() > 1){
                 System.out.println(pelicula);
            }
           
        }
       
        
       

        System.out.println("*****************************");

    }

     //Dejo estructura modelo comentada // Para que entiendan que dato reemplazo a cual en este ejemplpo
        //     Collections.sort(NombreLista, 
        //  (ClaseAtributos objeto1, ClaseAtributos objeto2) -> objeto1.getAtriutoPaComparar().compareTo(objeto2.getAtriutoPaComparar()));    
    
    public void ordenarPorDuracion() {

        System.out.println("Peliculas ordenadas por Duracion menor a mayor");
        System.out.println("**********************************");
        Collections.sort(peliculas,
                (AtributosCinema objeto1, AtributosCinema objeto2) -> objeto1.getDuracion().compareTo(objeto2.getDuracion()));

    }

    public void ordenarPorDuracion_mayor_menor() {

        System.out.println("Peliculas ordenadas por Duracion Mayor a menor");
        System.out.println("**********************************");
        Collections.sort(peliculas,
                (AtributosCinema objeto1, AtributosCinema objeto2) -> objeto2.getDuracion().compareTo(objeto1.getDuracion()));

    }

    public void ordenarPorTitulo() {

        System.out.println("Peliculas ordenadas por titulo");
        System.out.println("**********************************");
        Collections.sort(peliculas,
                (AtributosCinema objeto1, AtributosCinema objeto2) -> objeto1.getTitulo().compareTo(objeto2.getTitulo()));

    }

    public void ordenarPorDirector() {

        System.out.println("Peliculas ordenadas por Director");
        System.out.println("**********************************");
        Collections.sort(peliculas,
                (AtributosCinema objeto1, AtributosCinema objeto2) -> objeto1.getDirector().compareTo(objeto2.getDirector()));

    }

    public void Menu() {

        int numeros = 0;

        do {
            System.out.println("""
                               Menu
                               1. crearPelicula
                               2. mostrarPeliculas
                               3. ordenarPorTitulo
                               4. ordenarPorDirector
                               5. ordenarPorDuracion_nenor_Mayor
                               6. ordenarPorDuracion_mayor_menor
                               7. ordenarDuracion mayor a 1 Hora
                               8. salir
                               """);
            numeros = leer.nextInt();

            switch (numeros) {

                case 1:
                    crearPelicula();
                    break;

                case 2:

                    mostrarPeliculas();
                    break;
                case 3:
                    ordenarPorTitulo();
                    mostrarPeliculas();
                    break;

                case 4:

                    ordenarPorDirector();
                    mostrarPeliculas();
                    break;

                case 5:
                    ordenarPorDuracion();
                    mostrarPeliculas();
                    break;

                case 6:

                    ordenarPorDuracion_mayor_menor();
                    mostrarPeliculas();
                    break;

                case 7:

                   ordenarDuracionHora();
                    break;

                case 8:
                    System.out.println("fin del programa");
                    break;
            }

        } while (numeros != 8);

    }
}