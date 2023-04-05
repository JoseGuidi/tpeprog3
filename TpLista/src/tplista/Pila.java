/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tplista;

/**
 *
 * @author ilari
 */
public class Pila<T> {
    MySimpleLinkedList<T> stack;
    
    public Pila(){
        stack=new MySimpleLinkedList<T>();
    }
    
    public void push(T data){
        stack.insertFront(data);
    }
    
    public T pop(){
        return stack.extractFront();
    }
    
    public T top(){
        return stack.get(0);
    }
    
    public String toString(){
        return stack.toString();
    }
    
    public void reverse(){
        MySimpleLinkedList<T>aux=new MySimpleLinkedList();
        while(!stack.isEmpty()){
            aux.insertFront(stack.extractFront());
        }
        stack=aux;
    }
    
}
