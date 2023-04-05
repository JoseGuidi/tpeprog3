/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej2;

import java.time.LocalDate;

/**
 *
 * @author ilari
 */
public abstract class Gasto {
    //Caracteristica car;
    String descripcion;
    LocalDate fecha;
    public abstract double getMonto();

    public Gasto(String descripcion) {
        this.descripcion = descripcion;
        fecha=LocalDate.now();
        
    }
    
    
}
