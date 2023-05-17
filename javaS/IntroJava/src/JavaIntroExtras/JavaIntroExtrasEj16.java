/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaIntroExtras;

import java.util.Scanner;


public class JavaIntroExtrasEj16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero para ver si es primo");
        int num = sc.nextInt();
        System.out.println(primos(num));
    }
    public static boolean primos(int num) {
        int cont = 0;
        boolean rta;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont++;
            }
        }
        if (cont == 2) {
            rta = true;
        }else {
            rta = false;
        }
        return rta;
    }

}
