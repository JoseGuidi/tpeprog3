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
public class Lote {
    ArrayList<String> Minerales;
    String tipo;
    String nombre;
    int cantHectareas;

    

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCantHectareas(int cantHectareas) {
        this.cantHectareas = cantHectareas;
    }

    public ArrayList<String> getMinerales() {
        ArrayList<String> aux=(ArrayList<String>) this.Minerales.clone();
        return aux;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCantHectareas() {
        return cantHectareas;
    }
    
    public void addMineral(String mineral){
        this.Minerales.add(mineral);
    }
    
    public boolean sePuedeSembrarCereal(Cereal c){
        return((this.getMinerales().containsAll(c.getMinerales())));
    }
    
    public void asignarTipoDeLote(ArrayList<String> minp){
        if (this.getMinerales().containsAll(minp)){
            this.setTipo("Pimario");
        }
        else{
            this.setTipo("Secundario");
        }
    }
    
    public String toString(){
        return("tipo"+this.getTipo());
    }
    
    public Lote(String nombre){
        this.nombre=nombre;
        this.setCantHectareas(1);
        this.setTipo("");
        this.Minerales=new ArrayList<String>();
        this.addMineral("tierra");
    }
}
