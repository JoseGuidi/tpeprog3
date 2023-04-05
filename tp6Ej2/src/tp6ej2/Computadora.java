/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6ej2;

/**
 *
 * @author ilari
 */
public class Computadora extends ElementoOrdenable{
    String nombre;
    Double velocidad;

    public String getNombre() {
        return nombre;
    }

    public Double getVelocidad() {
        return velocidad;
    }
    
    public void ejecutarProceso(Proceso p){
        System.out.println("Ejecutando "+p);
    }

    public boolean esMayor(ElementoOrdenable e){
        return (this.getVelocidad()<((Computadora)e).getVelocidad());
    }
    
    public String toString(){
        return(this.getNombre()+"-"+this.getVelocidad());
    }
    
    public Computadora(String nombre,double velocidad){
        this.nombre=nombre;
        this.velocidad=velocidad;
    }
}
