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
import POO.Ejercicios.Servicios.CuentaBancariaServicio;
import POO.Ejercicios.Entidad.CuentaBancaria;
import java.util.Scanner;

public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaBancariaServicio cuenta1 = new CuentaBancariaServicio();
        CuentaBancaria c1 = cuenta1.crearCuenta();
        int opccion;
        do {
            System.out.println("------BIENVENIDO------");
            System.out.println("1.  Crear cuenta");
            System.out.println("2.  Ingresar dinero");
            System.out.println("3.  Retirar dinero");
            System.out.println("4.  Extracción rápida");
            System.out.println("5. Consultar saldo");
            System.out.println("6. Consultar datos");
            System.out.println("7.  Salir");
            opccion = leer.nextInt();

            switch (opccion) {
                case 1:
                    cuenta1.crearCuenta();
                    break;
                case 2:
                    cuenta1.ingresar(c1);

                    break;
                case 3:
                    cuenta1.retirar(c1);

                    break;
                case 4:
                    cuenta1.extraccionRapida(c1);
                    break;
                case 5:
                    cuenta1.consultarSaldo(c1);
                    break;
                case 6:
                    cuenta1.consultarDatos(c1);
                    break;
                case 7:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            System.out.println();
        } while (opccion != 7);
    }
}
