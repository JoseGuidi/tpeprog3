/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ilari
 */
public class CriterioDoble extends Criterio{

    Criterio c1,c2;
    
    @Override
    public int compare(Habitacion o1, Habitacion o2) {
        int aux=c1.compare(o1, o2);
        if(aux==0)
            aux=c2.compare(o1, o2);
        return aux;
    }

    public CriterioDoble(Criterio c1, Criterio c2) {
        this.c1 = c1;
        this.c2 = c2;
    }
    
    
    
}
