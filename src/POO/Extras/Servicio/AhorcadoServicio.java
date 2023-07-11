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
import POO.Extras.Entidad.Ahorcado;
import java.util.Scanner;
import java.util.Arrays;

public class AhorcadoServicio {

    Scanner leer = new Scanner(System.in);
    Ahorcado a1 = new Ahorcado();

    private void crearJuego() {
        System.out.println("------AHORCADO------");
        System.out.println("Ingrese una palabra");
        String palabra = leer.nextLine();
        System.out.println("Tiene 5 oportunidades");
        System.out.println("Buena suerte!");
        a1.setJugadasMaximas(5);
        a1.setPalabra(palabra.toCharArray());
        a1.setLetrasEncontradas(0);

        char[] mostrarPalabra = new char[a1.getPalabra().length];
        Arrays.fill(mostrarPalabra, '_');
        a1.setMostrarPalabra(mostrarPalabra);

        boolean[] encontrada = new boolean[a1.getPalabra().length];
        Arrays.fill(encontrada, false);
        a1.setEncontrada(encontrada);
    }

    private int longitud() {
        return a1.getPalabra().length;
    }

    private void buscar(char letra) {
        for (int i = 0; i < a1.getPalabra().length; i++) {
            if (a1.getPalabra()[i] == letra) {
                System.out.println("La letra se encuentra en la palabra");
                if (a1.getEncontrada()[i]) {
                    System.out.println("La letra ya ha sido ingresada");
                }
                return;
            }
        }
        System.out.println("Letra ingresada no se encuentra en la palabra");
    }

    private boolean encontradas(char letra) {
        boolean result = false;
        int encontradas = a1.getLetrasEncontradas();
        for (int i = 0; i < a1.getPalabra().length; i++) {
            if (a1.getPalabra()[i] == letra) {
                result = true;
                a1.getMostrarPalabra()[i] = letra;
                a1.setMostrarPalabra(a1.getMostrarPalabra());
                if (!a1.getEncontrada()[i]) {
                    encontradas++;
                    a1.setLetrasEncontradas(encontradas);
                }
                a1.getEncontrada()[i] = true;
                a1.setEncontrada(a1.getEncontrada());
            }
        }
        return result;
    }

    private String mostrarPalabraEncontrada() {
        StringBuilder result = new StringBuilder();
        for (char letra : a1.getMostrarPalabra()) {
            result.append(letra);
        }
        return result.toString();
    }

    private void intentos() {
        System.out.println("La palabra descubierta es: " + mostrarPalabraEncontrada());
        System.out.println("Letra encontradas: " + a1.getLetrasEncontradas());
        System.out.println("Letras faltantes: " + (a1.getPalabra().length - a1.getLetrasEncontradas()));
        System.out.println("Te quedan " + a1.getJugadasMaximas() + " jugadas");
        System.out.println("------------------------------------");
    }

    private void finJuego(boolean ganador) {
        if (ganador) {
            System.out.println("Encontraste la palabra!");
            System.out.println("Te sobraron " + a1.getJugadasMaximas() + "intentos");
        } else {
            System.out.println("Agotaste todos tus intentos");
            System.out.println("Encontró la palabra " + mostrarPalabraEncontrada());
        }
    }

    public void juego() {
        crearJuego();

        while (a1.getJugadasMaximas() > 0) {
            System.out.println("Ingrese una letra");
            char letra = leer.nextLine().charAt(0);
            buscar(letra);
            if (!encontradas(letra)) {
                a1.setJugadasMaximas(a1.getJugadasMaximas() - 1);
            }
            if (a1.getJugadasMaximas() == 0) {
                finJuego(false);
                break;
            } else if (a1.getLetrasEncontradas() == a1.getPalabra().length) {
                finJuego(true);
                break;
            } else {
                intentos();
            }
        }
    }
}

