/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicoespecialprog3;

import tpep2nico.ServicioCaminos;

/**
 *
 * @author ilari
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GrafoDirigido grafo=new GrafoDirigido();
        grafo.agregarVertice(1);
        grafo.agregarVertice(9);
        grafo.agregarVertice(10);
        grafo.agregarVertice(3);
        grafo.agregarVertice(8);
        grafo.agregarVertice(5);
        grafo.agregarArco(1, 9, "Arco 1 a 9");
        grafo.agregarArco(1, 8, "Arco 1 a 8");
        grafo.agregarArco(1, 10, "Arco 1 a 10");
        grafo.agregarArco(1, 5, "Arco 1 a 5");
        grafo.agregarArco(1, 3, "Arco 1 a 3");
        grafo.agregarArco(10, 5, "Arco 10 a 5");
        grafo.agregarArco(3, 8, "Arco 3 a 8");
        grafo.agregarArco(5, 8, "Arco 5 a 8");
        grafo.agregarArco(8, 5, "Arco 8 a 5");
        System.out.println(grafo.toString());
        ServicioCaminos s=new ServicioCaminos(grafo,1,8,2);
        System.out.println(s.caminos());
    }
    
}
