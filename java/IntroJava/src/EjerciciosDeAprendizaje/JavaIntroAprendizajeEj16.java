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
public class JavaIntroAprendizajeEj16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tamaño del vector");
        int n = sc.nextInt();
        int[] vector = new int[n];
        assignmentArray(vector, n);
        showArray(vector, n);
        System.out.println("Ingrese el numero que desea buscar");
        int aim = sc.nextInt();
        serch(vector, n, aim);
    }
    public static void assignmentArray(int vector[], int n){
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10 + 1);
            //vector[i] = i;
        }
    } 
    public static void showArray(int vector[], int n) {
        for(int i = 0; i < n; i++) {
            System.out.print(vector[i] + " - ");
        }
        System.out.println("");
    }
    //Se cuenta la cantidad de veces que se encontro el numero aim
    public static void serch(int vector[], int n, int aim) {
        int cont = 0, num = 0;
        for (int i = 0; i < n; i++) {
            if (vector[i] == aim) {
                cont ++;
                num = i;
            }
        }
        //Si el numero fue encontrado mas de una vez
        if (cont > 1) {
            System.out.println("El numero " + aim + " se encontro " + cont + " veces en las posiciones:");
            for (int i = 0; i < n; i++) {
                if (vector[i] == aim) {
                    System.out.println(i + " - ");
                }
            }
        //Si el numero aim es = 1
        }else if (cont == 1) {
            System.out.println("El numero " + aim + "fue encontrado solo una vez en la pasicion " + num);
        }else {
            System.out.println("El numero " + aim + "no se encuentra en el arreglo");
        }
    }
}
