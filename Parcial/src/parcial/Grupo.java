/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public abstract class Grupo extends ElementoSn{
    
    ArrayList<ElementoSn>elementos;

    public Grupo() {
        elementos=new ArrayList();
    }
    
    @Override
    public ArrayList<Noticia> buscar(Condicion c) {
        ArrayList<Noticia>filtro=new ArrayList();
        for(ElementoSn e:elementos){
            filtro.addAll(e.buscar(c));
        }
        return filtro;
    }
    
    public ArrayList<ElementoSn>getElementos(){
        return new ArrayList(elementos);
    }
    
    public void addElemento(ElementoSn e){
        elementos.add(e);
    }
    
}
