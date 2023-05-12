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
public class JavaIntroAprendizajeEj10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese valor limite");
        int limite = sc.nextInt();
        int suma = 0;
        while (suma <= limite) {
            System.out.println("Ingrese un numero");
            int num = sc.nextInt();
            //El if de abajo con el break es solo a modo de  prueba, no es parte de jercicio
            if(suma + num > 10) {
                break;
            }
            suma = suma + num;
            System.out.println(suma);
        }
        System.out.println(suma);
    }
    
}
