/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevoproyecto;

import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("");
        Scanner leer = new Scanner (System.in);
          String nombre;      
          System.out.println("Ingrese tu nombre");
          nombre = leer.next();
          int numero;
          numero = 200;
          
          System.out.println("Hola Mundo! Soy " + nombre + " y estoy programando en Java");
    }
    
}
