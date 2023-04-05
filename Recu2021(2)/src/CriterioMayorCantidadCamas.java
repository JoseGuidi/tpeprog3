/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ilari
 */
public class CriterioMayorCantidadCamas extends Criterio{

    @Override
    public int compare(Habitacion o1, Habitacion o2) {
        int aux=o1.getCantidadCamas()-o2.getCantidadCamas();
        if(aux<0)
            return -1;
        else if(aux>0)
            return 1;
        else return aux;
    }
    
}
