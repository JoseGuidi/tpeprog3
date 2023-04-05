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
public class Actor {
    String nombre;
    String apellido;
    int añonac;
    ArrayList<Pelicula>peliculasEnLasQueParticipo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAñonac() {
        return añonac;
    }

    public void setAñonac(int añonac) {
        this.añonac = añonac;
    }

    
    
    public Actor(String nombre, String apellido, int añonac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.añonac = añonac;
    }
    public boolean equals(Object o){
        Actor a=(Actor)o;
        return (nombre.equalsIgnoreCase(a.getNombre())&&apellido.equals(a.getApellido())&&añonac==a.getAñonac());
    }
    
}
