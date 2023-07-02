/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpgrafos;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ilari
 */
public class ParcialViejo {

    public ParcialViejo() {
    }
    
    public boolean encontrarDistanciaCiclo(int k,GrafoDirigido g){
        return k==dfsModificado(g);
    }
    public int dfsModificado(Grafo g){
        ArrayList<Integer>visitados=new ArrayList();
        ArrayList<Integer>visitadosAct=new ArrayList();
        Iterator it=g.obtenerVertices();
        int distCiclo=0;
        while (it.hasNext()){
            int i=(Integer)it.next();
            if(!visitados.contains(i))
                distCiclo+=dfsVisit(i,g,visitados,visitadosAct);
        }
        return distCiclo;
    }
    
    public int dfsVisit(int v,Grafo g,ArrayList<Integer>visitados,ArrayList<Integer>visitadosAct){
        int result=0;
        Iterator it=g.obtenerAdyacentes(v);
        ArrayList<Integer>aux=new ArrayList(visitadosAct);
        if((visitadosAct.contains(v))&&(!visitados.contains(v))){
            visitadosAct.add(v);
            int ant=0;
            boolean encontro=false;
            for(int ve:visitadosAct){
                if(ve==v)
                    encontro=true;
                if(encontro){
                    if(ant==0)
                        ant=ve;
                    else
                        result+=(Integer)g.obtenerArco(ant, ve).getEtiqueta();
                    ant=ve;
                }
            }
        }
        
        else{
        visitadosAct.add(v);
        while(it.hasNext()){
            int i=(Integer)it.next();
            if(!visitados.contains(i))
            result+=dfsVisit(i,g,visitados,visitadosAct);
        }
        
        }
        visitadosAct=aux;
        visitados.add(v);
        return result;
    }
    
    public ArrayList<Integer> ejercicio2(int k,ArrayList<Integer>camino){
        ArrayList<Integer>s=new ArrayList();
        int pos=0;
        
        while((tieneCandidatos(camino,pos,k))&&(!solucion(camino,pos))){
            pos=seleccionar(camino,k,pos);
            camino.set(pos, 0);
            if(pos<camino.size()){
                s.add(pos);
            }
        }
        if(solucion(camino,pos))
            return s;
        else
            return null;
    }
    
    public boolean tieneCandidatos(ArrayList<Integer>camino,int pos,int k){
        boolean tiene=false;
        int i=pos+1;
        while((i<camino.size())&&(i<=k)){
            if(camino.get(i)==1)
                tiene=true;
            i++;
        }
        return tiene;
    }
    
    public int seleccionar(ArrayList<Integer>camino,int k,int pos){
        int s=pos;
        int i=pos;
        while((i<=k)&&(i<camino.size())){
            if(camino.get(i)==1)
                s=i;
            i++;
        }
        
        return s;
    }
    
    public boolean solucion(ArrayList<Integer>camino,int pos){
        return pos==camino.size()-1;
    }
    
    public int obtenerDistancia(int a, int b){
        //devuelve las distancias entre 2 estaciones, el enunciado dice que suponga que existe
        return 1;
    }
    
    public ArrayList<Integer> estacionesCercanas(ArrayList<Integer>caminos,int pos){
        ArrayList<Integer>e=new ArrayList();
        int i=pos+1;
        while((i<caminos.size())){
                if(caminos.get(i)==1)
                e.add(caminos.get(i));
        }
        return e;
    }
    
    public ArrayList<Integer> ejercicio3(int k, ArrayList<Integer>camino,int pos,ArrayList<Integer>caminoAct,ArrayList<Integer>mejorCamino){
        
        ArrayList<Integer>arregloAux=new ArrayList(caminoAct);
        
        ArrayList<Integer>estaciones=estacionesCercanas(camino,pos);
        int aux=pos;
        if(estaciones.isEmpty()){
            if(((mejorCamino.isEmpty())||(caminoAct.size()<mejorCamino.size()))&&(caminoAct.get(caminoAct.size()-1)==camino.get(camino.size()-1)))
                return caminoAct;
        }
        for(int i:estaciones){
            if(obtenerDistancia(pos,i)<=k)
            {
                pos=i;
                caminoAct.add(i);
                mejorCamino=new ArrayList(ejercicio3(k,camino,pos,caminoAct,mejorCamino));
                pos=aux;
                caminoAct=arregloAux;
            }
        }
        return mejorCamino;
    }
    
}
