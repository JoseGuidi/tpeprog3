/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6ej1;

import java.time.LocalDate;



/**
 *
 * @author ilari
 */
public abstract class Item {
    LocalDate fechaVencAlquiler;

    public LocalDate getFechaVencAlquiler() {
        return fechaVencAlquiler;
    }

    public void setFechaVencAlquiler(LocalDate fechaVencAlquiler) {
        this.fechaVencAlquiler = fechaVencAlquiler;
    }
    
    public boolean estaVencido(){
        return(this.getFechaVencAlquiler().isEqual(LocalDate.now())||this.getFechaVencAlquiler().isAfter(LocalDate.now()));
    }
   
    public void alquilar(){
        this.setFechaVencAlquiler(LocalDate.now().plusDays(7));
    }
    
    public abstract boolean sePuedeAlquilar();
    
    public Item(LocalDate fecha){
        this.setFechaVencAlquiler(fecha);
    }
}
