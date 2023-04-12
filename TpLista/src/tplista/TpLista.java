/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tplista;

import java.util.Iterator;

/**
 *
 * @author ilari
 */
public class TpLista {

  public MySimpleLinkedList crearListaComunOrdenada(MySimpleLinkedList a,MySimpleLinkedList b){
      MySimpleLinkedList lista=new MySimpleLinkedList();
      MyIterator<Integer>iter1=a.iterator();
      MyIterator<Integer> iter2=b.iterator();
      while(iter1.hasNext()&&iter2.hasNext()){
          if(iter1.get()<iter2.get()){
              iter1.next();
          }
          else if(iter2.get()<iter1.get()){
              iter2.next();
          }
          if(iter1.get().equals(iter2.get())){
              lista.insertFront(iter2.get());
          }
      }
      return lista;
      
  }
  
  public MySimpleLinkedList crearListaNoComunOrdenada(MySimpleLinkedList a,MySimpleLinkedList b){
      MySimpleLinkedList lista=new MySimpleLinkedList();
      MyIterator<Integer>iter1=a.iterator();
      MyIterator<Integer> iter2=b.iterator();
      while(iter1.hasNext()&&iter2.hasNext()){
          if(iter1.get()<iter2.get()){
              iter1.next();
          }
          else if(iter2.get()<iter1.get()){
              iter2.next();
          }
          if(iter1.get().equals(iter2.get())){
              lista.insertFront(iter2.get());
          }
      }
      return lista;
      
  }
   
  public MySimpleLinkedList crearListaNoComunDesOrd(MySimpleLinkedList a,MySimpleLinkedList b){
      MySimpleLinkedList lista=new MySimpleLinkedList();
      MyIterator iter1=a.iterator();
      
      
      while (iter1.hasNext()){
          if(!b.buscar((int)iter1.get())){
              lista.insertFront(iter1.get());
          }
          iter1.next();
      }
      
      return lista;
     
  }
  
  public MySimpleLinkedList crearListaComunDesOrd(MySimpleLinkedList a,MySimpleLinkedList b){
      MySimpleLinkedList lista=new MySimpleLinkedList();
      MyIterator iter1=a.iterator();
      
      
      while (iter1.hasNext()){
          if(b.buscar((int)iter1.get())){
              lista.insertFront(iter1.get());
          }
          iter1.next();
      }
      
      return lista;
     
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a="hello";
        String b="world";
        Pila<String> pila=new Pila();
        pila.push(a);
        pila.push(b);
        System.out.println(pila);
        pila.reverse();
        System.out.println(pila);
    }
    
}
