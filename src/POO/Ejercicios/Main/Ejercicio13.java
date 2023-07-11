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
import POO.Ejercicios.Servicios.CursoServicio;
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CursoServicio curso1= new CursoServicio();
        curso1.cargarAlumnos();
        curso1.crearCurso();
        curso1.calcularGananciaSemanal();
        System.out.println("La ganancia semanal es: "+curso1.calcularGananciaSemanal());
    }
    
}
