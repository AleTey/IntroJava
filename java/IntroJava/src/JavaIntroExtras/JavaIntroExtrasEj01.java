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
public class JavaIntroExtrasEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tiempo en minutos");
        int tiempo = sc.nextInt();
        transformar(tiempo);
    }
    public static void transformar(int tiempo) {
        double dias = Math.floor(tiempo / 1460);
        double horas = Math.floor((Math.floor(tiempo % 1460)) / 60);
        double minutos = Math.floor((Math.floor(tiempo % 1460)) % 60);
        System.out.println("Dias: " + dias + "\n" + "Horas: " + horas + "\n" + "Minutos: " + minutos);
    }
    
}
