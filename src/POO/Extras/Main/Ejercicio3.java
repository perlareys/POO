/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Extras.Main;

/**
 *
 * @author Perla
 */
import POO.Extras.Servicio.RaicesServicio;

public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RaicesServicio ecuacion1 = new RaicesServicio();
        ecuacion1.ingresarEcuacion();
        System.out.println("Discriminante: " + ecuacion1.getDiscriminante());
        ecuacion1.calcular();
    }

}
