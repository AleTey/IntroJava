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
public class JavaIntroAprendizajeEj21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int[][] M = new int[10][10];
        int [][] M = {{1,26,36,47,5,6,72,81,95,10},{11,12,13,21,41,22,67,20,10,61},{56,78,87,90,9,90,17,12,87,67},{41,87,24,56,97,74,87,42,64,35},{32,76,79,1,36,5,67,96,12,11},{99,13,54,88,89,90,75,12,41,76},{67,78,87,45,14,22,26,42,56,78},{98,45,34,23,32,56,74,36,5,67},{24,67,97,46,87,13,67,89,90,75},{21,68,78,98,90,67,12,14,22,26}};
        //int[][] P = {{1, 26, 36, 47, 5, 6, 72, 81, 95, 10}, {11, 12, 13, 21, 41, 22, 67, 20, 10, 61}, {56, 78, 87, 90, 9, 90, 17, 12, 87, 67}, 41, 87, 24, 56, 97, 74, 87, 42, 64, 35}, {32, 76, 79, 1, 36, 5, 67, 96, 12, 11}, {99, 13, 54, 88, 89, 90, 75, 12, 41, 76}, {67, 78, 87, 45, 14, 22, 26, 42, 56, 78}, {98, 45, 34, 23, 32, 56, 74, 16, 19, 18}, {24, 67, 97, 46, 87, 13, 67, 89, 93, 24}, {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};
        //{{1, 26, 36, 47, 5, 6, 72, 81, 95, 10},{11, 12, 13, 21, 41, 22, 67, 20, 10, 61},{56, 78, 87, 90, 9, 90, 17, 12, 87, 67},{41, 87, 24, 56, 97, 74, 87, 42, 64, 35},{32, 76, 79, 1, 36, 5, 67, 96, 12, 11},{99, 13, 54, 88, 89, 90, 75, 12, 41, 76},{67, 78, 87, 45, 14, 22, 26, 42, 56, 78},{98, 45, 34, 23, 32, 56, 74, 16, 19, 18},{24, 67, 97, 46, 87, 13, 67, 89, 93, 24},{21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};
        int[][] P = {{36, 5, 67}, {89, 90, 75}, {14, 22, 26}};
        busqueda(M, P);
    }
    public static void busqueda(int M[][], int P[][]) {
        int contCoincidencias = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (M[i][j] == P[0][0]) {
                    int cont = 0;
                    for (int k = i, z = 0; k < k + 3 && z < 3; k++, z++) {
                        for (int x = j, y = 0; x < x + 3 && y < 3; x++, y++) {
                            if ((M[k][x]) == (P[z][y])) {
                                cont++;
                            }
                        }
                    }
                    if (cont == 9) {
                        contCoincidencias++;
                        System.out.println("Se encontró coincidencia en " + i + ", " + j);
                    }
                }
            }
        }
        if (contCoincidencias == 0) {
            System.out.println("No se encontraron coincidencias");
        }
    }
    
}
