/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialviejo;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public abstract class ElementoImbd {
    String titulo;

    public ElementoImbd(String titulo) {
        this.titulo = titulo;
    }
    public abstract ArrayList<Actor> obtenerActortes();
    public abstract int obtenerCantOscars();
    public abstract double obtenerPuntaje();
    public abstract ArrayList<Pelicula>buscar(Condicion c);
    public abstract ElementoImbd copia(Condicion c);

    public String getTitulo() {
        return titulo;
    }
    
    
}
