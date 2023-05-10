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
public class JavaIntroEj07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Sc = new Scanner(System.in);
        int tipoMotor;
        System.out.println("Ingrese tipo de motor");
        tipoMotor = Sc.nextInt();
        
        switch (tipoMotor) {
            case 1: 
                System.out.println("Bomba de agua");
                break;
            case 2:
                System.out.println("Bomba de gasolina");
                break;
            case 3:
                System.out.println("Bomba hormigon");
                break;
            case 4:
                System.out.println("Bomba pasta alimenticia");
                break;
            default:
                System.out.println("No es un valor valido para tipo de bomba");
        }
            
        
        
    }
    
}
