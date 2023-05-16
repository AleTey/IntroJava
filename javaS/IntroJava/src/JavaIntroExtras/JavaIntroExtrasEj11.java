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
public class JavaIntroExtrasEj11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        long num = sc.nextLong();
        calculador(num);
        
    }
    public static void calculador(long num) {
        int cont = 0; 
        long aux = num;
        do {
            aux = aux / 10;
                cont++;
        } while (aux > 0.9999 || aux < -0.9999);
        System.out.println("el numero " + num + " tiene: " + cont + " digitos:");
    }
    
}
