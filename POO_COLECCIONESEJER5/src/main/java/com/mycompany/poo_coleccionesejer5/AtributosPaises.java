/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_coleccionesejer5;

import java.util.HashSet;
import java.util.Objects;

/**
 *
 * @author User
 */
public class AtributosPaises {

    private String pais;
   

    public AtributosPaises() {
    }

    public AtributosPaises(String pais) {
        this.pais = pais;
        
    }

  

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "{" + "pais=" + pais + '}';
    }
    
    
     //AMBOS METODOS TRABAJAN JUNTOS PARA HACER VALIDACIONES CORRECTAS Y EVITAR DUPLICACIONES.
    //DEBO DECIDIR BAJO QUE CRITERIO HAGO LA COMPARACION. 
    @Override // Lo creo para definir que parametro utiliza para no repetir datos, en este casso DNI
    public int hashCode() {
       
        return  this.getPais().hashCode();
    }

    @Override
    public boolean equals(Object obj) {//Lo creo para definir que parametro utiliza para no repetir datos,en este casso PAIS
        
        
        if (obj == null) 
            return false;
        
        
         AtributosPaises other = (AtributosPaises) obj;
        if (this.getPais().equals(other.getPais())) 
            return true;
        
        return false;
    
    }

}
