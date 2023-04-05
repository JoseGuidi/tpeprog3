/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ej1;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class Pila{
    private ArrayList<Object> pila;
    
    public void push (Object o){
        pila.add(o);
    }
    public Object pop(){
        Object aux= pila.get(pila.size()-1);
        pila.remove(pila.size()-1);
        return aux;
    }
    
    public Object top(){
        return(pila.get(pila.size()-1));
    }
    
    public int size(){
        return(pila.size());
    }
    
    public Pila copy(){
        ArrayList aux= new ArrayList();
        aux.addAll(pila);
        Pila pilaAux=new Pila();
        for(int i=0;i<this.size();i++){
            pilaAux.push(aux.get(i));
        }
        return pilaAux;
    }
    
    public String show(){
        String aux="";
        for(int i=0;i<this.size();i++){
            aux=aux+" "+this.pila.get(i).toString();
        }
        return aux;
    }
    
    public Pila reverse(){
        ArrayList aux= new ArrayList();
        aux.addAll(pila);
        Pila pilaAux=new Pila();
        for(int i=this.size()-1;i>=0;i--){
            pilaAux.push(aux.get(i));
        }
        return pilaAux;
    }
    
    public Pila(){
        pila= new ArrayList<Object>();
    }
}
