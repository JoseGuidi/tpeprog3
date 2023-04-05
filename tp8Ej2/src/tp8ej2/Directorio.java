/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8ej2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ilari
 */
public class Directorio extends ElementoSa{

    ArrayList<ElementoSa> elementos=new ArrayList();
    
    
    public Directorio(String nombre){
        super(nombre);
    }
    
    public void addElemento(ElementoSa e){
        elementos.add(e);
    }
    
    public String toString(){
        return super.toString()+elementos.toString();
    }
    
    @Override
    public double getPeso() {
        double aux=0;
        for(ElementoSa e:elementos){
            aux+=e.getPeso();
        }
        return aux;
    }

    @Override
    public ArrayList<ElementoSa> buscar(Condicion c) {
        ArrayList<ElementoSa> filtro=new ArrayList();
        for(ElementoSa e:elementos){
                filtro.addAll(e.buscar(c));
                
            }
        if(!filtro.isEmpty())
                    filtro.add(this);
   
        return filtro;
    }
    
   public ArrayList<ElementoSa> buscar(Condicion c,Comparador c1) {
       ArrayList<ElementoSa>filtro=new ArrayList();
       filtro.addAll(this.buscar(c));
       Collections.sort(filtro,c1);
       return filtro;
   }
    
}
