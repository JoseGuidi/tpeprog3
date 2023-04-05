/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej3;

/**
 *
 * @author ilari
 */
public abstract class Recurso {
    String nombre;
    public abstract boolean estaDisponible();

    public String getNombre() {
        return nombre;
    }

    
    
    public boolean equals(Object o){
        Recurso aux=(Recurso)o;
        return (this.getNombre().equals(aux.getNombre()));
    }
    
    public Recurso(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
