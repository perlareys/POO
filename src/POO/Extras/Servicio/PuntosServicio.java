/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Extras.Servicio;

/**
 *
 * @author Perla
 */
import POO.Extras.Entidad.Puntos;
import java.util.Scanner;

public class PuntosServicio {

    Scanner leer = new Scanner(System.in);
    Puntos p1 = new Puntos();

    public void ingresarPuntos() {
        System.out.println("PRIMER PUNTO");
        System.out.print("Posición X: ");
        p1.setX1(leer.nextInt());
        System.out.print("Posición Y: ");
        p1.setY1(leer.nextInt());
        System.out.println("SEGUNDO PUNTO");
        System.out.print("Posición X: ");
        p1.setX2(leer.nextInt());
        System.out.print("Posición Y: ");
        p1.setY2(leer.nextInt());
    }

    public double distanciaPuntos() {
        double distancia;
        distancia = Math.sqrt(Math.abs(Math.pow((p1.getX2() - p1.getX1()), 2)) + Math.abs(Math.pow((p1.getY2() - p1.getY1()), 2)));
        return distancia;
    }
}
