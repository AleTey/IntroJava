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
public class JavaIntroAprendizajeEj14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String moneda;
        System.out.println("Ingrese cantidad de euros a convertir");
        double euros = sc.nextDouble();
        System.out.println("Ingrese la moneda a la que desea convertir (dolares, yenes, libras)");
        //Aca no se que pasó, pero si comento uno de los dos scanners no lee la respuesta y salta directamente al while
       // moneda = sc.nextLine();
        moneda = sc.nextLine();
        moneda = moneda.toLowerCase();
        while (!"dolares".equals(moneda) && !"yenes".equals(moneda) && !"libras".equals(moneda)) {
            System.out.println("Moneda ingresada invalida, intente de nuevo (dolares, yenes, libras)");
            moneda = sc.nextLine();
            moneda = moneda.toLowerCase();
        } 
        conversion(euros, moneda);
    }
    public static void conversion(double euros, String moneda) {
       // double cambio;
        switch (moneda) {
            case "libras":
                System.out.println(euros * 0.86);   // cambio = euros * 0,86;
                break;
            case "yenes":
                System.out.println(euros * 129.852);
                break;
            case "dolares":
                System.out.println(euros * 1.28611);
                break;
        }
    }
    
}
