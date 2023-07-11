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
import POO.Ejercicios.Servicios.MovilServicio;

public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MovilServicio movil1 = new MovilServicio();

        movil1.cargarCelular();
        System.out.println("Información ingresada:");
        movil1.mostrarInformacion();
    }

}
