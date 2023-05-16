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
public class JavaIntroExtrasEj03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = sc.nextLine().toLowerCase();
        //int num = letra.length();
        if (! letra.matches("[a-z*]")|| letra.length() > 1) {
            do {
                System.out.println("Ingrese una letra de la A a la Z");
                letra = sc.nextLine();
            } while (! letra.matches("[a-z*]"));
        }
        
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("La letra ingresada es una vocal");
        }else {
            System.out.println("La letra no es una vocal");
        }
    }
    
}
