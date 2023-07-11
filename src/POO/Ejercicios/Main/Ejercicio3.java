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
import POO.Ejercicios.Servicios.OperacionServicio;

public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperacionServicio operacion1 = new OperacionServicio();
        operacion1.crearOperacion();

        System.out.println("La suma de los números ingresados es: "+operacion1.sumar());
        System.out.println("La resta de los números ingresados es: "+ operacion1.restar());
        System.out.println("El producto de los números ingresados es: "+ operacion1.multiplicar());
        System.out.println("La división de los números ingresados es: "+ operacion1.dividir());
    }

}
