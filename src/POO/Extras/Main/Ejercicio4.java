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
import POO.Extras.Servicio.NIFServicio;

public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NIFServicio persona1 = new NIFServicio();
        persona1.crearNIF();
        persona1.mostrar();
    }

}
