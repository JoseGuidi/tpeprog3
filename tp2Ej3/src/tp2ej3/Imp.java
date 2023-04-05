/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2ej3;

/**
 *
 * @author ilari
 */
public class Imp {
    private String nombre;
    private int monto;
    
    public Imp(){
        this("Imp1",10);
    }
    
    public Imp(String nombre, int monto){
        this.monto=monto;
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMonto() {
        return monto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
    public String obtenerInfo(){
        return("Nombre "+this.getNombre()+" monto "+this.getMonto());
    }
}
