/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej4;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class SeguroTemporal extends Seguro{

    LocalDate fechaInic;
    LocalDate fechaFin;
    Seguro seguro;

    public SeguroTemporal(LocalDate fechaFin, Seguro seguro) {
        this.fechaFin = fechaFin;
        this.seguro = seguro;
        this.fechaInic=LocalDate.now();
    }
    
    
    
    @Override
    public String getDni() {
        return seguro.getDni();
    }

    @Override
    public String getPoliza() {
        return seguro.getPoliza();
    }

    @Override
    public double getMonto() {
        LocalDate hoy=LocalDate.now();
        if(hoy.isBefore(fechaFin)&&hoy.isAfter(fechaInic)){
            return seguro.getMonto();
        }
        return 0;
    }

    @Override
    public ArrayList<Seguro> buscar(Condicion c) {
        ArrayList<Seguro>aux=new ArrayList();
        LocalDate hoy=LocalDate.now();
        if(hoy.isBefore(fechaFin)&&hoy.isAfter(fechaInic)){
            aux.addAll(seguro.buscar(c));
        }
        return aux;
    }

    @Override
    public String getDescripcion() {
        return seguro.getDescripcion();
                
    }

   
    
}
