/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6ej2;

/**
 *
 * @author ilari
 */
public class Proceso extends ElementoOrdenable{
    String nombre;
    double reqMemoria;

    public boolean esMayor(ElementoOrdenable e){
        return (this.getReqMemoria()<((Proceso) e).getReqMemoria());
    }
    
    public String toString(){
        return(this.getNombre()+"-"+this.getReqMemoria());
    }
    
    public String getNombre() {
        return nombre;
    }

    public double getReqMemoria() {
        return reqMemoria;
    }
    
    public Proceso(String nombre,double reqMemoria){
        this.nombre=nombre;
        this.reqMemoria=reqMemoria;
    }
}
