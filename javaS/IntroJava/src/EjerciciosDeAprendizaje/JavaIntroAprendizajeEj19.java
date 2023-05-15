/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosDeAprendizaje;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class JavaIntroAprendizajeEj19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int[][] matrix = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        
        transponer(matrix, matriz);
        showMatrix(matrix, matriz);
        //if (matrix[3][3].)
        System.out.println("\n" + Arrays.deepEquals(matriz, matrix));
    }
    public static void showMatrix(int matrix[][],int matriz[][]) {
       // matrix[3][3] = matrix[3][3] * -1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        System.out.println("");
        }
    }
    public static void transponer(int matrix[][], int matriz[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = matrix[j][i] * -1;
            }
        }
    }
}
