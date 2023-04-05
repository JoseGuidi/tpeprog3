/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8ej2;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class Link extends ElementoSa{
    ElementoSa ref;
    public static final double PESO=1;

    public Link(String nombre,ElementoSa ref){
        super(nombre);
        this.ref=ref;
    }
    
    public String toString(){
        return super.toString()+"ref"+ref.getNombre();
    }
    
    @Override
     public ArrayList<ElementoSa> buscar(Condicion c) {
        ArrayList<ElementoSa> filtro=new ArrayList();
        if(c.cumple(this))
            filtro.add(this);
        return filtro;
    }
    @Override
    public double getPeso() {
        return PESO; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
