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
public class PortalNoticias {
    ArrayList<ElementoSn>elementos;
    ArrayList<Categorizador>categorizadores;

    public PortalNoticias() {
        elementos=new ArrayList();
        categorizadores=new ArrayList();
    }
    
    public void categorizarNoticias(Noticia n){
        for(Categorizador c:categorizadores){
            if(c.cumple(n)){
                ArrayList<String>aux=c.getPalabrasClave();
                for(String s:aux){
                    n.addPalabraClave(s);
                }
            }
        }
    }
    
    public void addElemento(ElementoSn e){
        elementos.add(e);
    }
    
    public ArrayList<ElementoSn> getElementos(){
        return new ArrayList(elementos);
    }
}
