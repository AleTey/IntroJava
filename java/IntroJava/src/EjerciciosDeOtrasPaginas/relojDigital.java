/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjerciciosDeOtrasPaginas;


public class relojDigital {


    public static void main(String[] args) throws InterruptedException {
        reloj();
    }
    public static void reloj() throws InterruptedException {
        int hora = 00;
        //System.out.println(hora);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 6; k++) {
                    for (int l = 0; l < 10; l++) {
                        for (int m = 0; m < 6; m++) {
                            for (int n = 0; n < 10; n++) {
                               
                                Thread.sleep(1000);                           
                                System.out.print("\r" + "\r" + i + j +":" + k + l + ":" + m + n);
                                if (i ==2 && j == 3 && k == 5 && l == 9 && m == 5 && n == 9) {
                                    reloj();
                                }
                            }
                            
                        }
                        
                    }
                }
            }
        }
    }
}
