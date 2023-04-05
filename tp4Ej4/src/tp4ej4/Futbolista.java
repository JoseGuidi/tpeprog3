/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4ej4;

import java.util.Date;

/**
 *
 * @author ilari
 */
public class Futbolista extends Persona{
    int posicion;
    boolean derecho;
    int cantGoles;

    public int getPosicion() {
        return posicion;
    }

    public boolean isDerecho() {
        return derecho;
    }

    public int getCantGoles() {
        return cantGoles;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void setDerecho(boolean derecho) {
        this.derecho = derecho;
    }

    public void setCantGoles(int cantGoles) {
        this.cantGoles = cantGoles;
    }
    
    public String toString(){
        return(super.toString()+" Posicion "+this.getPosicion()+" Es derecho "+this.isDerecho()+ "Cant goles "+this.getCantGoles());
    }
    
    public Futbolista(String nombre,String apellido, int numpas,int posicion){
        this(nombre,apellido,numpas,new Estado(),posicion,true,0,new Date());
    }
    public Futbolista(String nombre,String apellido, int numpas,Estado estado,int posicion,boolean derecho,int cantGoles,Date fechanac){
        super(nombre,apellido,numpas,fechanac,estado);
        this.setCantGoles(cantGoles);
        this.setDerecho(derecho);
        this.setPosicion(posicion);
        
    }
}
