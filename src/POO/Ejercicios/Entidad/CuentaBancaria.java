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
public class CuentaBancaria {
    private int numeroCuenta;
    private long dniCliente;
    private int saldoActual;
    
    public CuentaBancaria(){
        
    }
    public CuentaBancaria(int numeroCuenta, long dniCliente, int saldoActual){
        this.numeroCuenta= numeroCuenta;
        this.dniCliente= dniCliente;
        this.saldoActual= saldoActual;
    }
    public int getNumeroCuenta(){
        return numeroCuenta;
    }
    public long getDniCliente(){
        return dniCliente;
    }
    public int getSaldoActual(){
        return saldoActual;
    }
    public void setNumeroCuenta(int numeroCuenta){
        this.numeroCuenta= numeroCuenta;
    }
    public void setdniCliente(long dniCliente){
        this.dniCliente= dniCliente;
    }
    public void setSaldoActual(int saldoActual){
        this.saldoActual= saldoActual;
    }
}
