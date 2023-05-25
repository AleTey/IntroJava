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
public class JavaIntroExtrasEj10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, cont = 1;
        x = numero(x);
        System.out.println("Ingrese 1 numero del 1 al 100");
        int rta = sc.nextInt();
        while (rta != x) {
            System.out.println(x);
            System.out.println("Numero incorrecto, intente nuevamente");
            rta = sc.nextInt();
            cont ++;
        }
        System.out.println("Lo lograsete! el numero era " + x + ". \n" + "Intentos: " + cont); 
        
        
    }
    public static int numero(int x) {
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        x = num1 * num2;
        System.out.println(num1 + " " + num2 + " " + x);
        return x;
    }
    
}
