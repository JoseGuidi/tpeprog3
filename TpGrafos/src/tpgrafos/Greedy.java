/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpgrafos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author ilari
 */
public class Greedy {
    public ArrayList<NodoDijkstra> caminos(Grafo g,int origen){
        ArrayList<NodoDijkstra> solucion=new ArrayList();
        ArrayList<Integer> vConsiderados=new ArrayList();
        ArrayList<Integer> vertices=new ArrayList();
        Iterator it=g.obtenerVertices();
        
        while(it.hasNext()){
            int i=(Integer)it.next();
            vertices.add(i);
            solucion.add(new NodoDijkstra(i,Integer.MAX_VALUE,Integer.MAX_VALUE));
        }
        solucion.get(obtenerIndice(origen,solucion)).setDistancia(0);
        while(!vConsiderados.containsAll(vertices)){
            int u=seleccionarVertice(vConsiderados,vertices);
            vConsiderados.add(u);
            int indice=obtenerIndice(u,solucion);
            ArrayList<Integer> ady=adyacentesNoVisitados(g,u,vConsiderados);
            for(Integer i:ady){
                int posi=obtenerIndice(i,solucion);
                int dist=(Integer)g.obtenerArco(u, i).getEtiqueta();
                if((solucion.get(indice).getDistancia()+dist)<solucion.get(posi).getDistancia()){
                    solucion.get(posi).setDistancia(solucion.get(indice).getDistancia()+dist);
                    solucion.get(posi).setPadre(indice);
                }
            }
        }
        return solucion;
    }
    
    public ArrayList<Integer> adyacentesNoVisitados(Grafo g,int v,ArrayList<Integer> vConsiderados){
        ArrayList<Integer> ady=new ArrayList();
        Iterator it=g.obtenerAdyacentes(v);
        while(it.hasNext()){
            int i=(Integer)it.next();
            if(!vConsiderados.contains(i))
                ady.add(i);
        }
        return ady;
    }
    
    public int seleccionarVertice(ArrayList<Integer> vConsiderados,ArrayList<Integer> vertices){
        int v=-1;
        for(int i:vertices){
            if((v==-1)||(i<v)){
                if(!vConsiderados.contains(i))
                    v=i;
            }
        }
        return v;
    }
    
    public int obtenerIndice(int v,ArrayList<NodoDijkstra> a){
        int pos=0;
        for(NodoDijkstra n:a){
            if(n.getValor()==v)
                return pos;
            pos++;
        }
        return Integer.MAX_VALUE;
    }
    

    
public int problemaViajero(Grafo g, int ciudad) {
    ArrayList<Integer> visitados = new ArrayList<>();
    int dist = 0;
    ArrayList<Integer> vertices = cargar(g);
    int aux = ciudad;

    while ((!solucion(visitados, vertices)) && (!vertices.isEmpty())) {
        ArrayList<Integer> ady = obtenerAdy(g, aux, visitados);
        int v = seleccion(ady, visitados);
        dist += (Integer) g.obtenerArco(aux, v).getEtiqueta();
        aux = v;
        visitados.add(v);
    }
    visitados.add(ciudad);
    dist+=(Integer)g.obtenerArco(visitados.get(visitados.size()-1), ciudad).getEtiqueta();
    return dist;
}

public int seleccion(ArrayList<Integer> ady, ArrayList<Integer> visitados) {
    int menor = -1;
    for (int i : ady) {
        if (menor == -1 || (i < menor) && (!visitados.contains(i))) {
            menor = i;
        }
    }
    return menor;
}

public boolean solucion(ArrayList<Integer> visitados, ArrayList<Integer> vertices) {
    return visitados.containsAll(vertices);
}

public ArrayList<Integer> cargar(Grafo g) {
    ArrayList<Integer> vertices = new ArrayList<>();
    Iterator it = g.obtenerVertices();
    while (it.hasNext()) {
        vertices.add((Integer) it.next());
    }
    return vertices;
}

public ArrayList<Integer> obtenerAdy(Grafo g, int v, ArrayList<Integer> visitados) {
    Iterator it = g.obtenerAdyacentes(v);
    ArrayList<Integer> ady = new ArrayList<>();
    while (it.hasNext()) {
        int i = (Integer) it.next();
        if (!visitados.contains(i)) {
            ady.add(i);
        }
    }
    return ady;
}

public ArrayList<Integer> leonesAtrapados(int[]arreglo,int k){
    
    ArrayList<Integer>leonescazados=new ArrayList(); //0 leon
    ArrayList<Integer>cazadoreslistos=new ArrayList(); //1 cazador
    ArrayList<TipoCazador>cazadorestotales=new ArrayList(); //cada cazador tiene que tener una posicion y un ArrayList con los leones cerca
    for(int i=0;i<arreglo.length;i++){
        if(arreglo[i]==1){
           ArrayList<Integer>leones=buscarLeon(i,arreglo,k);
           cazadorestotales.add(new TipoCazador(i,leones));
        }
    }
    while(!solucioncazador(cazadorestotales,cazadoreslistos)){
        TipoCazador c=seleccionar(cazadorestotales,cazadoreslistos);
        boolean cazo=false;
        int i=0;
        while((cazo==false)||(i==c.getPosleones().size()-1)){
            cazo=factible(c.getPosleones().get(i),leonescazados);
            if(cazo){
                leonescazados.add(c.getPosleones().get(i));
            }
            i++;
        }
        cazadoreslistos.add(c.getPoscazador());
    }
    return leonescazados;
}

public boolean solucioncazador(ArrayList<TipoCazador>cazadorestotales,ArrayList<Integer>cazadores){
    
    return transformartipos(cazadorestotales).containsAll(cazadores);
}

public ArrayList<Integer> transformartipos(ArrayList<TipoCazador>t){
    ArrayList<Integer>c=new ArrayList();
    for(TipoCazador te:t){
        c.add(te.getPoscazador());
        }
    return c;
}

public boolean factible(int leon,ArrayList<Integer>leones){
    return !leones.contains(leon);
}

public TipoCazador seleccionar(ArrayList<TipoCazador>cazadorestotales,ArrayList<Integer>cazadoreslistos){
    TipoCazador menor=null;
    for(TipoCazador t:cazadorestotales){
        if((menor==null)||((t.getPosleones().size()<menor.getPosleones().size())&&(!cazadoreslistos.contains(t.getPoscazador()))))
            menor=t;
    }
    return menor;
}



public ArrayList<Integer> buscarLeon(int i,int[]arreglo,int k){
    ArrayList<Integer>leones=new ArrayList();
    int min=i-k;
    int max=i+k;
    if(min<0)
        min=0;
    if(max>arreglo.length-1)
        max=arreglo.length-1;
    for(int j=min;j<=max;j++){
        leones.add(j);
    }
    return leones;
}

}
    
    
