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
public class Pelicula extends ElementoImbd{
    double puntaje;
    int año;
    int cantidadOscars;
    ArrayList<Actor>actores;

    public Pelicula(double puntaje, int año, int cantidadOscars, String titulo) {
        super(titulo);
        this.puntaje = puntaje;
        this.año = año;
        this.cantidadOscars = cantidadOscars;
        actores=new ArrayList();
    }
    
    public void addActor(Actor a){
        if(!actores.contains(a))
            actores.add(a);
    }
    
    public boolean tieneActor(Actor a){
        return actores.contains(a);
    }
    
    @Override
    public ArrayList<Actor> obtenerActortes() {
        ArrayList<Actor> aux=new ArrayList();
        aux.addAll(actores);
        return aux;
    }

    @Override
    public int obtenerCantOscars() {
        return cantidadOscars;
    }

    @Override
    public double obtenerPuntaje() {
        return puntaje;
    }

    @Override
    public ArrayList<Pelicula> buscar(Condicion c) {
        ArrayList<Pelicula> filtro=new ArrayList();
        if (c.cumple(this))
            filtro.add(this);
        return filtro;
    }

    @Override
    public ElementoImbd copia(Condicion c) {
        if(c.cumple(this)){
            Pelicula copia=new Pelicula(puntaje,año,cantidadOscars,titulo);
            for(Actor a:actores){
                copia.addActor(a);
            }
            return copia;
        }
        return null;
    }
    
}
