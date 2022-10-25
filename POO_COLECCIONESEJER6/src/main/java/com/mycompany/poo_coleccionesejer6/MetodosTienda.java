/*20
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_coleccionesejer6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class MetodosTienda {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    HashMap<String, Integer> producto = new HashMap<>();

    public void cargarProductos() {

        String respuesta = "si";

        do {

            System.out.println("Ingrese Producto");
            String nombre = leer.next();

            System.out.println("Ingrese precio producto");
            Integer precio = leer.nextInt();

            System.out.println("desea agregar otro Producto a la lista");
            System.out.println(" si / no");
            respuesta = leer.next();

            AtributosTienda sc = new AtributosTienda();

            sc.setNombre(nombre);
            sc.setPrecio(precio);

            producto.put(nombre, precio);

        } while (respuesta.equalsIgnoreCase("si"));

    }

    public void mostrarProdcutos() {
        // entry.getKey trae la llave y entry.getValue trae los valores del mapa, Es decir todos sus atributos
        for (Map.Entry<String, Integer> entry : producto.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();

            System.out.println("Producto " + key + " Precio $ " + val);

        }
    }

    public void modificarPrecio() {

        System.out.println("ingrese el  producto al que le quiere modificar el precio");
        String productoNuevo = leer.next();

        for (Map.Entry<String, Integer> entry : producto.entrySet()) {
            String nombre = entry.getKey();
            Integer precio = entry.getValue();

            if (productoNuevo.equalsIgnoreCase(nombre)) {
                System.out.println("Ingrese el nuevo precio");

                producto.replace(nombre, leer.nextInt());

                System.out.println("producto " + nombre + "precio $ " + precio);
            }

        }

    }


    public void buscarElimar() {
        System.out.println("Ingrese la llave del producto que desea eliminar de la lista");
        String productoNuevo = leer.next();

        for (Map.Entry<String, Integer> entry : producto.entrySet()) {
            String nombre = entry.getKey();
            //  Integer precio = entry.getValue();

            if (productoNuevo.equalsIgnoreCase(nombre)) {
                System.out.println("Ingrese el nuevo precio");

                producto.remove(nombre);

            }

        }
    }

    public void Menu() {

        int numeros = 0;

        do {
            System.out.println("""
                               Menu
                               1. INGRESAR DATOS PRODUCTO
                               2. MODIFICAR PRECIO 
                               3. ELIMINAR UN PRODUCTO
                               4. MOSTRAR PRODUCTOS
                               5. SALIR
                               """);
            numeros = leer.nextInt();

            switch (numeros) {

                case 1:
                    cargarProductos();
                 //   mostrarProdcutos();

                    break;

                case 2:
                    modificarPrecio();    
                    //mostrarProdcutos();
                    break;

                case 3:
                    buscarElimar();
                //    mostrarProdcutos();

                    break;

                case 4:
                    
                 mostrarProdcutos();
                     break;
                     
                case 5:

                    System.out.println("fin del programa");

                    break;
            }

        } while (numeros != 5);

    }

}
