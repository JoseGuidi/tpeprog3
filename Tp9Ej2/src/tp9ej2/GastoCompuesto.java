/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej2;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class GastoCompuesto extends Gasto{

    ArrayList<Gasto>gastos;

    public GastoCompuesto(String descripcion) {
        super(descripcion);
        gastos=new ArrayList();
    }
    
    public void addGasto(Gasto g){
        gastos.add(g);
    }
    
    @Override
    public double getMonto() {
        double gasto=0;
        for(Gasto g:gastos){
            gasto+=g.getMonto();
        }
        return gasto;
    }
    
}
