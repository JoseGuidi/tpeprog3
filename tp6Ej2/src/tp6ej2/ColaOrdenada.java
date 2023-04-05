/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6ej2;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class ColaOrdenada {
    ArrayList<ElementoOrdenable> elementos;
    
    public String toString(){
        return(elementos.toString());
    }
    
    public void agregar(ElementoOrdenable e){
  
        boolean encontro=false;
        if(elementos.size()>0){
            for(int i=0;i<elementos.size();i++){
                if((elementos.get(i).esMayor(e))&&(encontro!=true)){
                    encontro=true;
                    elementos.add(i, e);
                }
            }
        }
        if(encontro!=true){
            elementos.add(e);
        }
    }
    
    public ElementoOrdenable siguiente(){
        ElementoOrdenable aux=elementos.get(0);
        elementos.remove(0);
        return aux;
    }
    
    public boolean isVacio(){
        return(elementos.isEmpty());
    }
    
    public ColaOrdenada(){
        this.elementos=new ArrayList<>();
    }
}
