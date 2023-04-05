/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ilari
 */
public class GrupoUltimoMomento extends Grupo{
    int cantidadPalabras;
    String categoria;
    
    public GrupoUltimoMomento(String cat,int cant){
        super();
        cantidadPalabras=cant;
        categoria=cat;
    }
    
    public void setCategoria(String cat){
        categoria=cat;
    }
    
    @Override
    public String getCategoria() {
        return categoria;
    }

    @Override
    public ArrayList<String> getPalabrasClave() {
        ArrayList<String>palabras=new ArrayList();
        for(ElementoSn e:elementos){
            ArrayList<String>aux=e.getPalabrasClave();
            for(String p:aux){
                if(!palabras.contains(p))
                    palabras.add(p);
            }
        }
        Collections.sort(palabras);
        ArrayList<String>aux=new ArrayList();
        for(int i=0;i<cantidadPalabras;i++){
            aux.add(palabras.get(i));
        }
        return aux;
    }

    
    
}
