/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpgrafos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ilari
 */
public class BackTracking {
    
    public List<Integer> backtrackingCamino(Integer act,List solucion,Integer salida,Grafo g){
        if(act.equals(salida)){
            return solucion;
        }
        else{
            Iterator it=g.obtenerAdyacentes(act);
            while (it.hasNext()){
                Integer i=(Integer)it.next();
                List<Integer> aux=new ArrayList();
                aux.addAll(solucion);
                aux.add(i);
                aux=backtrackingCamino(i,aux,salida,g);
                if(aux.size()>solucion.size())
                    solucion=aux;
            }
        }
        return solucion;
    }
    
    public List<Integer> encontrar_camino_maximo(Grafo g, Integer entrada, Integer salida){
        List<Integer> lista=new ArrayList();
        lista.add(entrada);
        lista=backtrackingCamino(entrada,lista,salida,g);
        return lista;
    }
            
}
