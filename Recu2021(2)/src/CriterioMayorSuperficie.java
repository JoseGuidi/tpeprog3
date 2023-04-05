/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ilari
 */
public class CriterioMayorSuperficie extends Criterio{

    @Override
    public int compare(Habitacion o1, Habitacion o2) {
        int aux=o1.obtenerMetros()-o2.obtenerMetros();
        if(aux<0)
            return -1;
        else if(aux>0)
            return 1;
        else 
            return aux;
    }
    
}
