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
public class MyIterator<T> implements Iterator<T> {

    private Node<T> cursor;
    
    public MyIterator(Node<T> first){
        cursor=first;
    }
    
    @Override
    public boolean hasNext() {
        return cursor!=null;
    }

    @Override
    public T next() {
        T aux=cursor.getInfo();
        cursor=cursor.getNext();
        return aux;
    }
    
}
