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
import POO.Ejercicios.Entidad.Nespresso;
import java.util.Scanner;

public class NespressoServicio {

    Scanner leer = new Scanner(System.in);

    Nespresso n1 = new Nespresso();

    public void llenarCafetera() {
        n1.setCantidadActual(n1.getCapacidadMaxima());
    }

    public void servirTaza() {
        System.out.println("Ingresar la medida de la taza");
        int taza = leer.nextInt();
        if (n1.getCantidadActual() >= taza) {
            //calcular lo que queda en la cafetera
            n1.setCantidadActual(n1.getCantidadActual() - taza);
            System.out.println("Taza llena");
        } else {
            int cantidadServida = n1.getCantidadActual();
            System.out.println("Café insuficiente, no se pudo llenar la taza.");
            System.out.println("Cantidad servida: " + cantidadServida);
        }
    }
    
    public void vaciarCafetera(){
        n1.setCantidadActual(0);
        System.out.println("Se ha vaciado la cafetera");
    }
    
    public void agregarCafe(){
        System.out.println("Ingrese la cantidad de café a agregar");
        int cafeAgregado= leer.nextInt();
        n1.setCantidadActual(n1.getCantidadActual()+cafeAgregado);
        System.out.println("Se ha agregado café a la cafetera");
    }
}
