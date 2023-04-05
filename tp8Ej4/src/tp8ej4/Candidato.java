/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8ej4;

/**
 *
 * @author ilari
 */
public class Candidato implements Comparable{
    String nombre;
    String agrupacion;
    String partido;

    public String toString(){
        return "Nombre "+this.nombre+"Agrupacion "+this.agrupacion;
    }
    
    public Candidato(String nombre, String agrupacion, String partido) {
        this.nombre = nombre;
        this.agrupacion = agrupacion;
        this.partido = partido;
    }

    public boolean equals(Object o){
        Candidato c=(Candidato)o;
        return c.getNombre().equals(this.getNombre());
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getAgrupacion() {
        return agrupacion;
    }

    public String getPartido() {
        return partido;
    }

    @Override
    public int compareTo(Object o) {
        Candidato cand=(Candidato)o;
        return this.getNombre().compareTo(cand.getNombre());
    }
    
    
    
}
