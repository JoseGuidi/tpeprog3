/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpgrafos;

/**
 *
 * @author ilari
 */
public class NodoDijkstra {
    int valor;
    int distancia;
    int padre;

    public int getValor() {
        return valor;
    }

    public int getPadre() {
        return padre;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setPadre(int padre) {
        this.padre = padre;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getDistancia() {
        return distancia;
    }

    public NodoDijkstra(int valor, int padre,int distancia) {
        this.valor = valor;
        this.padre = padre;
        this.distancia=distancia;
    }
    
    public boolean equals(int v){
        return this.valor==v;
    }
    
}
