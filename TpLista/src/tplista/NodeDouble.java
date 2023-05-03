/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tplista;

/**
 *
 * @author ilari
 */
public class NodeDouble<T> {
        private T info;
	private NodeDouble<T> next;

	public NodeDouble() {
		this.info = null;
		this.next = null;
	}
	
	public NodeDouble(T info, NodeDouble<T> next) {
		this.setInfo(info);
		this.setNext(next);
	}
	
        public NodeDouble(T info) {
		this.setInfo(info);
		this.setNext(null);
	}
        
        public NodeDouble<T> getNext(){
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
        
	public void setNext(NodeDouble<T> next) {
		this.next = next;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

}
