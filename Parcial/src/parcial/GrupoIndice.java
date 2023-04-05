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
public class GrupoIndice extends Grupo{
    int indice;
    static String retorno="sin definir";
    
    public static void setRetorno(String r){
        retorno=r;
    }
    
    public GrupoIndice(int indice) {
        super();
        this.indice = indice;
    }
    
    
    @Override
    public String getCategoria() {
        if(elementos.get(indice)!=null){
            return elementos.get(indice).getCategoria();
        }
        return retorno;
    }

    @Override
    public ArrayList<String> getPalabrasClave() {
        ArrayList<String>pal=new ArrayList();
        for(ElementoSn e:elementos){
            ArrayList<String>aux=e.getPalabrasClave();
            for(String p:aux){
                if(!pal.contains(p)){
                    pal.add(p);
                }
            }
        }
        return pal;
    }

    
    
    
}
