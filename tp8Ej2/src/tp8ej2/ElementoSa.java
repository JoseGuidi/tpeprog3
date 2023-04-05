/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8ej2;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public abstract class ElementoSa {
    String nombre;
    LocalDate fecha;

    public ElementoSa(String nombre){
        this.setNombre(nombre);
        this.fecha=LocalDate.now();
    }
    
    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public String toString(){
        return "nombre"+"-"+nombre+"Peso"+"-"+this.getPeso();
    }
    
    public abstract double getPeso();
    
    public abstract ArrayList<ElementoSa> buscar(Condicion c);
    
}
