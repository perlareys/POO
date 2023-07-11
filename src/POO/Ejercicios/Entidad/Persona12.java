/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Ejercicios.Entidad;

/**
 *
 * @author Perla
 */
import java.util.Date;
public class Persona12 {
    private String nombre;
    private Date fechaNacimiento;

    public Persona12() {
    }

    public Persona12(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona12{" + "nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
  
    
}
