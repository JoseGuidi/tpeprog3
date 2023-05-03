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

<<<<<<< HEAD
    public MySimpleLinkedList construirNuevaListaDes(MySimpleLinkedList a,MySimpleLinkedList b){
        MySimpleLinkedList aux=new MySimpleLinkedList();
        boolean finish=false;
        int j=0;
        while(!finish){
            int var1=(int)a.get(j);
            for(int i=j+1;i<a.size();i++){
                if(var1<(int)a.get(i)){
                    var1=(int)a.get(i);
                }
            }
        }
    }
    
=======
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
>>>>>>> 25832d2c29f7c64a2c9b1d4b397e029b214625f9
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
}
