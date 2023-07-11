/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Ejercicios.Servicios;

import POO.Ejercicios.Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Perla
 */
public class CircunferenciaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Circunferencia c1 = new Circunferencia();

    public double crearCircunferencia() {
        System.out.println("Ingresar el radio de la circunferencia");
        c1.setRadio(leer.nextDouble());
        return c1.getRadio();
    }

    public double area() {
        return Math.PI * c1.getRadio() * c1.getRadio();
    }

    public double perimetro() {
        return 2 * Math.PI * c1.getRadio();
    }
}