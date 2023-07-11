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
import POO.Ejercicios.Entidad.Libro;
import POO.Ejercicios.Servicios.LibroServicio;

public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LibroServicio l1 = new LibroServicio();
        Libro libro1 = l1.crearLibro();
        System.out.println("-----LIBRO-----");
        l1.informacionLibro(libro1);
    }
}