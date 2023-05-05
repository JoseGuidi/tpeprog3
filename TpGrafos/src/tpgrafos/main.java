/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpgrafos;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ilari
 */
public class main {
    public static void main(String[] args) {
    GrafoDirigido<String> grafo = new GrafoDirigido<>();

    // Agregar vertices al grafo
    grafo.agregarVertice(1);
    grafo.agregarVertice(2);
    grafo.agregarVertice(3);
    grafo.agregarVertice(4);
    grafo.agregarVertice(5);
    grafo.agregarVertice(6);
    // Agregar arcos al grafo
    grafo.agregarArco(1, 2, "Arco 1-2");
    grafo.agregarArco(1, 3, "Arco 1-3");
    grafo.agregarArco(2, 3, "Arco 2-3");
    grafo.agregarArco(3, 1, "Arco 3-1");
    grafo.agregarArco(1, 4, "Arco 1-4");
    grafo.agregarArco(3, 4, "Arco 3-4");
    grafo.agregarArco(4, 5, "Arco 4-5");
    

    // Obtener arco
    /*Arco<String> arco = grafo.obtenerArco(2, 3);
    System.out.println("Arco etiquetado: " + arco.getEtiqueta());

    // Iterar los vértices del grafo
    Iterator<Integer> vertices = grafo.obtenerVertices();
    while (vertices.hasNext()) {
        int verticeId = vertices.next();
        System.out.println("Vértice " + verticeId);
    }

    // Iterar los adyacentes a un vértice específico
    Iterator<Integer> adyacentes = grafo.obtenerAdyacentes(1);
    while (adyacentes.hasNext()) {
        int adyacenteId = adyacentes.next();
        System.out.println("Adyacente a 1: " + adyacenteId);
    }

    
    System.out.println("Cantidad de vértices: " + grafo.cantidadVertices());
    System.out.println("Cantidad de arcos: " + grafo.cantidadArcos());
    System.out.println("Contiene vértice 2: " + grafo.contieneVertice(2));
    System.out.println("Contiene vértice 4: " + grafo.contieneVertice(4));
    System.out.println("Existe arco de 1 a 2: " + grafo.existeArco(1, 2));
    System.out.println("Existe arco de 2 a 1: " + grafo.existeArco(2, 1));
    System.out.println("Existe arco de 1 a 3: " + grafo.existeArco(1, 3));
    System.out.println("Arco de 2 a 3: " + grafo.obtenerArco(2, 3));
    System.out.println("Arco de 3 a 1: " + grafo.obtenerArco(3, 1));
    System.out.println("Arco de 1 a 3: " + grafo.obtenerArco(1, 3));
    grafo.borrarArco(2, 3);
    System.out.println("Cantidad de arcos después de borrar (2,3): " + grafo.cantidadArcos()); 
    */
    // Iterar todos los arcos del grafo
    Iterator<Arco<String>> arcos = grafo.obtenerArcos();
    while (arcos.hasNext()) {
        Arco<String> a = arcos.next();
        System.out.println("Arco entre " + a.getVerticeOrigen() + " y " + a.getVerticeDestino());
    }
    /*ServicioDFS servicio = new ServicioDFS(grafo);
    List<Integer> dfs = servicio.dfsForest();
    System.out.println("Recorrido DFS: " + dfs);*/
    ServicioBFS servicio2 = new ServicioBFS(grafo);
    List<Integer> bfs = servicio2.bfsForest();
    System.out.println(bfs);
    
}
}
