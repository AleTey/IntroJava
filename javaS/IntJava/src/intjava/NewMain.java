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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int num = 2;
        int num1 = 3;
        int num2 = 4;
        int total;
        int total2;
        boolean check;
        double real = 1.5;
        total = num1 + num2;
        total2 = num2 / num;
        if (num < real) {
           check = true;
        }else { check = false;
        }
        System.out.println(total + " " + total2);
        //System.out.println(total2);
        System.out.println(check);
        System.out.println();
    }
    
}
