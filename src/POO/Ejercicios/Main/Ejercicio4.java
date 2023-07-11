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
import POO.Ejercicios.Servicios.RectanguloServicio;

public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RectanguloServicio rectangulo1 = new RectanguloServicio();
        rectangulo1.crearRectangulo();
        System.out.println("Área del rectángulo ingresado: "+rectangulo1.superficie());
        System.out.println("Perímetro del rectángulo ingresado: "+rectangulo1.perimetro());
        System.out.println("Rectángulo:");
        rectangulo1.dibujarRectangulo();
    }
}
