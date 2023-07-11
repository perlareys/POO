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
import POO.Ejercicios.Entidad.Persona;
import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona p1 = new Persona();
        System.out.println("------INGRESAR DATOS------");
        System.out.print("Ingresar nombre: ");
        p1.setNombre(leer.nextLine());
        System.out.print("Ingresar edad: ");
        p1.setEdad(leer.nextInt());
        System.out.print("Ingresar sexo: ");
        p1.setSexo(leer.next().charAt(0));
        while (p1.getSexo() != 'H' && p1.getSexo() != 'M' && p1.getSexo() != 'O') {
            System.out.println("Opcion not found");
            System.out.println("Ingresar nuevamente");
            p1.setSexo(leer.next().charAt(0));
        }
        System.out.print("Ingresar peso: ");
        p1.setPeso(leer.nextDouble());
        System.out.print("Ingresar altura: ");
        p1.setAltura(leer.nextDouble());

        return p1;
    }

    public int calcularIMC(Persona p1) {
        double imc = p1.getPeso() / (p1.getAltura() * p1.getAltura());

        if (imc < 20) {
            System.out.println("Persona por debajo del peso ideal");
            return -1;
        } else if (imc >= 20 && imc <= 25) {
                System.out.println("Persona con peso ideal");
                return 0;
            } else{
            System.out.println("Persona con sobrepeso");
            return 1;
        }
    }

    public boolean esMayorDeEdad(Persona p1) {
        if (p1.getEdad() >= 18) {
            System.out.println("Es mayor de edad");
            return true;
        } else {
            System.out.println("Es menor de edad");
            return false;
        }       
    }
}

