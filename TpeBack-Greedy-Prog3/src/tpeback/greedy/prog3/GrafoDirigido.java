/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpeback.greedy.prog3;

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
        
        //Complejidad O(1) debido a que inserta el vertice en la key y si ya esta en uso lo reemplaza
	public void agregarVertice(int verticeId) {
		vertices.put(verticeId, new ArrayList<>());
                
	}
        //Complejidad O(Vertices*Arcos) = O(n) debido a que revisa en el peor caso todos los vertices y todos los arcos
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

        
        //Complejidad O(n) donde n es la cantidad de arcos en el vertice 1
	@Override
	public void agregarArco(int verticeId1, int verticeId2, T etiqueta) {
                ArrayList<Arco<T>> arcos=vertices.get(verticeId1);
                Arco a=new Arco(verticeId1,verticeId2,etiqueta);
                if(!arcos.contains(a))
                    arcos.add(a);
	}

        //O(n) ya que debe comparar si existe el arco donde N representaria la cantidad de arcos ene el vertice 1
	@Override
	public void borrarArco(int verticeId1, int verticeId2) {
		vertices.get(verticeId1).remove(new Arco(verticeId1,verticeId2,null));

	}

        //O(1) debido a la implementacion de hashmap
	@Override
	public boolean contieneVertice(int verticeId) {
		return vertices.containsKey(verticeId);
	}
        //O(n) donde N representa la cantidad de arcos del vertice
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
        //O(n) recorre todos los arcos del vertice 1 en el peor de los casos para ver que los vertices sean iguales
	@Override
	public Arco<T> obtenerArco(int verticeId1, int verticeId2) {
		ArrayList<Arco<T>>arcos=vertices.get(verticeId1);
                
                for(Arco a:arcos)
                    if(a.getVerticeDestino()==verticeId2){
                        return a;
                    }     
		return null;
	}

        
        //O(1) solo retorna un valor que almacena el hashmap
	@Override
	public int cantidadVertices() {
		return vertices.size();
	}
        
        //O(n) ya que depende de la cantidad de vertices cargados sobre el mapa
	@Override
	public int cantidadArcos() {
		int cantidad=0;
                for(Map.Entry<Integer, ArrayList<Arco<T>>> entry : vertices.entrySet()){
                    cantidad+=entry.getValue().size();
                }
		return cantidad;
	}
        
        //O(n) donde n es el numero de vertices en la lista los recorrera a todos cada vez que se llame
	@Override
	public Iterator<Integer> obtenerVertices() {
                ArrayList<Integer>v=new ArrayList();
                for(Map.Entry<Integer, ArrayList<Arco<T>>> entry : vertices.entrySet()){
                    v.add(entry.getKey());
                }
		return v.iterator();
	}
        
        //O(n) donde N es la cantidad de arcos debe acceder a cada arco de el vertice 
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
        //O(n*m)=O(n) donde N es la cantidad de vertices y M la cantidad de arcos por vertices ya que se debe acceder a TODOS los arcos de todos los verticees
	@Override
	public Iterator<Arco<T>> obtenerArcos() {
            ArrayList<Arco<T>>arcos=new ArrayList();
            for(ArrayList<Arco<T>> a:vertices.values()){
                for(Arco<T> ar:a)
                    arcos.add(ar);
            }
            return arcos.iterator();
	}

        //O(1) ya que solo devuelve el iterador de arcos de la key seleccionada
	@Override
	public Iterator<Arco<T>> obtenerArcos(int verticeId) {
		if(vertices.containsKey(verticeId)){
                    return vertices.get(verticeId).iterator();
                }
		return null;
	}
        //toString generado por chatGPT
        public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, ArrayList<Arco<T>>> entry : vertices.entrySet()) {
            int verticeId = entry.getKey();
            sb.append("Vertice ").append(verticeId).append(": ");
            ArrayList<Arco<T>> arcos = entry.getValue();
            for (Arco<T> arco : arcos) {
                sb.append(arco).append(", ");
            }
            sb.append("\n");
        }
        return sb.toString();
        }
}
