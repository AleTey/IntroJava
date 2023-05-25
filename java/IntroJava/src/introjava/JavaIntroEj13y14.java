/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaIntroEj13y14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner Sc = new Scanner(System.in);
         System.out.println("Ingrese cantidad de participantes");
         int cantidad = Sc.nextInt();
         String[] vector = new String[cantidad];
         completarVector(vector, cantidad);
    }
    public static void completarVector(String[] vector, int cantidad) {
        Scanner Sc = new Scanner(System.in);
        for (int i = 0; i < (cantidad); i++) {
            System.out.println("Ingrese " + (i + 1) + " nombre");
            //String nombre = Sc.next();
            vector[i] = Sc.next();
        }
        for (int i = 0; i < cantidad; i++){
            System.out.print(vector[i]);
            
            System.out.print("-");
        }
        System.out.println("");
    }
}
