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
import POO.Ejercicios.Entidad.Cadena;

public class CadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cadena c1 = new Cadena();

    public void crearCadena() {
        System.out.println("Ingresar palabra o frase");
        c1.setFrase(leer.nextLine());
        System.out.println("Longitud de la frase: " + c1.getLongitud());
    }

    public int mostrarVocales() {
        String aux;
        int contador = 0;
        for (int i = 0; i < c1.getLongitud(); i++) {
            aux = String.valueOf(c1.getFrase().charAt(i));
            if (aux.equalsIgnoreCase("A") || aux.equalsIgnoreCase("E") || aux.equalsIgnoreCase("I") || aux.equalsIgnoreCase("O") || aux.equalsIgnoreCase("U")) {
                contador++;
            }
        }
        return contador;
    }

    public String invertirFrase() {
        String fraseInvertida = "";
        for (int i = c1.getLongitud() - 1; i >= 0; i--) {
            fraseInvertida = fraseInvertida.concat(String.valueOf(c1.getFrase().charAt(i)));
        }
        return fraseInvertida;
    }

    public int vecesRepetido(String letra) {
        int contador = 0;
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (String.valueOf(c1.getFrase().charAt(i)).equalsIgnoreCase(letra)) {
                contador++;
            }
        }
        return contador;
    }

    public boolean compararLongitud(String frase) {
        //System.out.println("Ingresar nueva palabra o frase");
        //frase2 = leer.nextLine();
        return c1.getLongitud() == frase.length();
    }

    public String unirFrases(String frase) {
        return c1.getFrase().concat(" " + frase);
    }

    public String reemplazarFrase(String letra) {
        String reemplazo = "";
        //System.out.println("Ingresar la letra que reemplazará A");
        //String letra= leer.next();
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (String.valueOf(c1.getFrase().charAt(i)).equalsIgnoreCase("A")) {
                reemplazo = reemplazo.concat(String.valueOf(letra.charAt(0)));
            } else {
                reemplazo = reemplazo.concat(String.valueOf(c1.getFrase().charAt(i)));
            }
        }
        return reemplazo;
    }

    public boolean contiene(String letra) {
        return c1.getFrase().toLowerCase().contains(letra.toLowerCase());
    }
}

