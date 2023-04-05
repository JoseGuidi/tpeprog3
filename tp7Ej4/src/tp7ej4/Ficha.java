/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7ej4;

/**
 *
 * @author ilari
 */
public class Ficha {
    String nombre;
    int golpes;
    int espacio;
    double poder;

    public String getNombre() {
        return nombre;
    }

    public int getGolpes() {
        return golpes;
    }

    public int getEspacio() {
        return espacio;
    }

    public double getPoder() {
        return poder;
    }
    
    public boolean poderMayor(int poder){
        return this.getPoder()>poder;
    }
    
    public boolean espacioMayor(int espacio){
        return this.getEspacio()>espacio;
    }
    
    public String toString(){
        return (this.getNombre()+"-"+this.getGolpes()+"-"+this.getEspacio()+"-"+this.getPoder());
    }
    
    public boolean fortalezaMayor(int fortaleza){
        return this.golpes>fortaleza;
    }
    
    public double obtenerDifFicha(){
        return (golpes/poder);
    }
    
    public Ficha(String nombre,int golpes,int espacio,double poder){
        this.nombre=nombre;
        this.espacio=espacio;
        this.golpes=golpes;
        this.poder=poder;
    }
    
}
