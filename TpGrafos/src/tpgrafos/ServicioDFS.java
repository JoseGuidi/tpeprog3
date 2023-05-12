/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpgrafos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ilari
 */
public class ServicioDFS {
    private Grafo<?> grafo;
    private Map<Integer,TipoColorTiempo>mapavertices;
    int tiempo;
        private void inicializarMapa(Grafo grafo){
            Iterator iter=grafo.obtenerVertices();
            while(iter.hasNext()){
                Integer i=(Integer)iter.next();
                mapavertices.put(i, new TipoColorTiempo());
                mapavertices.get(i).setColor("blanco");
            }
        }
	public ServicioDFS(Grafo<?> grafo) {
		this.grafo = grafo;
                mapavertices=new HashMap<>();
	}
	
        public List<Integer> dfsVisitar(Integer key,ArrayList<Integer> arr){
            
            if(!mapavertices.get(key).igualAColor("negro"))
                mapavertices.get(key).setColor("amarillo");
            tiempo++;
            mapavertices.get(key).setTiempotiempoDescubrimiento(tiempo);
            Iterator it=grafo.obtenerArcos(key);
            while(it.hasNext()){
                Arco a=(Arco)it.next();
                if(mapavertices.get(a.getVerticeDestino()).igualAColor("blanco"))
                    arr.addAll(dfsVisitar(a.getVerticeDestino(),new ArrayList()));
                else if(mapavertices.get(a.getVerticeDestino()).igualAColor("amarillo"))
                    System.out.println("Ciclo");
            }
            if(!mapavertices.get(key).igualAColor("negro"))
                arr.add(key);
            mapavertices.get(key).setColor("negro");
            tiempo++;
            mapavertices.get(key).settiempoFinalizacion(tiempo);
            return arr;
        }
        
	public List<Integer> dfsForest() {
                ArrayList<Integer>vert=new ArrayList();
                inicializarMapa((GrafoDirigido)grafo);
		tiempo=0;
                Iterator iter=grafo.obtenerVertices();
                while(iter.hasNext()){
                    Integer act=(Integer)iter.next();
                    if(mapavertices.get(act).igualAColor("blanco")){
                        vert.addAll(dfsVisitar(act,new ArrayList()));
                    }
                }
                System.out.println(mapavertices);
		return vert;
	}
	
        
       /* public ArrayList<Integer> caminoProf(Integer actual,Integer destino,ArrayList<Integer> camino){
            if(actual==6){
                    System.out.println("");
                }
            if(actual.equals(destino)){
                camino.add(actual);
                
                return camino;
            }
            ArrayList<Integer>temp2=new ArrayList();
            temp2.addAll(camino);
            ArrayList<Integer>primerCamino=camino;         
            Iterator it=grafo.obtenerAdyacentes(actual);
            
            while(it.hasNext()){
                ArrayList<Integer>temp=camino;
                Integer i=(Integer)it.next();
                if(i==6&&actual==2){
                    System.out.println("");
                }
                    ArrayList<Integer> aux=caminoProf(i,destino,camino);
                     if(!aux.isEmpty()){
                        if(!i.equals(destino)){
                            if(!temp.contains(i)){
                                temp.add(i);
                            }
                        }
                        if(!temp.contains(actual))
                            temp.add(actual);
                        if(primerCamino.equals(camino)){
                            primerCamino=new ArrayList();
                            primerCamino.addAll(temp);
                        }
                        else if(primerCamino.size()>temp.size()){
                            primerCamino=new ArrayList();
                            primerCamino.addAll(temp);}
                     }
                
               
            }
            
            return primerCamino;
            
        }
        
        public ArrayList<Integer> camino(Integer v1,Integer v2){
            
            ArrayList<Integer>aux=new ArrayList();
            ArrayList<Integer>anteriorCamino=new ArrayList();
            aux.add(v1);
            inicializarMapa(grafo);
            Iterator iter=grafo.obtenerAdyacentes(v1);
            while(iter.hasNext()){
                ArrayList<Integer>camino;
                inicializarMapa(grafo);
                Integer act=(Integer)iter.next();
                ArrayList<Integer>temp=new ArrayList();
                camino=caminoProf(act,v2,temp);
                camino.addAll(aux);
                Collections.reverse(camino);
                if(((camino.size()<anteriorCamino.size()))||anteriorCamino.isEmpty())
                    anteriorCamino=camino;
                
            }
            return anteriorCamino;
        }*/
public ArrayList<Integer> caminoProf(Integer actual, Integer destino, ArrayList<Integer> camino) {
    
    camino.add(actual);
    if (actual.equals(destino)) {
        return camino;
    }
    ArrayList<Integer> mejorCamino = null;
    Iterator it = grafo.obtenerAdyacentes(actual);
    while (it.hasNext()) {
        Integer i = (Integer) it.next();
        
            ArrayList<Integer> aux = new ArrayList<>(camino);
            ArrayList<Integer> resultado = caminoProf(i, destino, aux);
            if (resultado != null && (mejorCamino == null || resultado.size() < mejorCamino.size())) {
                mejorCamino = resultado;
            
        }
    }
    
    return mejorCamino;
}

public ArrayList<Integer> camino(Integer v1, Integer v2) {
    ArrayList<Integer> camino = null;
    Iterator iter = grafo.obtenerAdyacentes(v1);
    while (iter.hasNext()) {
        Integer act = (Integer) iter.next();
            ArrayList<Integer> aux = new ArrayList<>();
            ArrayList<Integer> resultado = caminoProf(act, v2, aux);
            if (resultado != null && (camino == null || resultado.size() < camino.size())) {
                camino = resultado;
            
        }
    }
    if(camino!=null)
        camino.add(0,v1);
    return camino;
}
}
