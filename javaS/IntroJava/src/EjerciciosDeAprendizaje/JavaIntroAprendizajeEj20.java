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
public class JavaIntroAprendizajeEj20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        assignation(matriz);
       // validation(matriz);
       // System.out.println(validation(matriz));
       if (validation(matriz)) {
           System.out.println(validation(matriz));
       }else {
           System.out.println(validation(matriz));
       }
    }
    public static void assignation(int matriz[][]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numeros (entre el 1 y el 9) a la matriz para saber si es magica");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                System.out.println("Ingrese numero para la posicion: " + i + ", " + j);
                matriz[i][j] = sc.nextInt();
                while (matriz[i][j] > 9 || matriz[i][j] < 1) {
                    System.out.println("Numero invalido, el numero ingresado debe estar entre el 1 y el 9");
                    matriz[i][j] = sc.nextInt();
                }
            }
        }
    }
    public static boolean validation(int matriz[][]) {
        boolean magica = true;
        int a = 0, b = 0, cont = 2;
        //Diagonal principal
        for (int i = 0; i < 3; i++ ) {
            a = a + matriz[i][i];
        }   
        for (int i = 0; i < 3; i ++) {
            b = b + matriz[i][cont];
            cont--;
        }
        if (b != a) {
            magica = false;
            return magica;
        }
        for (int i = 0; i < 3; i++) {
            b = 0;
            for (int j = 0; j < 3; j++) {
                b = b + matriz[i][j]; 
            }
            if (b != a) {
                magica = false;
                return magica;
            }
        }
    return magica;
    }
}
