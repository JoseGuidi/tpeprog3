/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpeprog;

/**
 *
 * @author ilari
 */
public class CriterioCantidadAlumnos extends Criterio{

    @Override
    public int compare(Object o1, Object o2) {
        ElementoU e1=(ElementoU)o1;
        ElementoU e2=(ElementoU)o2;
        int aux=e1.obtenerCantidad()-e2.obtenerCantidad();
        if(aux>0)
            aux=1;
        else if(aux<0)
            aux=-1;
        return aux;
    }
    
}
