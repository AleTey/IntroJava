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
public class JavaIntroExtrasEj19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        System.out.println("Ingrese n");
        int n = sc.nextInt();
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese valor para la posicion " + i + "del primer vector"); 
            vector1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese valor para la posicion " + i + "del segundo vector");   
            vector2[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (vector1[i] != vector2[i]) {
                cont++;
                System.out.println("Los vectores no son iguales");
                break;
            }
        }
        if (cont == n) {
            System.out.println("Los vectores son iguales");
        }
    }
    
}
