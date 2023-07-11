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
import java.util.Date;
import java.util.Scanner;

public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dia, mes, anio;
        Date hoy, fecha;

        System.out.println("Ingrese el año:");
        anio = leer.nextInt();
        System.out.println("Ingrese el mes:");
        mes = leer.nextInt();
        System.out.println("Ingrese el día:");
        dia = leer.nextInt();

        fecha = new Date(anio - 1900, mes - 1, dia);
        hoy = new Date();

        System.out.println("La fecha ingresada es: " + fecha);
        System.out.println("Hoy es: " + hoy);

        int diferencia = hoy.getYear() - fecha.getYear();
        System.out.println("La diferencia de años es: " + diferencia);
    }

}

