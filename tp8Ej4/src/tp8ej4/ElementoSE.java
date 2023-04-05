/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8ej4;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public abstract class ElementoSE {
    public abstract ArrayList<Voto> buscar(Condicion c);
    public abstract double porcVotos(Condicion c);
    public abstract int obtenerCantidadVotos();
    public int obtenerCantidadVotosCondicon(Condicion c){
        return this.buscar(c).size();
    }
    public abstract ArrayList<Candidato> obtenerCandidatos(Comparador orden);
}
