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
public class Archivo extends ElementoSa{

    double tamaño;
    
    public Archivo(String nombre,double tamaño){
        super(nombre);
        this.tamaño=tamaño;
    }
    
    @Override
    public double getPeso() {
        return tamaño; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<ElementoSa> buscar(Condicion c) {
        ArrayList<ElementoSa> filtro=new ArrayList();
        if(c.cumple(this))
            filtro.add(this);
 
        return filtro;
    }
    
}
