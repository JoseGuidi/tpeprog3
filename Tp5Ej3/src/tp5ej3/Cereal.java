/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ej3;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public abstract class Cereal {
    ArrayList<String> minerales;
    String nombre; 
    
    public abstract boolean comprobarNombre(String nombre);
    
    public ArrayList<String> getMinerales(){
        ArrayList<String> aux=(ArrayList<String>) this.minerales.clone();
        return aux;
    }
    
    public void addMinerales(String mineral){
        this.minerales.add(nombre);
    }
    
    public void setNombre(String nombre){
        if(comprobarNombre(nombre)){
            this.nombre=nombre;
        }
        else{
            this.nombre="";
        }
    }
    
    
    public String toString(){
        return (this.nombre);
    }
    
    public boolean sePuedePlantarEnLote(Lote l){
        return(l.getMinerales().containsAll(this.getMinerales()));
    }
    
    public Cereal(String nombre){
        this.setNombre(nombre);
        this.minerales=new ArrayList<String>();
        minerales.add("tierra");
    }
    
}
