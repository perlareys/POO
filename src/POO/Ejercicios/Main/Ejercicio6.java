/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Ejercicios.Main;

/**
 *
 * @author Perla
 */
import POO.Ejercicios.Servicios.NespressoServicio;
import java.util.Scanner;

public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        NespressoServicio cafetera1 = new NespressoServicio();
        
        int opcion;

        do {
            System.out.println("------NESPRESSO------");
            System.out.println("1.  Llenar cafetera");
            System.out.println("2.  Servir taza");
            System.out.println("3.  Vaciar cafetera");
            System.out.println("4.  Agregar café");
            System.out.println("5.  Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    cafetera1.llenarCafetera();
                    System.out.println("Cafetera llena");
                    break;
                case 2:
                    cafetera1.servirTaza();
                    break;
                case 3:
                    cafetera1.vaciarCafetera();
                    break;
                case 4:
                    cafetera1.agregarCafe();
                    break;
                case 5:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (opcion != 5);
    }

}
