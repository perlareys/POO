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
import POO.Extras.Entidad.Raices;
import java.util.Scanner;

public class RaicesServicio {

    Scanner leer = new Scanner(System.in);

    Raices r1 = new Raices();

    public void ingresarEcuacion() {
        System.out.println("Ingresar el valor de a");
        r1.setA(leer.nextInt());
        System.out.println("Ingresar el valor de b");
        r1.setB(leer.nextInt());
        System.out.println("Ingresar el valor de c");
        r1.setC(leer.nextInt());
        System.out.println("Ecuacion Ingresada: " + r1.getA() + "x^2 +" + r1.getB() + "x +" + r1.getC());
    }

    public double getDiscriminante() {
        double discriminante;
        discriminante = Math.pow(r1.getB(), 2) - (4 * r1.getA() * r1.getC());
        return discriminante;
    }

    public boolean tieneRaices() {
        if (getDiscriminante() >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean tieneRaiz() {
        if (getDiscriminante() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void obtenerRaices() {
        double raiz1 = 0;
        double raiz2 = 0;
        if (tieneRaices() == true) {
            raiz1 = ((-r1.getB()) + getDiscriminante()) / (2 * r1.getA());
            raiz2 = ((-r1.getB()) - getDiscriminante()) / (2 * r1.getA());
        }
        System.out.println("Primera raiz: " + raiz1);
        System.out.println("Segunda raiz: " + raiz2);
    }

    public void obtenerRaiz() {
        double raiz3 = 0;
        if (tieneRaiz() == true) {
            raiz3 = ((-r1.getB()) + getDiscriminante()) / (2 * r1.getA());
        }
        System.out.println("Raiz: " + raiz3);
    }

    public void calcular() {
        if (tieneRaiz() == true) {
            obtenerRaiz();
        } else if (tieneRaices() == true) {
            obtenerRaices();
        } else {
            System.out.println("No existe solución");
        }
    }
}

