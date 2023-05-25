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
public class JavaIntroAprendizajeEj12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;
        String cadena;
        do {
            System.out.println("Increse cadena de hasta 5 caracteres");
            cadena = sc.nextLine();
            int largo = cadena.length();
            String caracter1 = cadena.substring(0, 1);
            String caracter2 = cadena.substring(4, 5);
            if(largo < 6 && caracter1.equals("X") && caracter2.equals("O")){
                correctas ++;
            }else if(! cadena.equals("&&&&&")) {
                incorrectas ++;
            }
            
        }while(! cadena.equals("&&&&&"));
        System.out.println("Se ingresaron: " + correctas + " correctas");
        System.out.println("Se ingresaron: " + incorrectas + " incorrectas");
    }
    
}
