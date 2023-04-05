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
public class SagaSponsor extends Saga{
    Pelicula sponsor;

    public SagaSponsor(Pelicula sponsor, String titulo) {
        super(titulo);
        this.sponsor = sponsor;
    }
    
    public ArrayList<Pelicula> buscar(Condicion c) {
        ArrayList<Pelicula>peliculas=super.buscar(c);
        peliculas.add(sponsor);
        return peliculas;
    }
}
