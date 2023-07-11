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
import java.util.Scanner;
import POO.Ejercicios.Entidad.Persona12;
import POO.Ejercicios.Servicios.Persona12Servicio;

public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona12Servicio p1 = new Persona12Servicio();
        Persona12 persona = p1.crearPersona();
        //calculamos edad
        System.out.println(persona.getNombre() + " tiene  " + p1.calcularEdad(persona) + " años");
        //ingresamos una edad y calculamos si la primera persona es menor
        System.out.println("Ingresar edad de la otra persona");
        int edad = leer.nextInt();
        System.out.println(persona.getNombre() + " ¿Es menor que la otra persona? " + p1.menorQue(persona, edad));
        
        System.out.println("---RESUMEN---");
        System.out.println(p1.mostrarNombre(persona));
        System.out.println(p1.mostrarFechaNacimiento(persona));
    }
    
}
