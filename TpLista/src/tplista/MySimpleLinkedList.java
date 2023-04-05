/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tplista;

import java.util.Iterator;

/**
 *
 * @author ilari
 */
public class MySimpleLinkedList<T> {
    private Node<T> first;
    private int size;
	
	public MySimpleLinkedList() {
		this.first = null;
                size=0;
	}
	
        
        
	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null);
		tmp.setNext(this.first);
		this.first = tmp;
                size ++;
	}
	
        
	public T extractFront() {		
		T data=this.first.getInfo();
                Node<T> aux=this.first.getNext();
                first.deleteNext();
                first=aux;
                size --;
		return data;
	}

              
	public boolean isEmpty() {
            return first==null;
	}
	
	public T get(int i) {
            Node<T> node=first;
            for(int j=0;j<=i;j++){
                if(node!=null)
                    node=node.getNext();
                else
                    return null;
            }
            return node.getInfo();
	}
	
	public int size() {
		// TODO
		return size;
	}
	
        public int indexOf(T data){
            Node node=first;
            int i=0;
            while(node!=null){
                if (node.getInfo().equals(data))
                    return i;
                node=node.getNext();
                i++;
                
            }
               return -1;
        }
        
	@Override
	public String toString() {
		// TODO
                if (first!=null)
                    return first.toString();
                return "";
	}
        
        public  Iterator<T> iterator(){
            return new MyIterator<T>(this.first);
        }
}
