/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosDeAprendizaje;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaIntroAprendizajeEj05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Ingresar por teclado y mostrar por pantalla el doble, triple y la raiz cuadrada */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        double num = sc.nextDouble();
        System.out.println("El doble de " + num + " es: " + num * 2);
        System.out.println("El triple de " + num + " es: " + num * 3);
        System.out.println("");
        double raiz = sqrt(num);
        System.out.println("La raiz cuadrada de " + num + " es: " + raiz);
    }
    
}
