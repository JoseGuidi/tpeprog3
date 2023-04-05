/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8ej4;

import java.time.LocalDate;

/**
 *
 * @author ilari
 */
public class Voto {
    LocalDate hora;
    Candidato cand;

    public Voto(Candidato cand) {
        this.hora = LocalDate.now();
        this.cand = cand;
    }

    public String toString(){
        return "Hora "+this.getHora()+"Candidato "+this.cand;
    }
    
    public LocalDate getHora() {
        return hora;
    }

    public Candidato getCand() {
        return cand;
    }
    
    
}
