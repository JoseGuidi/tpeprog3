/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicoespecialprog3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ilari
 */
public class ServicioCaminos {
    private Grafo<?> grafo;
	private int origen;
	private int destino;
	private int lim;
	
	// Servicio caminos
	
        public ServicioCaminos(Grafo<?> grafo, int origen, int destino, int lim) {
		this.grafo = grafo;
		this.origen = origen;
		this.destino = destino;
		this.lim = lim;
	}
        //O(n*m) = O(n) donde N representa la cantidad de vertices y M la cantidad de arcos 
        private void buscarCamino(Integer act,int lim,ArrayList<Integer> caminoAct,ArrayList camino,ArrayList<Arco> arcos){
            caminoAct.add(act);
            if((act.equals(destino))&&(lim>0)){
                camino.add(caminoAct);
            }
            else if(lim>0){
                Iterator it=grafo.obtenerAdyacentes(act);
                while(it.hasNext()){
                    Integer v=(Integer)it.next();
                    if(!arcos.contains(new Arco(act,v,""))){
                        arcos.add(new Arco(act,v,""));
                        buscarCamino(v,lim-1,caminoAct,camino,arcos);
                    }
                }
            }
        }
        //O(n) n dado numero de vertices
        public List<List<Integer>> caminos() {
            ArrayList<List<Integer>>caminos=new ArrayList();
            Iterator it=grafo.obtenerAdyacentes(origen);
            ArrayList arcos=new ArrayList();
            while(it.hasNext()){
                ArrayList<Integer>camAct=new ArrayList();
                Integer actual=(Integer)it.next();
                camAct.add(origen);
                buscarCamino(actual,lim,camAct,caminos,arcos);
            }
            return caminos;
	}
        
}
