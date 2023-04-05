/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6ej1;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class Cliente {
    String nombre;
    ArrayList<Item> items;

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Item> getItems() {
        ArrayList<Item> aux=new ArrayList<>();
        aux.addAll(this.items);
        return aux;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void addItem(Item i){
        this.items.add(i);
    }
    
    public boolean tengoAlgoVencido(){
        boolean aux=false;
        for (int i=0;i<this.getItems().size();i++){
            if(this.getItems().get(i).estaVencido()){
                aux=true;
            }
        }
        return aux;
    }
    
    
    public void alquilar(Item i){
        if(i.sePuedeAlquilar()){
            i.alquilar();
            this.addItem(i);
        }
        else{
            System.out.println("Imposible alquilar");
        }
    }
    
    public Cliente(String nombre){
        this.setNombre(nombre);
        this.items=new ArrayList<>();
    }
}
