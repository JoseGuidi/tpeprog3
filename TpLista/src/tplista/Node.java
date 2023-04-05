/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tplista;

/**
 *
 * @author ilari
 */
public class Node<T> {
        private T info;
	private Node<T> next;

	public Node() {
		this.info = null;
		this.next = null;
	}
	
	public Node(T info, Node<T> next) {
		this.setInfo(info);
		this.setNext(next);
	}
	
        public Node(T info) {
		this.setInfo(info);
		this.setNext(null);
	}
        
        public Node<T> getNext(){
            return this.next;
        }
        
        public void deleteNext(){
            this.next=null;
        }

        public String toString(){
            if(this.getNext()!=null)
                return this.info.toString()+this.next.toString();
            else
                return this.info.toString();
        }
        
	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

}
