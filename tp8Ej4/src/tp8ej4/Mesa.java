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
public class Mesa extends ElementoSE{
    ArrayList<Votante>padron;
    ArrayList<Voto>votos;
    public Mesa() {
        padron=new ArrayList();
        votos=new ArrayList();
    }
    
    public void addPadron(Votante v){
        padron.add(v);
    }
    
    public void registrarVoto(Voto v, Votante vot){
        if(padron.contains(vot)){
            votos.add(v);
        }
    }

    @Override
    public ArrayList<Voto> buscar(Condicion c) {
        ArrayList<Voto> filtro=new ArrayList();
        for(Voto v:votos){
            if(c.cumple(v)){
                filtro.add(v);
            }
        }
        return filtro;
    }

    @Override
    public double porcVotos(Condicion c) {
        ArrayList<Voto> votoscand=this.buscar(c);
        return (double)(((double)votoscand.size()/(double)votos.size())*100);
    }

    @Override
    public int obtenerCantidadVotos() {
        return votos.size();
    }

    @Override
    public ArrayList<Candidato> obtenerCandidatos(Comparador orden) {
        ArrayList<Candidato>candidatos=new ArrayList();
        for(Voto v:votos){
            if(!candidatos.contains(v.getCand())){
                candidatos.add(v.getCand());
            }
        }
        Collections.sort(candidatos, orden);
        return candidatos;
    }
    
}
