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
public class JavaIntroAprendizajeEj17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tamaño del vector");
        int n = sc.nextInt();
        int[] vector = new int[n];
        System.out.println("Desea llenar el arreglo manualmente? SI/NO");
        String manual = sc.nextLine();
        manual = sc.nextLine();
        manual = manual.toLowerCase();
        while (! manual.equals("si") && ! manual.equals("no")) {
            System.out.println("Debe contestar si o no para continuar. Desea llenar el arreglo manualmente?");
            //Por que tengo que leer 2 veces para q funcione?
            manual = sc.nextLine();
            manual = manual.toLowerCase();
        }
        if (manual.equals("si")) {
            vector = manualArrayCreator(n);
        }else {
            vector = autoArrayCreator(n);
        }      
        showArray(vector, n);
        digitCounter(vector, n/*, count1, count2, count3, count4, count5*/);
        //System.out.println(count1 + " " + count2 + " " + count3 + " " + count4 + " " + count5);
    }
    public static int[] autoArrayCreator(int n) {
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10000 + 1);
        }
        return vector;
    }
    public static int[] manualArrayCreator(int n){
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese numero para la posicion " + i + " del arreglo");
            vector[i] = sc.nextInt();
        }
        return vector;
    }
    public static void showArray(int vector[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " - ");
        }
        System.out.println("");
    }
    public static void digitCounter(int vector[], int n/*, int count1, int count2, int count3, int count4, int count5*/) {
        int count;
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
        for (int i = 0; i < n; i++) {
            count = 0;
            double num = vector[i];
            while (num > 0.99) {
                num = num / 10;
                count ++;
            }
            switch (count) {
                    case 1:
                        count1 ++;
                        break;
                    case 2:
                        count2 ++;
                        break;
                    case 3:
                        count3 ++;
                        break;
                    case 4:
                        count4 ++;
                        break;
                    case 5:
                        count5 ++;
                        break;
            }
        }
        System.out.print("una cifra:" + count1 + "\ndos cifras: " + count2 + "\ntres cifras: " + count3 + "\ncuatro cifras: " + count4 + "\ncinco cifras: " + count5);
    }
}
