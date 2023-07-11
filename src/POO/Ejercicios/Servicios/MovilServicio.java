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
import POO.Ejercicios.Entidad.Movil;
import java.util.Scanner;

public class MovilServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Movil m1 = new Movil();

    public void ingresarCodigo() {
        boolean ingreso = false;
        int aux;
        int[] codigo = new int[7];
        
        while (!ingreso) {
            System.out.println("Ingresar código");
            //leer.nextInt();
            if (leer.hasNextInt()) {
                aux = leer.nextInt();
                if (aux > 9999999) {
                    System.out.println("Código incorrecto. Ingrese nuevamente");
                } else {
                    for (int i = 7; i > 0; i--) {
                        codigo[i - 1] = aux % 10;
                        aux = aux / 10;
                    }
                    ingreso= true;
                }
            } else{
                System.out.println("Ingrese nuevamente");
            }
        }
         m1.setCodigo(codigo);
    }
    
    public void cargarCelular() {
        System.out.println("------CARGAR DATOS------");
        System.out.println("Ingresar marca");
        m1.setMarca(leer.nextLine());
        System.out.println("Ingresar precio");
        m1.setPrecio(leer.nextDouble());
        System.out.println("Ingresar modelo");
        m1.setModelo(leer.next());
        System.out.println("ingresar memoria Ram");
        m1.setMemoriaRam(leer.nextInt());
        System.out.println("Ingresar almacenamiento");
        m1.setAlmacenamiento(leer.nextInt());
        ingresarCodigo();
    }

    public void mostrarInformacion(){
        System.out.println(m1.toString());
    }
    
}
