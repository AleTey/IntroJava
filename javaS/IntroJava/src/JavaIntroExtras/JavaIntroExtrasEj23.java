/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaIntroExtras;

import java.util.Scanner;


public class JavaIntroExtrasEj23 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] matriz = new String[20][20];
        enterWord(matriz);
    }
    public static void enterWord(String[][] matriz) {
        Scanner sc = new Scanner(System.in);
        int cont, line, pos;
        int range;
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese la " + (i + 1) + "° palabra");
            String word = sc.nextLine();
            while (word.length() < 3 || word.length() > 5) {
                System.out.println("La palabra no debe tener un minimo de 3 caracteres y un maximo de 5");
                word = sc.nextLine();
            }
            range = 20 - word.length();
            //El do - While genera numeros aleatorios para la fila y columna y corrobora que los espacios esten vacios
            do {
                cont = 0;
                line = (int) (Math.random() * 20);
                pos = (int) (Math.random() * range);
                System.out.println(line + " " + pos);
                   // for (int j = line; j < j + 1; j++) {
                for (int k = pos; k < (word.length() + pos); k++) {
                    if (matriz[line][k] == null) {
                        cont++;           
                    }
                }
            } while (cont < word.length());
            //Ya chekeado que los espacios para la palabra elegida estan vacios asignamos los valores
                for (int k = pos, x = 0; k < word.length() + pos; k++, x ++) {
                    matriz[line][k] = word.substring(x, x + 1);
                }
        }
            for (int j = 0; j < 20; j++) {
                    for (int k = 0; k < 20; k++) {
                       if (matriz[j][k] == null) {
                           pos = (int) (Math.random() * 10);
                           String randomString = String.valueOf(pos);
                           matriz[j][k] = randomString;
                        }
                    }
            }
            for (int j = 0; j < 20; j++) {
                for (int k = 0; k < 20; k++) {
                    System.out.print(matriz[j][k]);
                }
                System.out.println("");
            }
    }
}
