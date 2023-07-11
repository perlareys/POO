/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Ejercicios.Main;
import java.util.Arrays;

/**
 *
 * @author Perla
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arrayA, arrayB;
        arrayA = new int[50];
        arrayB = new int[20];
        iniciarArray(arrayA);
        System.out.println("Arreglo A:");
        mostrarArray(arrayA);
        //para ordenar ascendente uso Array.sort
        Arrays.sort(arrayA);
        System.out.println("Arreglo A ordenado:");
        mostrarArray(arrayA);
        System.out.println("Arreglo B:");
        copiarArray(arrayA, arrayB, 10);
        Arrays.fill(arrayB,10,20, (int) 0.5);
        mostrarArray(arrayB);
    }

    public static int[] iniciarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
        }
        return array;
    }

    public static int[] copiarArray(int[] arrayA, int[] arrayB, int n) {
        for (int i = 0; i < n; i++) {
            arrayB[i]=arrayA[i];
        }
        return arrayB;
    }

    public static void mostrarArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println("]");
    }
}
