/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listavinculadatp;

/**
 *
 * @author Razor
 * @param <T>
 */
public class ListaVinculadaTP <T>{

    private Nodo<T> primero;
    private int size;
    
    public ListaVinculadaTP() {
        this.primero=null;
        size=0;
    }
    
    public ListaVinculadaTP(T data){
        primero=new Nodo(data);
        size=1;
    }
    
    
    
    public void insertFront(T data){
        Nodo nodo=new Nodo(data);
        nodo.addSig(this.primero);
        size ++;
        this.primero=nodo;
    }
    
    public T extractFront(){
        T aux=primero.getData();
        Nodo temp=primero;
        this.primero=primero.getSig();
        temp.borrarSig();
        size--;
        return (aux);
    }
    
    public int getSize(){
        return size;
    }
    
    public String toString(){
        return ((String)primero.toString());
    }
    
    public boolean isEmpty(){
        return (primero==null);
    }
    
    public T getIndex(int i){
        Nodo<T> nodo=primero;
        for(int j=0;j<i;j++){
            nodo=nodo.getSig();
        }
        return nodo.getData();
    }
    
    
    public static void main(String[] args){
        String a="hola";
        String b="Mundo";
        Nodo<String> n=new Nodo<>(a);
    }
}
