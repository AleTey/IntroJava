package introjava;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class JavaIntroEj12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Sc = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros");
        int num = Sc.nextInt();
        int num2 = Sc.nextInt();
        multiplo(num, num2);
    }
    public static void multiplo(int num, int num2) {
       // float res = (float)num / num2;
        double res = (num * 1.0) / num2;
        System.out.println(res);
        System.out.println(res % 2);
        if (res % 2 == 0) {
            System.out.println("El primer numero SI es multiplo del segundo");
        }else {
            System.out.println("El primer numero NO es multiplo del segundo");
        }
    }
    
}
