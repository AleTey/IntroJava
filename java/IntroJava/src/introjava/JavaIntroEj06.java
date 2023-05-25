/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author aletei
 */
public class JavaIntroEj06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Sc = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros");
        int num1 = Sc.nextInt();
        int num2 = Sc.nextInt();
        if (num1 > 25 && num2 > 25) {
            System.out.println(num1 + " y " + num2 + " son mayores que 25");         
        }else if (num1 > 25) {
            System.out.println("num1 mayor que 25");
        }else if (num2 > 25) {
            System.out.println("num2 mayor que 25");
        }else 
            System.out.println("Ninguno de los numeros es mayor que 25");
    }
    
}
