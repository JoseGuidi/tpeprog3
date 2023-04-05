/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8ej4;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ilari
 */
public class Compuesto extends ElementoSE {
    ArrayList<ElementoSE> elementos;

    public Compuesto() {
        elementos=new ArrayList();
    }
    
    public void addElemento(ElementoSE e){
        elementos.add(e);
    }

    @Override
    public ArrayList<Voto> buscar(Condicion c) {
        ArrayList<Voto> filtro=new ArrayList();
        for(ElementoSE e:elementos){
            filtro.addAll(e.buscar(c));
        }
        return filtro;
    }

    @Override
    public double porcVotos(Condicion c) {
      return (double)((double)this.obtenerCantidadVotosCondicon(c)/(double)this.obtenerCantidadVotos());
    }

    @Override
    public int obtenerCantidadVotos() {
        int filtro=0;
        for(ElementoSE e:elementos){
            filtro+=(e.buscar(new CondicionTRUE())).size();
        }
        return filtro;
    }

    @Override
    public ArrayList<Candidato> obtenerCandidatos(Comparador orden) {
        ArrayList<Candidato>candidatos=new ArrayList();
        for(ElementoSE e:elementos){
            candidatos.addAll(e.obtenerCandidatos(orden));
        }
        Collections.sort(candidatos, orden);
        return candidatos;
    }

 
  
    
}
