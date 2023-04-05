/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpeprog;

import java.util.Iterator;

/**
 *
 * @author ilari
 */
public class Grupo extends ElementoU{
    ListaEnlazada elementos;

    

    public String toString(){
        return nombre+"("+elementos.toString()+")";
    }
    
    public Grupo(String nombre){
        super(nombre);
        elementos=new ListaEnlazada();
    }
    
    public Grupo(Criterio c,String nombre){
        super(nombre);
        elementos=new ListaEnlazada(c);
    }
    
    public void addElemento(ElementoU e){
        elementos.insertarNodo(e);
    }
    
    public String mostrarOrden(){
        String aux=nombre;
        aux+=" ";
        for(Nodo n:elementos){
            ElementoU e=(ElementoU)n.obtenerValor();
            aux+=e.getNombre();
        }
        return aux;
    }
    
    @Override
    public int obtenerCantidad() {
        Iterator<Nodo> it=elementos.iterator();
        int cant=0;
        while(it.hasNext()){
            ElementoU e=(ElementoU)(it.next()).obtenerValor();
            cant+=e.obtenerCantidad();
        }
        return cant;
    }
}
