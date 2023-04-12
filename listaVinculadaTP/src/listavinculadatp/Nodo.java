/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listavinculadatp;

/**
 *
 * @author Razor
 */
public class Nodo <T>{
    
    private T data;
    private Nodo sig;

    public Nodo<T> getSig(){
        return this.sig;
    }
    
    public Nodo() {
        this.data=null;
        this.sig=null;
    }
    public Nodo(T data){
        this.data=data;
        sig=null;
    }
    
    public void addSig(Nodo<T> nodo){
        this.sig=nodo;
        
    }
    
    public String toString(){
        if(this.sig!=null){
            return (this.getData()+sig.toString());
        }
        else
            return ((String)this.getData());
    }
    
    public void borrarSig(){
        this.sig=null;
    }
    
    public T getData(){
        return this.data;
    }
}
