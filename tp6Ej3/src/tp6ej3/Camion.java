/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6ej3;

import java.time.LocalDate;

/**
 *
 * @author ilari
 */
public class Camion extends VehiculoOrdenado{
    String nombre;
    LocalDate fecha;

    public String getNombre() {
        return nombre;
    }

    public String toString(){
        return(this.nombre+"-"+this.getFecha());
    }
    
    public LocalDate getFecha() {
        return fecha;
    }
    
    public boolean esMayor(VehiculoOrdenado v){
        return(this.getFecha().isBefore(((Camion)v).getFecha()));
    }
    
    public Camion(String nombre,LocalDate fecha){
        this.nombre=nombre;
        this.fecha=fecha;
    }
    
}
