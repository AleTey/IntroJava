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
public class JavaIntroExtrasEj13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese n");
        int n = sc.nextInt();
        escribir(n);
        
    }
    public static void escribir(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < i + 2; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
