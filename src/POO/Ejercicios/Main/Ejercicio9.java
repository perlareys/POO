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
import POO.Ejercicios.Servicios.MatematicaServicio;
import POO.Ejercicios.Entidad.Matematica;
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MatematicaServicio mate1= new MatematicaServicio();
       
        System.out.println("Números generados: ");
        Matematica matematica= mate1.crearNumeros();
        
        System.out.println("El número mayor es: "+ mate1.devolverMayor(matematica));
        
        System.out.println("La potencia de los números es: "+ mate1.calcularPotencia(matematica));
        
        System.out.println("La raiz de los números es: "+mate1.calcularRaiz());
    }
    
}
