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
public class JavaIntroAprendizajeEj11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros");
        double num = sc.nextDouble();
        double num2 = sc.nextDouble();
        boolean salir = false;
        while(salir == false) {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicarr");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            int option = sc.nextInt();
            switch(option) {
                case 1:
                    System.out.println(num + num2);
                    break;
                case 2:
                    System.out.println(num - num2);
                    break;
                case 3:
                    System.out.println(num * num2);
                    break;
                case 4:
                    System.out.println(num / num2);
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir del programa? (S/N)");
                    char conf = sc.next().charAt(0);
                    if(conf == 's') {
                        salir = true;
                    }
                    break;
            }
        }
    }
    
}
