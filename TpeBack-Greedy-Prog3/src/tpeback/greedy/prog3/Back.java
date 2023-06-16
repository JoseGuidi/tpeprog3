/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpeback.greedy.prog3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author ilari
 */
public class Back {
    public ArrayList<Arco>construirCaminos(Grafo g){
        ArrayList<Arco>conexiones=new ArrayList();
        Iterator it=g.obtenerVertices();
        ArrayList<Integer>visitados=new ArrayList();
        ArrayList<Arco>mejorCamino=new ArrayList();
        while(it.hasNext()){
        int i=(Integer)it.next();
            visitados.add(i);
            conexiones.add(new Arco(i,i,0));
            back(g,conexiones,mejorCamino,i,visitados);
            visitados.remove(i);
            conexiones.remove(new Arco(i,i,0));
        }
        return null;
    }
   
    public int obtenerTotalArcos(ArrayList<Arco> conexionesAct){
        int dist=0;
        
            for(Arco a:conexionesAct){
                dist+=(Integer)a.getEtiqueta();
            }
        
        return dist;
    }
    
    public boolean recorrioTodo(ArrayList<Integer>visitados,Grafo g){
        Iterator it=g.obtenerVertices();
        boolean todos=true;
        while(it.hasNext()){
            int i=(Integer)it.next();
            if(!visitados.contains(i))
                todos=false;
        }
        return todos;
    }
    
   public void back(Grafo g, ArrayList<Arco>camino,ArrayList<Arco>mejorCamino,int v,ArrayList<Integer>visitados){
       if(recorrioTodo(visitados,g)){
           if((obtenerTotalArcos(camino)<obtenerTotalArcos(mejorCamino))||(mejorCamino.isEmpty()))
              mejorCamino=new ArrayList(camino);
       }
       else{
           ArrayList<Integer>ver=new ArrayList();
           ver=cargarV(ver,g);
           for(Integer act:ver){
               visitados.add(act);
               camino.add(g.obtenerArco(v, act));
               back(g,camino,mejorCamino,act,visitados);
               visitados.remove(act);
               camino.remove(g.obtenerArco(v, act));
           }
       }
   } 
   
   
   
   public ArrayList<Integer> cargarV(ArrayList<Integer> v,Grafo g){
       Iterator it=g.obtenerVertices();
       while(it.hasNext()){
           Integer i=(Integer)it.next();
           v.add(i);
       }
       return v;
   }
}
