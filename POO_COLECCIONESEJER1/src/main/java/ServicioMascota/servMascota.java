/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServicioMascota;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class servMascota {
     private Scanner leer;
    private List<String> mascotas;

    public servMascota() {
         this.leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        this.mascotas = new ArrayList();
    }
    
    public void crearMascota() {
        
         String op= "s";
        
        
        
        
      do{
          
          
          System.out.println("Por favor escriba la raza del perro ");
        String raza = leer.next();

        mascotas.add("La raza es:  " + raza);
          System.out.println("Desea ingresar mas razas ");
          op = leer.next();
          
          
      }while(op.equalsIgnoreCase("s"));        
          
        
    }
    
    public void mostrarMascotas() {

        // for each
        System.out.println("Las razas de las  mascotas actuales de la lista son: ");
        for (String aux : mascotas) {
            
            System.out.println(aux);

        }
        

    }
    
    
    
}
