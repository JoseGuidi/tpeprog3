/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6ej3;

/**
 *
 * @author ilari
 */
public class Barco extends VehiculoOrdenado{
    String nombre;
    double capacidad;

    public String toString(){
        return(this.nombre+"-"+this.getCapacidad());
    }
    
    public String getNombre() {
        return nombre;
    }

    public double getCapacidad() {
        return capacidad;
    }
    
    public void cargarCamion(Camion c){
        System.out.println("Camion cargado"+c);
    }
    
    public boolean esMayor(VehiculoOrdenado v){
        return(this.getCapacidad()>((Barco)v).getCapacidad());
    }
    
    public Barco(String nombre,double capacidad){
        this.nombre=nombre;
        this.capacidad=capacidad;
    }
}
