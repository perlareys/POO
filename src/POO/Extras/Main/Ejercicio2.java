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
import POO.Extras.Servicio.PuntosServicio;

public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PuntosServicio puntos1 = new PuntosServicio();

        puntos1.ingresarPuntos();
        System.out.println("La distancia entre los puntos ingresados es: " + puntos1.distanciaPuntos());
    }

}
