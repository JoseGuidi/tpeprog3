/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8ej4;

/**
 *
 * @author ilari
 */
public class CondicionCandidato extends Condicion{
    Candidato c;
    @Override
    public boolean cumple(Voto v){
        return v.getCand().equals(c);
    }

    public CondicionCandidato(Candidato c) {
        this.c = c;
    }
    
    
    
}
