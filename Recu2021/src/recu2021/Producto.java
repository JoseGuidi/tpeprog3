/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recu2021;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class Producto extends ElementoBz{

    ArrayList<String>categorias;
    int peso;
    int precio;

    public Producto(int peso, int precio) {
        this.peso = peso;
        this.precio = precio;
        categorias=new ArrayList();
    }
    
    public void addCategoria(String cat){
        if(!categorias.contains(cat))
            categorias.add(cat);
    }
    
    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public int getPeso() {
        return peso;
    }

    @Override
    public ArrayList<String> getCategoria() {
        return new ArrayList(categorias);
    }

    @Override
    public int getCant() {
        return 1;
    }

    @Override
    public ArrayList<ElementoBz> buscar(Condicion c) {
        ArrayList<ElementoBz> filtro=new ArrayList();
        if(c.cumple(this))
            filtro.add(this);
        return filtro;
    }

    @Override
    public ElementoBz copia() {
        Producto aux=new Producto(peso,precio);
        for(String s:categorias){
            aux.addCategoria(s);
        }
        return aux;
    }
    
}
