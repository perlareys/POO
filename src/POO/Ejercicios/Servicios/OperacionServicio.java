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
import POO.Ejercicios.Entidad.Operacion;
import java.util.Scanner;

public class OperacionServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Operacion p1 = new Operacion();

    public void crearOperacion() {
        System.out.println("Ingresar números: ");
        System.out.println("Ingresar primero número");
        p1.setNumero1(leer.nextInt());
        System.out.println("Ingresar segundo número");
        p1.setNumero2(leer.nextInt());
    }

    public int sumar() {
        return p1.getNumero1() + p1.getNumero2();
    }

    public int restar() {
        return p1.getNumero1() - p1.getNumero2();
    }

    public int multiplicar() {
        if (p1.getNumero1() == 0 || p1.getNumero2() == 0) {
            System.out.println("Error!");
            return 0;
        } else {
            return p1.getNumero1() * p1.getNumero2();
        }
    }

    public int dividir() {
        if (p1.getNumero2() == 0) {
            System.out.println("Error!");
            return 0;
        } else {
            return p1.getNumero1() / p1.getNumero2();
        }
    }
}
