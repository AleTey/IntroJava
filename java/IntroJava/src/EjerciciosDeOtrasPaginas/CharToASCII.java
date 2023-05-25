/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjerciciosDeOtrasPaginas;

import java.util.Scanner;


public class CharToASCII {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un caracter");
        char caracter = sc.next().charAt(0);
        int ascii = (int) caracter;
        System.out.println(ascii);
    }

}
