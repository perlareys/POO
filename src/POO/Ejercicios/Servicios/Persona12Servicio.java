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
import java.util.Date;
import POO.Ejercicios.Entidad.Persona12;

public class Persona12Servicio {

    Scanner leer = new Scanner(System.in);

    public Persona12 crearPersona() {
        String nombre;
        Date fechaNacimiento;
        int dia, mes, anio;

        System.out.println("Ingresar nombre");
        nombre = leer.nextLine();
        System.out.println("Ingrese dia de nacimiento");
        dia = leer.nextInt();
        System.out.println("Ingresar mes de nacimiento");
        mes = leer.nextInt();
        System.out.println("Ingresar año de nacimiento");
        anio = leer.nextInt();

        fechaNacimiento = new Date(anio - 1900, mes - 1, dia);
        return new Persona12(nombre, fechaNacimiento);
    }

    public int calcularEdad(Persona12 persona) {
        Date hoy = new Date();

        if (persona.getFechaNacimiento().before(hoy)) {
            double difAnios = hoy.getYear() - persona.getFechaNacimiento().getYear();
            double difMeses = hoy.getMonth() - persona.getFechaNacimiento().getMonth();
            double difDias = hoy.getDay() - persona.getFechaNacimiento().getDay();

            difMeses += difDias / 30;
            difAnios += difMeses / 12;

            return (int) Math.floor(difAnios);
        } else {
            return -1;
        }
    }

    public boolean menorQue(Persona12 persona, int edad) {
        if (calcularEdad(persona) < edad) {
            return true;
        } else {
            return false;
        }
    }

    public String mostrarNombre(Persona12 persona) {
        return persona.getNombre();
    }

    public Date mostrarFechaNacimiento(Persona12 persona) {
        return persona.getFechaNacimiento();
    } 
}

