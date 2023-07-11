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
import POO.Ejercicios.Servicios.CircunferenciaServicio;

public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CircunferenciaServicio circunferencia1 = new CircunferenciaServicio();

        //llamo a crear circunferencia
        circunferencia1.crearCircunferencia();

        //llamo al área
        System.out.println("Área: " + circunferencia1.area());

        //llamo al perímetro
        System.out.println("Perímetro: " + circunferencia1.perimetro());
    }
}
