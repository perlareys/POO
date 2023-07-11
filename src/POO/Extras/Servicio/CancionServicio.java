/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Extras.Servicio;

/**
 *
 * @author Perla
 */
import POO.Extras.Entidad.Cancion;
import java.util.Scanner;

public class CancionServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("/n");
    Cancion c1 = new Cancion();
    
    public void agregarCancion() {
        System.out.println("Ingresar nombre de la canción");
        c1.setTitulo(leer.nextLine());
        System.out.println("Ingresar nombre del autor");
        c1.setAutor(leer.nextLine());
    }
}
