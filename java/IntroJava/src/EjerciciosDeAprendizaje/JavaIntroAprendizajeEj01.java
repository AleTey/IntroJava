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
public class JavaIntroAprendizajeEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Sc = new Scanner(System.in);
        System.out.println("Ingrese 2 numero");
        int num = Sc.nextInt();
        int num2 = Sc.nextInt();
        int resultado = num + num2;
        System.out.println("El resultado de la suma es " + resultado);
    }
    
}
