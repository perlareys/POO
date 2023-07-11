/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Desafios.Grupal2.Servicio;

/**
 *
 * @author Perla
 */
import java.util.Scanner;
import POO.Desafios.Grupal2.Entidad.Pelicula;
public class PeliculaServicio {
    Scanner leer= new Scanner(System.in);
    
    public Pelicula crearPelicula(String titulo, String genero, int anio, int duracion){
        return new Pelicula(titulo, genero, anio, duracion);
    }
    
    public void peliculasDisponibles(Pelicula[] newPelicula){
        for (int i = 0; i < newPelicula.length; i++) {
            if(newPelicula[i] != null && (!newPelicula[i].isAlquilada())){
                System.out.println(newPelicula[i].getTitulo());
            }
        }
    }
    
    public int buscarPelicula(Pelicula[] arregloPelicula, String titulo){
        for (int i = 0; i < arregloPelicula.length; i++) {
            if(arregloPelicula[i].getTitulo().equals(titulo)){
                return i;
            }
        }
        return -1;
    }
    
    public void getNombrePelicula(Pelicula newPelicula){
        System.out.println(newPelicula.getTitulo());
    }
    
    public void isAlquilada(Pelicula newPelicula){
        if(newPelicula.isAlquilada()){
            System.out.println("Película está alquilada");
        } else {
            System.out.println("Película disponible");
        }
    }
}

