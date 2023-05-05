/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpgrafos;

/**
 *
 * @author ilari
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import java.util.Map;


public class GrafoDirigido<T> implements Grafo<T> {
        private Map<Integer,ArrayList<Arco<T>>>vertices=new HashMap<>();
	@Override
	public void agregarVertice(int verticeId) {
		vertices.put(verticeId, new ArrayList<>());
	}

	@Override
	public void borrarVertice(int verticeId) {
                 for (ArrayList<Arco<T>> arcos : vertices.values()) {
                    Iterator<Arco<T>> iter = arcos.iterator();
                    while (iter.hasNext()) {
                        Arco a = iter.next();
                        if (a.getVerticeDestino() == verticeId) {
                            iter.remove();
                        }
                    }
                }
		vertices.remove(verticeId);
	}

	@Override
	public void agregarArco(int verticeId1, int verticeId2, T etiqueta) {
                ArrayList<Arco<T>> arcos=vertices.get(verticeId1);
                Arco a=new Arco(verticeId1,verticeId2,etiqueta);
                if(!arcos.contains(a))
                    arcos.add(a);
	}

	@Override
	public void borrarArco(int verticeId1, int verticeId2) {
		vertices.get(verticeId1).remove(new Arco(verticeId1,verticeId2,null));

	}

	@Override
	public boolean contieneVertice(int verticeId) {
		return vertices.containsKey(verticeId);
	}

	@Override
	public boolean existeArco(int verticeId1, int verticeId2) {
		boolean existe=false;
                ArrayList<Arco<T>> arcos=vertices.get(verticeId1);
                Arco a1=new Arco(verticeId1,verticeId2,null);
                for(Arco a:arcos){
                    if(a1.equals(a))
                        existe=true;
                }
                return existe;
	}

	@Override
	public Arco<T> obtenerArco(int verticeId1, int verticeId2) {
		ArrayList<Arco<T>>arcos=vertices.get(verticeId1);
                
                for(Arco a:arcos)
                    if(a.getVerticeDestino()==verticeId2){
                        return a;
                    }     
		return null;
	}

	@Override
	public int cantidadVertices() {
		
		return vertices.size();
	}

	@Override
	public int cantidadArcos() {
		int cantidad=0;
                for(Map.Entry<Integer, ArrayList<Arco<T>>> entry : vertices.entrySet()){
                    cantidad+=entry.getValue().size();
                }
		return cantidad;
	}

	@Override
	public Iterator<Integer> obtenerVertices() {
                ArrayList<Integer>v=new ArrayList();
                for(Map.Entry<Integer, ArrayList<Arco<T>>> entry : vertices.entrySet()){
                    v.add(entry.getKey());
                }
		return v.iterator();
	}

	@Override
	public Iterator<Integer> obtenerAdyacentes(int verticeId) {
		ArrayList<Integer>ady=new ArrayList();
                if(vertices.containsKey(verticeId)){
                    ArrayList<Arco<T>>arcos=vertices.get(verticeId);
                for(Arco a:arcos)
                    ady.add(a.getVerticeDestino());
                }
                return ady.iterator();
	}

	@Override
	public Iterator<Arco<T>> obtenerArcos() {
            ArrayList<Arco<T>>arcos=new ArrayList();
            for(ArrayList<Arco<T>> a:vertices.values()){
                for(Arco<T> ar:a)
                    arcos.add(ar);
            }
            return arcos.iterator();
	}

	@Override
	public Iterator<Arco<T>> obtenerArcos(int verticeId) {
		if(vertices.containsKey(verticeId)){
                    return vertices.get(verticeId).iterator();
                }
		return null;
	}

}
