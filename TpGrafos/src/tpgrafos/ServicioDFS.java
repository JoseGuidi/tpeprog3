/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpgrafos;

import java.util.ArrayList;
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
        private void inicializarMapa(GrafoDirigido grafo){
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
	
}
