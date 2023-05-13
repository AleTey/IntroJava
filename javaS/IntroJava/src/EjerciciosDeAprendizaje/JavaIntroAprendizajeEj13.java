/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosDeAprendizaje;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaIntroAprendizajeEj13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if(i == 0 || i == num - 1 || j == 0 || j == num - 1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }          
            }
            System.out.println("");
        }
        
    }
    
}
