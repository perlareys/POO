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
public class Circunferencia {
    private double radio;
    
    public Circunferencia(){
        
    }
    //constructor que inicializa el radio
    public Circunferencia(double radio){
       this.radio=radio; 
    }
    //constructor get
    public double getRadio(){
        return radio;
    }
    //constructor set
    public void setRadio(double radio){
        this.radio=radio;
        System.out.println("Nuevo Radio: "+radio);
    }
}
