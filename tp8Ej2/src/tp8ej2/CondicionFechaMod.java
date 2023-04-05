/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8ej2;

import java.time.LocalDate;

/**
 *
 * @author ilari
 */
public class CondicionFechaMod extends Condicion{
    LocalDate fecha;

    @Override
    public boolean cumple(ElementoSa e) {
        return e.getFecha().isAfter(fecha);
    }

    public CondicionFechaMod(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    
}
