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
public class JavaIntroEj08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Sc = new Scanner(System.in);
        System.out.println("Ingrese nota");
        int nota = Sc.nextInt();
        while (nota < 0 || nota > 10) {
            System.out.println("Ingrese una nota valida (entre 0 y 10)");
            nota = Sc.nextInt();
        }
        System.out.println("La nota es " + nota);
         
    }
    
}
