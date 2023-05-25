/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backtracking;

/**
 *
 * @author ilari
 */
public class Casilla {
    int valor;
    boolean izquierda;
    boolean derecha;
    boolean arriba;
    boolean abajo;
    boolean visitada;
    int fila;
    int columna;
    
    public Casilla(int valor, boolean izquierda, boolean derecha, boolean arriba, boolean abajo) {
        this.valor = valor;
        this.izquierda = izquierda;
        this.derecha = derecha;
        this.arriba = arriba;
        this.abajo = abajo;
        
        visitada=false;
    }

    public boolean poseeMovimiento(){
        return ((izquierda!=false)||(derecha!=false)||(arriba!=false)||(abajo!=false));
    }
    
    public int getValor() {
        return valor;
    }

    public boolean isIzquierda() {
        return izquierda;
    }

    public boolean isDerecha() {
        return derecha;
    }

    public boolean isArriba() {
        return arriba;
    }

    public boolean isAbajo() {
        return abajo;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setIzquierda(boolean izquierda) {
        this.izquierda = izquierda;
    }

    public void setDerecha(boolean derecha) {
        this.derecha = derecha;
    }

    public void setArriba(boolean arriba) {
        this.arriba = arriba;
    }

    public void setAbajo(boolean abajo) {
        this.abajo = abajo;
    }

    public boolean isVisitada() {
        return visitada;
    }

    public void setVisitada(boolean visitada) {
        this.visitada = visitada;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
    
}
