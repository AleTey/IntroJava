/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;
import java.util.Scanner;
/**
 *
 * @author aletei
 */
public class JavaIntroEj10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Sc = new Scanner(System.in);
            System.out.println("Ingrese numeros entre el 1 y el 20");
            System.out.println("Ingrese un numero");
            int num1 = Sc.nextInt();
            while (num1 < 1 || num1 > 20) {
                System.out.println("Numero fuera de rango, ingrese nuevamente");
                num1 = Sc.nextInt();
            }
            System.out.println("ingrese segundo numero");
            int num2 = Sc.nextInt();
                while (num2 < 1 || num2 > 20) {
                System.out.println("Numero fuera de rango, ingrese nuevamente");
                num2 = Sc.nextInt();
            }
            System.out.println("ingrese tercer numero");
            int num3 = Sc.nextInt();
                while (num3 < 3 || num3 > 20) {
                System.out.println("Numero fuera de rango, ingrese nuevamente");
                num3 = Sc.nextInt();
            }
            System.out.println("Ingrese cuarto numero");
            int num4 = Sc.nextInt();
                while (num4 < 1 || num4 > 20) {
                System.out.println("Numero fuera de rango, ingrese nuevamente");
                num4 = Sc.nextInt();
            }
            System.out.print(num1 + " ");
            for (int i = 0; i < num1; i++) {
                System.out.print("*");
            }
            System.out.println("");
            System.out.print(num2 + " ");
            for (int i = 0; i < num2; i++) {
                System.out.print("*");
            }
            System.out.println("");
            System.out.print(num3 + " ");
            for (int i = 0; i < num3; i++) {
                System.out.print("*");
            }
            System.out.println("");
            System.out.print(num4 + " ");
            for (int i = 0; i < num4; i++) {
                System.out.print("*");  
            }
            System.out.println("");
    }
    
}
