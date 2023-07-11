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
import POO.Ejercicios.Entidad.Curso;
import java.util.Scanner;

public class CursoServicio {

    Scanner leer = new Scanner(System.in);
    Curso c1=new Curso();
    
    public void cargarAlumnos() {
        String[] alumnos = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese nombre del alumno " + (i+1));
            alumnos[i] = leer.next();
        }
        c1.setAlumnos(alumnos);
    }

    public void crearCurso() {
        int turno = 0;
        System.out.println("Ingresar nombre del curso");
        c1.setNombreCurso(leer.nextLine());
        
        while (turno != 1 && turno != 2) {
            System.out.println("Seleccione el turno del alumno");
            System.out.println("1. Mañana");
            System.out.println("2. Tarde");
            turno = leer.nextInt();

            if (turno == 1) {
                System.out.println("Mañana");
            } else {
                System.out.println("Tarde");
            }
            }
            
            System.out.println("¿Cuántas horas al día tomará este curso?");
            c1.setCantidadHorasPorDia(leer.nextInt());
            System.out.println("¿Cuántas días a la semana?");
            c1.setCantidadDiasPorSemana(leer.nextInt());
            System.out.println("Precio por hora del curso");
            c1.setPrecioHora(leer.nextDouble());
        
    }

    public double calcularGananciaSemanal() {
        int contador=0;
        for(String alumno : c1.getAlumnos()){
            contador++;
        }
        return c1.getPrecioHora()*c1.getCantidadDiasPorSemana()*c1.getCantidadHorasPorDia()*contador;
    }
}
