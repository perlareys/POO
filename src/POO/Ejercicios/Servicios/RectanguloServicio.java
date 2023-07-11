/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Ejercicios.Servicios;

/**
 *
 * @author Perla
 */
import java.util.Scanner;
import POO.Ejercicios.Entidad.Rectangulo;

public class RectanguloServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Rectangulo r1 = new Rectangulo();

    public void crearRectangulo() {
        System.out.print("Ingresar tamaño de la base: ");
        r1.setBase(leer.nextInt());
        System.out.print("Ingresar tamaño de la altura: ");
        r1.setAltura(leer.nextInt());
    }

    public int superficie() {
        return r1.getBase() * r1.getAltura();
    }

    public int perimetro() {
        return (r1.getBase() + r1.getAltura()) * 2;
    }

    public void dibujarRectangulo() {
        for (int i = 0; i < r1.getAltura(); i++) {
            for (int j = 0; j < r1.getBase(); j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
