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
public class Saga extends ElementoImbd{
    ArrayList<ElementoImbd>elementos;

    public Saga(String titulo) {
        super(titulo);
        elementos=new ArrayList();
    }
    
    public void addElemento(ElementoImbd e){
        if(e!=null){
            elementos.add(e);
        }
    }
    
    @Override
    public ArrayList<Actor> obtenerActortes() {
        ArrayList<Actor>actores=new ArrayList();
        for(ElementoImbd e:elementos){
            ArrayList<Actor>aux=e.obtenerActortes();
            for(Actor a:aux){
                if(!actores.contains(a))
                    actores.add(a);
            }
        }
        return actores;
    }

    @Override
    public int obtenerCantOscars() {
        int cant=0;
        for(ElementoImbd e:elementos){
            cant+=e.obtenerCantOscars();
        }
        return cant;
    }

    @Override
    public double obtenerPuntaje() {
        int cant=0;
        double puntaje=0;
        for(ElementoImbd e:elementos){
            cant++;
            puntaje+=e.obtenerPuntaje();
        }
        return puntaje/cant;
    }

    @Override
    public ArrayList<Pelicula> buscar(Condicion c) {
        ArrayList<Pelicula>peliculas=new ArrayList();
        for(ElementoImbd e:elementos){
            peliculas.addAll(e.buscar(c));
        }
        return peliculas;
    }

    @Override
    public ElementoImbd copia(Condicion c) {
        Saga s=new Saga(titulo);
        for(ElementoImbd e:elementos){
            s.addElemento(e.copia(c));
        }
        return s;
    }
    
}
