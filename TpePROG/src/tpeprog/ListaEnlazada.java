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
public class ListaEnlazada implements Iterable<Nodo>{
    Criterio orden;
    Nodo cabeza;
    int size;
    
    
    public ListaEnlazada(){
        this(new CriterioOrdenLlegada());
    }
    
    public ListaEnlazada(Criterio c) {
        cabeza=null;
        orden=c;
        size=0;
    }
    
    public int size(){
        return size;
    }
    
    public Nodo obtenerUltimo(){
        Nodo pos=cabeza;
        while(pos.getSig()!=null)
            pos=pos.getSig();
        return pos;
    }
    
    public Object getValor(int i){
        Nodo n=cabeza;
        for(int j=0;j<=i;j++){
            n=n.getSig();
        }
        return n.obtenerValor();
    }
    
    public boolean estaVacia(){
        return cabeza==null;
    }
    
    public String toString(){
        String aux="";
        Nodo n=cabeza;
        while(n!=null){
            aux+=n.toString();
            if(n.getSig()!=null)
                aux+="->";
            n=n.getSig();
        }
        return aux;
        
    }
    
    public void borrarNodo(int i){
        int aux=0;
        boolean inserto=false;
        if(aux==i)
            cabeza=cabeza.getSig();
        Nodo pos=cabeza;
        while((aux<=i)&&(pos!=null)&&(inserto==false)&&(i<=size)){
            if((aux+1)==i){
                if(pos.getSig().getSig()==null){
                    pos.addSig(null);
                }
                else{
                    pos.addSig(pos.getSig().getSig());
                }
                inserto=true;
                size--;
            }
            aux++;
            pos=pos.getSig();
        }
    }
    
    public void cambiarOrden(Criterio c){
        Nodo pos=cabeza;
        Nodo aux;
        Object temp;
        orden=c;
        while(pos!=this.obtenerUltimo()){
            aux=pos.getSig();
            while(aux!=null){
                if(c.compare(pos.obtenerValor(), aux.obtenerValor())>0){
                    temp=pos.obtenerValor();
                    pos.sustituirValor(aux.obtenerValor());
                    aux.sustituirValor(temp);
                }
                aux=aux.getSig();
            }
            pos=pos.getSig();
        }
        
        /*for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(c.compare(pos.obtenerValor(),pos.getSig().obtenerValor())>0){
                    aux=pos;
                    pos=sig;
                    sig=aux;
                }
            }
        }*/
        //nueva lista(orden)
        
        /*Nodo pos=cabeza;
        Nodo ant=null;
        Nodo aux=null;
        while(i<=size){
            if(pos.getSig()!=null)
                aux=pos.getSig();
            else
                cabeza=pos;
            pos.addSig(ant);
            ant=pos;
            pos=aux;
            i++;
        }*/
        
        
    }
    
    public void borrarNodo(Object i){
        
        if(cabeza.obtenerValor().equals(i)){
            cabeza=cabeza.getSig();
        }
        Nodo ant=null;
        Nodo pos=cabeza;
        boolean encontro;
        while(pos!=null){
            encontro=false;
            if(pos.obtenerValor().equals(i)){
                ant.addSig(pos.getSig());
                pos=pos.getSig();
                encontro=true;
                size--;
                
            }
            
            if(!encontro){
                ant=pos;
                pos=pos.getSig();
            }
                
            
        }
        
    }
    
    public int obtenerPosicion(Object c){
        Nodo pos=cabeza;
        int aux=0;
        boolean encontro=false;
        while(aux<=size&&encontro==false&&pos!=null){
            if(pos.obtenerValor().equals(c)){
                encontro=true;
            }
            else{
                aux++;
                pos=pos.getSig();
            }  
        }
        if(encontro)
            return aux;
        return -1;
    }
    
    public void insertarNodo(Object o){
        Nodo n=new Nodo(o);
        boolean inserto=false;
        if(cabeza!=null){
            
            int aux=orden.compare(cabeza.obtenerValor(), n.obtenerValor());
            if(aux>=0){
                n.addSig(cabeza);
                cabeza=n;
                size++;
            }
            else{
               
                    if(cabeza.getSig()==null){
                        cabeza.addSig(n);
                        size++;
                    }
                        
                    else{
                        Nodo pos=cabeza;
                        while(inserto!=true){
                            if(pos.getSig()==null){
                                pos.addSig(n);
                                size++;
                            }
                                
                            
                            aux=orden.compare(pos.getSig().obtenerValor(), n.obtenerValor());
                            if(aux>=0){
                                
                                n.addSig(pos.getSig());
                                pos.addSig(n);
                                inserto=true;
                                size++;
                                
                            }
                            else{
                                pos=pos.getSig();
                                
                            }
                        }
                    }
                }
        }
        else{
            cabeza=n;
            size++;
        }
           
    }

    @Override
    public Iterator<Nodo> iterator() {
        return new IteradorNodo();
    }

    private class IteradorNodo implements Iterator<Nodo>{
        private Nodo pos;
        
        public IteradorNodo(){
            pos = cabeza;
        }

        @Override
        public boolean hasNext() {
            return pos!=null;
        }

        @Override
        public Nodo next() {
            Nodo aux=pos;
            pos=pos.getSig();
            return aux;
        }
    }
}

    
    
    
    

