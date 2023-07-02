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
public class main {
    public static void main(String[] args) {
    GrafoDirigido<Integer> grafo = new GrafoDirigido<>();
        
        grafo.agregarVertice(1);
        grafo.agregarVertice(2);
        grafo.agregarVertice(3);
        grafo.agregarVertice(4);
        grafo.agregarVertice(5);
        grafo.agregarVertice(6);
        grafo.agregarArco(1, 2, 7);
        grafo.agregarArco(1, 3, 3);
        grafo.agregarArco(2, 3, 1);
        grafo.agregarArco(2, 4, 6);
        grafo.agregarArco(3, 5, 8);
        grafo.agregarArco(5, 4, 2);
        grafo.agregarArco(4, 3, 3);
        ParcialViejo p=new ParcialViejo();
        System.out.println(p.encontrarDistanciaCiclo(13, grafo));
}
}
