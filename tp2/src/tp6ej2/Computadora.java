/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ilari
 */
public class Computadora extends ElementoOrdenable{
    String nombre;
    double velocidad;

    public boolean esMayor(ElementoOrdenable e){
       
    }
    
    public String getNombre() {
        return nombre;
    }

    public double getVelocidad() {
        return velocidad;
    }

    
    public Computadora (String nombre,double velocidad){
        this.nombre=nombre;
        this.velocidad=velocidad;
    }
}
