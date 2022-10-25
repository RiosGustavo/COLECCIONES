/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_coleccionesejer3;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class MetodosEstudiante {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    ArrayList<AtributosEstudiante> estudiantes = new ArrayList();

    public void crearEstudiante() {
        AtributosEstudiante alumno = new AtributosEstudiante();
        String respuesta = "n";

        do {

            System.out.println("Ingrese nombre del alumno");
            alumno.setNombre(leer.next());

            ArrayList<Integer> notas = new ArrayList();

            System.out.println("Ingrese Las tres notas");
            for (int i = 0; i < 3; i++) {
                notas.add(leer.nextInt());
            }

            alumno.setNotas(notas);

            estudiantes.add(alumno);

            System.out.println("Desea ingresar otro alumno y sus notas");
            System.out.println("s / n");
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("s"));

    }

    public int buscarAlumno() {
        boolean verificador = false;
        String nombreAlumno;
        int posicion = 0;

        do {
            System.out.println("De cual estudiante quiere saber su Nota Final");

            nombreAlumno = leer.next();

            for (AtributosEstudiante aux : estudiantes) {
                if (aux.getNombre().equalsIgnoreCase(nombreAlumno)) {
                    verificador = true;
                    System.out.println("El alumno fue encontrado");

                    posicion = estudiantes.indexOf(aux);
                    break;
                }

            }

            if (verificador == false) {
                System.out.println("El alumno no esta en la lista");
            }

        } while (verificador == false);

        return posicion;
    }

    public void notaFinal(int posicion) {

        // double notaFinal = (alumno.getNota1() + alumno.getNota2() + alumno.getNota3()) / 3;
        ArrayList<Integer> notas = new ArrayList();
        notas = estudiantes.get(posicion).getNotas();

        int notaFinal = 0;

        for (int i = 0; i < 3; i++) {
            notaFinal += notas.get(i);
        }

        notaFinal = notaFinal / 3;

        System.out.println("EL alumno " + estudiantes.get(posicion).getNombre()
                + " su nota final es  " + notaFinal);

    }

    public void Menu() {

        int numeros = 0;

        do {
            System.out.println("""
                               Menu
                               1. Crear Estudiante
                               2. obtener Alumno y mostrar su nota final
                               3.  salir
                               """);
            numeros = leer.nextInt();

            switch (numeros) {

                case 1:
                    crearEstudiante();
                    break;

                case 2:

                    notaFinal(buscarAlumno());
                    break;

                case 3:
                    System.out.println("fin del programa");
                    
            }

        } while (numeros != 3);
        
        
        
    }
}
