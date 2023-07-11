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
import POO.Ejercicios.Servicios.CadenaServicio;
import java.util.Scanner;

public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase2, letra1, letra2, letra3;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CadenaServicio cadena1 = new CadenaServicio();
        cadena1.crearCadena();
        System.out.println("---------------------------------------------");
        //método mostrar vocales
        System.out.println("La frase tiene: " + cadena1.mostrarVocales() + " vocales");
        System.out.println("---------------------------------------------");
        //invertir frase
        System.out.println("Frase invertida " + cadena1.invertirFrase());
        System.out.println("---------------------------------------------");
        //número de veces que se repite una letra
        System.out.println("Ingresar la letra a buscar");
        letra1 = leer.next();
        System.out.println("La cantidad de veces que se repite la letra " + letra1 + " es: " + cadena1.vecesRepetido(letra1));
        System.out.println("---------------------------------------------");
        //comparar con otra frase
        System.out.println("Ingresar una nueva palabra o frase");
        frase2 = leer.next();
        System.out.println("Comparación de longitudes: " + cadena1.compararLongitud(frase2));
        System.out.println("---------------------------------------------");
        //unir frases
        System.out.println("Frases unidas: " + cadena1.unirFrases(frase2));
        System.out.println("---------------------------------------------");
        //reemplazar una letra
        System.out.println("Escribir letra que reemplazará a A");
        letra2 = leer.next();
        System.out.println("Nueva frase: " + cadena1.reemplazarFrase(letra2));
        System.out.println("---------------------------------------------");
        //contiene tal letra
        System.out.println("Ingresar letra a buscar: ");
        letra3 = leer.next();
        System.out.println("La frase contiene esta letra? " + cadena1.contiene(letra3));

        //todos los métodos trabajan en base a la primera frase ingresada
    }

}

