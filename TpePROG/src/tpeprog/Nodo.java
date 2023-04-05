/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpeprog;

/**
 *
 * @author ilari
 */
public class Nodo{
    Object valor;
    Nodo sig;

    public Nodo(Object valor) {
        this(valor, null);
    }
    
   
    
    public String toString(){
        return valor.toString();
    }
    

    
    public Nodo(Object valor, Nodo sig) {
        this.valor = valor;
        this.sig = sig;
    }
    
    public Object obtenerValor(){
        return valor;
    }
    
    public void sustituirValor(Object valor){
        this.valor=valor;
    }
    
    public Nodo getSig(){
        return sig;
    }
    
    public void addSig(Nodo n){
        if(n==null)
            sig=null;
        else if(!n.equals(this))
        sig=n;
    }
    
    }
