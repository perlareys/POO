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
import POO.Extras.Entidad.NIF;
import java.util.Scanner;

public class NIFServicio {

    Scanner leer = new Scanner(System.in);
    NIF p1 = new NIF();
    private static String[] letra = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

    public void crearNIF() {
        System.out.println("Ingrese DNI");
        p1.setDNI(leer.nextLong());
        do {
            System.out.println("Ingrese nuevamente");
            p1.setDNI(leer.nextLong());
        } while (p1.getDNI() < 1 || p1.getDNI() > 99999999);

        int resto = (int) (p1.getDNI() % 23);
        String letraNIF;
        letraNIF = letra[resto];
        p1.setLetra(letraNIF);
    }

    public void mostrar() {
        System.out.println("El DNI ingresado es: " + p1.getDNI() + "-" + p1.getLetra());
    }
}

