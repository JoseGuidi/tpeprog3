/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4ej4;

/**
 *
 * @author ilari
 */
public class Estado {
    boolean viajando;
    boolean concentrado;
    boolean enPaisOrigen;

    public boolean isViajando() {
        return viajando;
    }

    public boolean isConcentrado() {
        return concentrado;
    }

    public boolean isEnPaisOrigen() {
        return enPaisOrigen;
    }

    public void setViajando(boolean viajando) {
        this.viajando = viajando;
    }

    public void setConcentrado(boolean concentrado) {
        this.concentrado = concentrado;
    }

    public void setEnPaisOrigen(boolean enPaisOrigen) {
        this.enPaisOrigen = enPaisOrigen;
    }
    
    @Override
    public String toString(){
        return("En pais origen "+this.isEnPaisOrigen()+" Viajando "+this.isViajando()+" Concentrado "+this.isConcentrado());
    }
    
    public Estado(){
        this.setConcentrado(false);
        this.setEnPaisOrigen(true);
        this.setViajando(false);
    }
}
