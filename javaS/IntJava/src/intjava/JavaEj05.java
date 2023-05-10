/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intjava;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaEj05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Sc = new Scanner(System.in);
        //double real;
        //char letra;
       // boolean check;
        //System.out.println("Ingrese valores");
        double real = Sc.nextDouble();
        //System.out.println("Ingrese valores");
        char letra = Sc.next().charAt(0);
        boolean check = Sc.nextBoolean();
        System.out.print(real + "\n" + letra + "\n " + check + "\n" );
    }
    
}
