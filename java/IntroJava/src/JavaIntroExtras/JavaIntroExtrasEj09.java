/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaIntroExtras;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaIntroExtrasEj09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero que desea dividir");
        int dividendo = sc.nextInt();   
        System.out.println("Ingrese el divisor");
        int divisor = sc.nextInt();
        int cociente = 0, residuo = dividendo;
        division(dividendo, divisor, cociente, residuo);
       // System.out.println(dividendo + " / " + divisor + "\n" + "Cociente = " + cociente + "\n" + "Residuo = " + residuo);
        
    }
    public static void division(int dividendo, int divisor, int cociente, int residuo) {
        //int cont = 0;
        while (residuo > divisor) {
           residuo = residuo - divisor;
           cociente ++;
        }
                System.out.println(dividendo + " / " + divisor + "\n" + "Cociente = " + cociente + "\n" + "Residuo = " + residuo);

    }
    
}
