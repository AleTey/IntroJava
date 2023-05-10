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
public class JavaIntroEj09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Sc = new Scanner(System.in);
        int num, sum = 0, cont = 0;
        do { 
            System.out.println("Ingrese numeros positivos para ser sumados y cero para terminar");
            num = Sc.nextInt();
            cont++;
            if (num > 0) {
                sum = sum + num;
                
            }   
        } while (num != 0 && cont <= 20);
        System.out.println("La suma de los numeros ingresados es" + sum);
    }
    
}
