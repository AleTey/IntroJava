/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaIntroExtras;

/**
 *
 * @author User
 */
public class JavaIntroExtrasEj12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String uno, dos, tres;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    tres = String.valueOf(k);
                    dos = String.valueOf(j);
                    uno = String.valueOf(i);
                    if (tres.equals("3")) {
                        tres = "E";
                    }
                    if (dos.equals("3")) {
                        dos = "E";
                    }
                    if (uno.equals("3")) {
                        uno = "E";
                    }
                    System.out.println(uno + "-" + dos + "-" + tres);
                }
                
            }
            
        }
    }
    
}
