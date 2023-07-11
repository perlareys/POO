/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Ejercicios.Servicios;

import POO.Ejercicios.Entidad.Libro;
import java.util.Scanner;
/**
 *
 * @author Perla
 */
public class LibroServicio {

    public Libro crearLibro() {
        Libro l1 = new Libro();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese ISBN: ");
        l1.setIsbn(leer.next());
        System.out.println("Ingrese el título del libro");
        l1.setTitulo(leer.next());
        System.out.println("Ingrese autor del libro");
        l1.setAutor(leer.next());
        System.out.println("Ingrese el número de páginas del libro");
        l1.setNumeroPaginas(leer.nextInt());
        return l1;
    }
    public void informacionLibro(Libro l1){
        System.out.println("ISBN: "+l1.getIsbn());
        System.out.println("Título: "+l1.getTitulo());
        System.out.println("Autor: "+l1.getAutor());
        System.out.println("Número de páginas: "+l1.getNumeroPaginas());
    }
}

