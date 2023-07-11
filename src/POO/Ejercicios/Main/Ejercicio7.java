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
import POO.Ejercicios.Entidad.Persona;
import POO.Ejercicios.Servicios.PersonaServicio;

public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio persona1 = new PersonaServicio();
        Persona p1 = persona1.crearPersona();
        persona1.esMayorDeEdad(p1);
        int imcpersona1=persona1.calcularIMC(p1);

        PersonaServicio persona2 = new PersonaServicio();
        Persona p2 = persona2.crearPersona();
        int imcpersona2=persona2.calcularIMC(p2);
        persona2.esMayorDeEdad(p2);

        PersonaServicio persona3 = new PersonaServicio();
        Persona p3 = persona3.crearPersona();
        int imcpersona3=persona3.calcularIMC(p3);
        persona3.esMayorDeEdad(p3);

        PersonaServicio persona4 = new PersonaServicio();
        Persona p4 = persona4.crearPersona();
        int imcpersona4=persona4.calcularIMC(p4);
        persona4.esMayorDeEdad(p4);

        //calcular porcentajes según peso
        int personasPesoIdeal = 0;
        int personasBajoPeso = 0;
        int personasSobrePeso = 0;
        
        System.out.println("--------RESUMEN--------");
        if (imcpersona1==-1){
            personasBajoPeso+=1;
        } else if(imcpersona1==0){
            personasPesoIdeal+=1;
        } else{
            personasSobrePeso+=1;
        }

        if (imcpersona2==-1){
            personasBajoPeso+=1;
        } else if(imcpersona2==0){
            personasPesoIdeal+=1;
        } else{
            personasSobrePeso+=1;
        }

        if (imcpersona3==-1){
            personasBajoPeso+=1;
        } else if(imcpersona3==0){
            personasPesoIdeal+=1;
        } else{
            personasSobrePeso+=1;
        }

        if (imcpersona4==-1){
            personasBajoPeso+=1;
        } else if(imcpersona4==0){
            personasPesoIdeal+=1;
        } else{
            personasSobrePeso+=1;
        }

        //calculo porcentajes
        double porcentajePesoIdeal = (personasPesoIdeal / 4) * 100;
        double porcentajeBajoPeso = (personasBajoPeso / 4) * 100;
        double porcentajeSobrePeso = (personasSobrePeso / 4) * 100;

        //calcular porcentajes según edad
        int mayorEdad = 0;

        if (true == persona1.esMayorDeEdad(p1)) {
            mayorEdad+=1;
        }

        if (true == persona2.esMayorDeEdad(p2)) {
            mayorEdad+=1;
        }

        if (true == persona3.esMayorDeEdad(p3)) {
            mayorEdad+=1;
        }

        if (true == persona4.esMayorDeEdad(p4)) {
            mayorEdad+=1;
        }

        //calculo porcentajes
        double porcentajeMayorEdad = (mayorEdad / 4) * 100;
        System.out.println("--------RESULTADOS--------------");
        System.out.println("Porcentaje de personas por debajo del peso ideal: " + porcentajeBajoPeso);
        System.out.println("Porcentaje de personas con peso ideal: " + porcentajePesoIdeal);
        System.out.println("Porcentaje de personas con sobre peso: " + porcentajeSobrePeso);
        System.out.println("Porcentaje de personas mayores de edad: " + porcentajeMayorEdad);
        System.out.println("Porcentade de personas menores de edad: " + (100 - porcentajeMayorEdad));
    }

}
