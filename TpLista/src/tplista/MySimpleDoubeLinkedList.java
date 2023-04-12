/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tplista;

/**
 *
 * @author Razor
 */
public class MySimpleDoubeLinkedList<T> {
    private NodeDouble<T> first;
    private int size;
	
	public MySimpleDoubeLinkedList() {
		this.first = null;
                size=0;
	}
	
        
        
	public void insertFront(T info) {
		NodeDouble<T> tmp = new NodeDouble<T>(info);
		tmp.setNext(this.first);
                first.setPrev(tmp);
		this.first = tmp;
                size ++;
	}
	
        
	public T extractFront() {		
		T data=this.first.getInfo();
                NodeDouble<T> aux=this.first.getNext();
                aux.deletePrev();
                first.deleteNext();
                first=aux;
                size --;
		return data;
	}

              
	public boolean isEmpty() {
            return first==null;
	}
	
	public T get(int i) {
            NodeDouble<T> node=first;
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
            NodeDouble node=first;
            int i=0;
            while(node!=null){
                if (node.getInfo().equals(data))
                    return i;
                node=node.getNext();
                i++;
                
            }
               return -1;
        }
        
        public boolean buscar(int i){
            NodeDouble nodo=first;
            while(nodo!=null){
                if((int)nodo.getInfo()==i){
                    return true;
                }
            }
            return false;
        }
        
	@Override
	public String toString() {
		// TODO
                if (first!=null)
                    return first.toString();
                return "";
	}
}
