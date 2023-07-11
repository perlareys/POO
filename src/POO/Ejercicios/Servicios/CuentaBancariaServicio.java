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
import POO.Ejercicios.Entidad.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {

    Scanner leer = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {
        CuentaBancaria c1 = new CuentaBancaria();
        System.out.println("Ingresar sus datos");
        System.out.print("Número de cuenta: ");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.print("DNI : ");
        c1.setdniCliente(leer.nextLong());
        System.out.print("Saldo Actual: ");
        c1.setSaldoActual(leer.nextInt());
        return c1;
    }
    
    public void ingresar(CuentaBancaria c1) { //() llama la inf. ingresada arriba
        System.out.println("Ingresar la cantidad a depositar");
        int ingreso = leer.nextInt();
        c1.setSaldoActual(c1.getSaldoActual()+ingreso);
        
    }

    public void retirar(CuentaBancaria c1) {
        System.out.println("Ingresar la cantidad a retirar");
        int retiro = leer.nextInt();
        c1.setSaldoActual(c1.getSaldoActual()-retiro);
    }

    public void extraccionRapida(CuentaBancaria c1) {
        System.out.println("Ingresar la cantidad a retirar");
        int extraccion = leer.nextInt();
        double limite = c1.getSaldoActual() * 0.2;
        if (limite > extraccion) {
            System.out.println("Sólo puede retirar eel 20% de su saldo");
        } else {
            System.out.println("Dinero retirado");
            c1.setSaldoActual(c1.getSaldoActual()-extraccion);
        }
    }

    public void consultarSaldo(CuentaBancaria c1) {
        System.out.println("Saldo Actual: " + c1.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria c1) {
        System.out.println("Número de cuenta: " + c1.getNumeroCuenta());
        System.out.println("DNI : " + c1.getDniCliente());
        System.out.println("Saldo Actual: " + c1.getSaldoActual());
    }
}