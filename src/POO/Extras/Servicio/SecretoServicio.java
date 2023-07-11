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
import POO.Extras.Entidad.Secreto;
import java.util.Scanner;

public class SecretoServicio {

    Scanner leer = new Scanner(System.in);
    Secreto j1 = new Secreto();

    private void crearJuego() {
        String[] meses = {"enero",
            "febrero",
            "marzo",
            "abril",
            "mayo",
            "junio",
            "julio",
            "agosto",
            "setiembre",
            "octubre",
            "noviembre",
            "diciembre"};
        int mesRandom = (int) (Math.random() * 12);
        j1.setMeses(meses);
        j1.setMesSecreto(meses[mesRandom]);
    }

    public void adivinarMes() {
        crearJuego();
        System.out.println("Adivina el mes");
        System.out.println("Introduzca el mes");
        String adivina = leer.nextLine();

        while (!adivina.equalsIgnoreCase(j1.getMesSecreto())) {
            System.out.println("Intente nuevamente");
            adivina = leer.nextLine();
        }
        System.out.println("Lo lograste!");
    }
}

