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
public class JavaIntroExtrasEj14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int promedio = 0, cont = 0;
        System.out.println("Ingrese cantidad de familias");
        int familias = sc.nextInt();
        calculo(familias, promedio, cont);
       // System.out.println("El promedio de edad es: " + promedio / );
    }
    public static void calculo(int familias, int promedio, int cont) {
        int hijos, edad;
        for (int i = 1; i < familias + 1; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese cantidad de hijos de la familia " + i);
            hijos = sc.nextInt();
            cont = cont + hijos;
            for (int j = 1; j < hijos + 1; j++) {
                System.out.println("Ingrese edad del hijo " + j);
                edad = sc.nextInt();
                promedio = promedio + edad;
            }
        }
        System.out.println("El promedio de edad es: " + promedio / cont);
    }
}
