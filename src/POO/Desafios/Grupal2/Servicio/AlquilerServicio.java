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
import POO.Desafios.Grupal2.Entidad.Alquiler;
import POO.Desafios.Grupal2.Entidad.Pelicula;
import java.time.LocalDate;
import java.time.Period;

public class AlquilerServicio {

    public Alquiler alquilarPelicula(Pelicula newPelicula, LocalDate fechaInicio) {
        if (!newPelicula.isAlquilada()) {
            newPelicula.setAlquilada(true);
            System.out.println(newPelicula.getTitulo() + " ha sido alquilada");
            return new Alquiler(newPelicula, fechaInicio);
        } else {
            return null;
        }
    }

    public void devolverAlquiler(Alquiler alquiler, LocalDate fechaDevolucion) {
        alquiler.getPeliculaAlquilada().setAlquilada(false);
        alquiler.setFechaFin(fechaDevolucion);

        int diferencia = Period.between(alquiler.getFechaInicio(), alquiler.getFechaFin()).getDays();
        if (diferencia > 3) {
            double interes = (10 * ((0.1) * (diferencia - 3)));
            alquiler.setPrecio(10 + interes);
        } else {
            alquiler.setPrecio(10);
        }
        System.out.println("Precio por alquiler es: " + alquiler.getPrecio());
    }
    
    public void listaAlquileres(Alquiler[] newAlquiler){
        for (int i = 0; i < newAlquiler.length; i++) {
            if(newAlquiler[i] != null && newAlquiler[i].getPeliculaAlquilada().isAlquilada()){
                System.out.println(newAlquiler[i].getPeliculaAlquilada().getTitulo());
            }
        }
    }
    
    public void mostrarAlquilerFecha(Alquiler[] newAlquiler, LocalDate fecha){
        boolean flag = false;
        for (int i=0; i< newAlquiler.length; i++) {
            if (newAlquiler[i] != null && newAlquiler[i].getFechaInicio().isEqual(fecha)) {
                System.out.println(newAlquiler[i].getPeliculaAlquilada().getTitulo());
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("No coinciden las fechas");
        }
    }
}

