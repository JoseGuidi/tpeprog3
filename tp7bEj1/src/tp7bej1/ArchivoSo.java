/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7bej1;

import java.time.LocalDate;

/**
 *
 * @author ilari
 */
public abstract class ArchivoSo {
    String nombre;
    LocalDate fechaCreacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract int getCantElementos();
    
    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }
    
    public String toString(){
        return("Nombre"+this.getNombre()+"fecha creacion"+this.getFechaCreacion()+"-"+"Peso "+this.getPeso());
    }
    
    public abstract int getPeso();
    
}
