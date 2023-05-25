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
public class JavaIntroAprendizajeEj18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[][] matriz = new int[4][4];
        int[][] matriz2 = new int[4][4];
        arrayAssignment(matriz);
        showArray(matriz);
        System.out.println("Transponer matriz en una nueva o en la misma? (nueva/misma)");
        String way = sc.nextLine();
        way = way.toLowerCase();
        if (way.equals("nueva")) {
            showTransposed(matriz, way);
        }else {
            //transpossingSame(matriz)
        }
    }
    public static void arrayAssignment(int matriz[][]) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }
    public static void showArray(int matriz[][]) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static int[][] transpossingNew(int matriz[][]) {
        int[][] newMatriz = new int [4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                newMatriz[j][i] = matriz[i][j];
            }
        }
        return newMatriz;
    }
    public static void showTransposed(int matriz[][], String way) {
        if (way.equals("nueva")) {
            int[][] newMatriz = new int [4][4];
            newMatriz = transpossingNew(matriz);
            for (int i =0; i<4; i++){
                for (int j  = 0; j < 4; j++) {
                    System.out.print(newMatriz[i][j] + " ");
                }
                System.out.println("");
            }
        }else {}
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    
                }              
            }
    }
}
