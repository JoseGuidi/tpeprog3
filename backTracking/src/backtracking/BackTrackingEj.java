/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author ilari
 */
public class BackTrackingEj {
    
    private Casilla[][] matriz;
    private int dimension;
    
    public boolean poseeMovimiento(Casilla m){
        return (m.poseeMovimiento());
    }
    
    public int calcularValor(List<Casilla> c){
        int valor=0;
        for(Casilla ca:c){
            valor+=ca.getValor();
        }
        return valor;
    }
    
    public BackTrackingEj(int dimension){
        matriz=new Casilla[dimension][dimension];
        this.dimension=dimension;
    }
    
    public BackTrackingEj(Casilla[][] matriz,int dimension){
        this.matriz=matriz;
        this.dimension=dimension;
    }
    
    public int sumaVector(int[] numeros,int[]sol){
        int sum=0;
        for(int i=0;i<numeros.length;i++){
            sum+=(numeros[i]*sol[i]);
        }
        return sum;
    }
    
    /*public List<int[]> backConjuntos(int[] numeros,int ind,int[] sol,int suma,List soluciones){
        if(sumaVector(numeros,sol)==suma)
            return sol;
        for(int i=ind;i<numeros.length;i++){
            sol[i]=1;
            backConjuntos(numeros,i+1,sol,suma);
            sol[i]=0;
            backConjuntos(numeros,i+1,sol,suma);
        }
        return null;
    }
    
    public List<int[]> problemaSubConjuntos(int[] numeros,int suma){
        List<int[]>subconjuntos=new ArrayList();
        int[] sol=new int[numeros.length];
        for(int i=0;i<sol.length;i++)
            sol[i]=0;
        subconjuntos.add(backConjuntos(numeros,0,sol,suma,new ArrayList()));
        return subconjuntos;
    }*/
    
    public void backConjuntos(int[] numeros, int ind, int[] sol, int suma, Set<int[]> soluciones) {
    if (ind == numeros.length) {
        if (sumaVector(numeros, sol) == suma) {
            soluciones.add(Arrays.copyOf(sol, sol.length)); // Agregar copia del vector sol al resultado
        }
    } else {
        sol[ind] = 0;
        backConjuntos(numeros, ind + 1, sol, suma, soluciones);
        sol[ind] = 1;
        backConjuntos(numeros, ind + 1, sol, suma, soluciones);
    }
    
}

public List<int[]> problemaSubConjuntos(int[] numeros, int suma) {
    Set<int[]> subconjuntos = new HashSet<>();
    int[] sol = new int[numeros.length];
    backConjuntos(numeros, 0, sol, suma, subconjuntos);
    return new ArrayList<>(subconjuntos);
}

public int sumaLista(List<Integer> numeros){
    int sum=0;
    for(Integer i:numeros){
        sum+=i;
    }
    return sum;
}

public void encontrarParticionConjunto(List<Integer> conjunto1, List<Integer> conjunto2, List<List<Integer>> soluciones) {
    int sumaConjunto1 = sumaLista(conjunto1);
    int sumaConjunto2 = sumaLista(conjunto2);
    
    if (sumaConjunto1 == sumaConjunto2) {
        List<Integer> conjuntoOrdenado1 = new ArrayList<>(conjunto1);
        List<Integer> conjuntoOrdenado2 = new ArrayList<>(conjunto2);
        Collections.sort(conjuntoOrdenado1);
        Collections.sort(conjuntoOrdenado2);
        
        if (!soluciones.contains(conjuntoOrdenado1) && !soluciones.contains(conjuntoOrdenado2)) {
            soluciones.add(conjuntoOrdenado1);
            soluciones.add(conjuntoOrdenado2);
        }
    } else if (!conjunto1.isEmpty()) {
        for (Integer elemento : conjunto1) {
            List<Integer> copiaConjunto1 = new ArrayList<>(conjunto1);
            List<Integer> copiaConjunto2 = new ArrayList<>(conjunto2);
            
            copiaConjunto1.remove(elemento);
            copiaConjunto2.add(elemento);
            
            encontrarParticionConjunto(copiaConjunto1, copiaConjunto2, soluciones);
        }
    }
}

public List<List<Integer>> particionConjunto(List<Integer> numeros) {
    List<List<Integer>> soluciones = new ArrayList<>();
    encontrarParticionConjunto(numeros, new ArrayList<>(), soluciones);
    return soluciones;
}




    public List<Casilla> backMatriz(int filaActual,int columnaActual,int filaFin,int columnaFin,List caminoAct,List caminoMenor){
        if((filaActual==filaFin)&&(columnaActual==columnaFin)){
            Casilla casilla=matriz[filaActual][columnaActual];
            caminoAct.add(casilla);
            return caminoAct;
        }
        else{
            Casilla casilla=matriz[filaActual][columnaActual];
            casilla.setVisitada(true);
            caminoAct.add(casilla);
            ArrayList conservarAct=new ArrayList();
            conservarAct.addAll(caminoAct);
            if((casilla.isAbajo()&&(filaActual+1<dimension)&&(!matriz[filaActual+1][columnaActual].isVisitada()))){
                List aux=new ArrayList();
                aux=backMatriz(filaActual+1,columnaActual,filaFin,columnaFin,caminoAct,caminoMenor);
                if((calcularValor(aux)<calcularValor(caminoMenor))||(caminoMenor.isEmpty())){
                    caminoMenor=aux;
                }
                caminoAct=conservarAct;
            }
            if((casilla.isDerecha()&&(columnaActual+1<dimension)&&(!matriz[filaActual][columnaActual+1].isVisitada()))){
                List aux=new ArrayList();
                aux=backMatriz(filaActual,columnaActual+1,filaFin,columnaFin,caminoAct,caminoMenor);
                if((calcularValor(aux)<calcularValor(caminoMenor))||(caminoMenor.isEmpty())){
                    caminoMenor=aux;
                }
                caminoAct=conservarAct;
            }
            if((casilla.isArriba())&&(filaActual-1>=0)&&(!matriz[filaActual-1][columnaActual].isVisitada())){
                List aux=new ArrayList();
                aux=backMatriz(filaActual-1,columnaActual,filaFin,columnaFin,caminoAct,caminoMenor);
                if((calcularValor(aux)<calcularValor(caminoMenor))||(caminoMenor.isEmpty())){
                    caminoMenor=aux;
                }
                caminoAct=conservarAct;
            }
            
            if((casilla.isIzquierda()&&(columnaActual-1>=0)&&(!matriz[filaActual][columnaActual-1].isVisitada()))){
                List aux=new ArrayList();
                aux=backMatriz(filaActual,columnaActual-1,filaFin,columnaFin,caminoAct,caminoMenor);
                if((calcularValor(aux)<calcularValor(caminoMenor))||(caminoMenor.isEmpty())){
                    caminoMenor=aux;
                }
                caminoAct=conservarAct;
            }
            
            casilla.setVisitada(false);
        }
        return caminoMenor;
    }
    
    public List<Casilla> problemaMatriz(int desdeF,int desdeC,int hastaC,int hastaF){
        List<Casilla> caminoMinimo=new ArrayList();
        List<Casilla> caminoActual=new ArrayList();
        caminoMinimo=backMatriz(desdeF,desdeC,hastaF,hastaC,caminoActual,caminoMinimo);
        return caminoMinimo;
    }
}
