/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Desafios.Main;

/**
 *
 * @author Perla
 */
import POO.Desafios.Entidad.Alquiler;
import POO.Desafios.Entidad.Pelicula;
import POO.Desafios.Servicio.AlquilerServicio;
import POO.Desafios.Servicio.PeliculaServicio;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;
public class Grupal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        int opcion;
        Scanner leer=new Scanner(System.in);
        PeliculaServicio peliServicio= new PeliculaServicio();
        AlquilerServicio alquiServicio= new AlquilerServicio();
        Pelicula[] arregloPeliculas= new Pelicula[5];
        Alquiler[] arregloAlquiler= new Alquiler[3];
        
        do{
            System.out.println("--------------------------");
            System.out.println("MENÚ ALQUILER DE PELICULAS");
            System.out.println("--------------------------");
            System.out.println("1. Cargar película");
            System.out.println("2. Ver películas disponibles");
            System.out.println("3. Alquilar película");
            System.out.println("4. Listado de alquileres");
            System.out.println("5. Buscar películas");
            System.out.println("6. Buscar alquileres por fecha");
            System.out.println("7. Devolver alquiler");
            System.out.println("8. Mostrar totales recaudados");
            System.out.println("9. Salir");
            opcion=leer.nextInt();
            
            switch(opcion){
                case 1:
                    arregloPeliculas[0]=peliServicio.crearPelicula("A call to spy", "Crime", 2019, 123);
                    arregloPeliculas[1]=peliServicio.crearPelicula("No time to die", "Action", 2021, 163);
                    arregloPeliculas[2]=peliServicio.crearPelicula("The gray man", "Suspense", 2022, 122);
                    arregloPeliculas[3]=peliServicio.crearPelicula("Where the Crawdads Sing", "Drama", 2022, 125);
                    arregloPeliculas[4]=peliServicio.crearPelicula("Pride & Prejudice", "Romance", 2005, 129);
                    break;
                case 2:
                    peliServicio.peliculasDisponibles(arregloPeliculas);
                    break;
                case 3:
                    arregloAlquiler[0]=alquiServicio.alquilarPelicula(arregloPeliculas[0], LocalDate.now());
                    arregloAlquiler[1]=alquiServicio.alquilarPelicula(arregloPeliculas[3], LocalDate.now());
                    arregloAlquiler[2]=alquiServicio.alquilarPelicula(arregloPeliculas[4], LocalDate.now());
                    break;
                case 4:
                    alquiServicio.listaAlquileres(arregloAlquiler);
                    break;
                case 5:
                    System.out.println("Ver películas por:");
                    System.out.println("1. Título");
                    System.out.println("2. Género");
                    switch(leer.nextInt()){
                        case 1:
                            System.out.println("Escribir nombre de la película");
                            int indice=peliServicio.buscarPelicula(arregloPeliculas,leer.next());
                            if(indice>=0){
                                peliServicio.getNombrePelicula(arregloPeliculas[indice]);
                                peliServicio.isAlquilada(arregloPeliculas[indice]);
                            } else{
                                System.out.println("Not found");
                            }
                        case 2:
                            
                    }
                    break;
                case 6:
                    alquiServicio.mostrarAlquilerFecha(arregloAlquiler, LocalDate.of(2023, 07, 6));
                    break;
                case 7:
                    alquiServicio.devolverAlquiler(arregloAlquiler[0], LocalDate.of(2023, 07, 11));
                    alquiServicio.devolverAlquiler(arregloAlquiler[3], LocalDate.of(2023, 07, 8));
                    alquiServicio.devolverAlquiler(arregloAlquiler[4], LocalDate.of(2023, 07, 9));
                    break;
                case 8:
                    //totales
                    break;
                case 9:
                    //salir
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (opcion != 9);
            }
        }
