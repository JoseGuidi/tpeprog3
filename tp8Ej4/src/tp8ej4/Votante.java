/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8ej4;

/**
 *
 * @author ilari
 */
public class Votante{
    String dni;
    Voto voto;

    public Votante(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public Voto getVoto() {
        return voto;
    }
    
    public void crearVoto(Candidato c){
        this.voto=new Voto(c);
    }
    
    public boolean equals(Object o){
        Votante v=(Votante)o;
        return v.getDni().equals(this.getDni());
    }
    
    public void registrarVoto(Mesa m){
        
            m.registrarVoto(voto, this);
        
    }
    
}
