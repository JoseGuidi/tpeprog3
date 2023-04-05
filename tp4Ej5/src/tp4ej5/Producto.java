/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4ej5;

import java.util.Date;

/**
 *
 * @author ilari
 */
public class Producto {
    String nombre;
    Date fechaVenc;
    int nroLote;

    public String getNombre() {
        return nombre;
    }

    public Date getFechaVenc() {
        return fechaVenc;
    }

    public int getNroLote() {
        return nroLote;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaVenc(Date fechaVenc) {
        this.fechaVenc = fechaVenc;
    }

    public void setNroLote(int nroLote) {
        this.nroLote = nroLote;
    }
    
    public Producto(){
        this(0,new Date());
    }
    public Producto(int nroLote,Date fechaVenc){
        this.setNroLote(nroLote);
        this.setFechaVenc(fechaVenc);
    }
    
    @Override
    public String toString(){
        return("Nombre "+this.getNombre()+" Nro lote "+this.getNroLote()+" Fecha venc "+this.getFechaVenc());
    }
    
    public Producto(int nroLote,Date fechaVenc,String nombre){
        this.setNroLote(nroLote);
        this.setFechaVenc(fechaVenc);
        if(nombre!=null){
            this.setNombre(nombre);
        }
        
    }
    
}
