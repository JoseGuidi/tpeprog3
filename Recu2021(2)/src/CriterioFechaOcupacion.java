/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ilari
 */
public class CriterioFechaOcupacion extends Criterio{

    @Override
    public int compare(Habitacion o1, Habitacion o2) {
        int aux;
        if(o1.getFechaOcupacion().isBefore(o2.getFechaOcupacion()))
            aux=-1;
        else if(o1.getFechaOcupacion().isAfter(o2.getFechaOcupacion()))
            aux=1;
        else
            aux=0;
        return aux;
    }
    
}
