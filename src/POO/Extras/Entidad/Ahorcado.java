/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Extras.Entidad;

/**
 *
 * @author Perla
 */
public class Ahorcado {
    private char[] palabra;
    private int letrasEncontradas;
    private int jugadasMaximas;
    private char[] mostrarPalabra;
    private boolean[] encontrada;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int letrasEncontradas, int jugadasMaximas, char[] mostrarPalabra, boolean[] encontrada) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
        this.mostrarPalabra = mostrarPalabra;
        this.encontrada = encontrada;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    public char[] getMostrarPalabra() {
        return mostrarPalabra;
    }

    public void setMostrarPalabra(char[] mostrarPalabra) {
        this.mostrarPalabra = mostrarPalabra;
    }

    public boolean[] getEncontrada() {
        return encontrada;
    }

    public void setEncontrada(boolean[] encontrada) {
        this.encontrada = encontrada;
    }
}

