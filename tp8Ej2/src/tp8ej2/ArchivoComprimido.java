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
public class ArchivoComprimido extends Directorio{
    double tazaCompresion;
    
    public ArchivoComprimido(String nombre,double tazaCompresion){
        super(nombre);
    }
    
    @Override
    public double getPeso(){
        return super.getPeso()*tazaCompresion;
    }
    @Override
    public ArrayList<ElementoSa> buscar(Condicion c) {
        ArrayList<ElementoSa> filtro=new ArrayList();
        boolean cumple=false;
        for(ElementoSa e:elementos){
            if(c.cumple(e)){
                cumple=true;
            }
        }
        if(cumple)
            filtro.add(this);
        return filtro;
    }
}
