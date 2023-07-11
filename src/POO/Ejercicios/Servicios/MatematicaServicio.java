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
import POO.Ejercicios.Entidad.Matematica;

public class MatematicaServicio {

    Matematica m1 = new Matematica();

    public Matematica crearNumeros() {
        double numero1= Math.random()*10+1;
        double numero2= Math.random()*10+1; 
        System.out.println("Número 1: "+numero1);
        System.out.println("Número 2: "+ numero2);
        return new Matematica(numero1, numero2);
    }

    public double devolverMayor( Matematica matematica) {
        double numero1= m1.getNumero1();
        double numero2= m1.getNumero2();
        return Math.max(numero1,numero2);
    }

    public double calcularPotencia(Matematica matematica) {
        double mayor = Math.max(m1.getNumero1(),m1.getNumero2());
        double menor = Math.min(m1.getNumero1(), m1.getNumero2());
        return Math.pow(Math.round(mayor), Math.round(menor));
    }

    public double calcularRaiz() {
        double menor = Math.min(m1.getNumero1(), m1.getNumero2());
        return Math.sqrt(Math.abs(menor));
    }
}
