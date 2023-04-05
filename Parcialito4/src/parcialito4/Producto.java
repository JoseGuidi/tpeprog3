/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialito4;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class Producto {
    String nombre;
    String descripcion;
    double precio;
    ArrayList<String>componentes;

    public Producto(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.componentes=new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }
    
    public void setprecio(double prec){
        this.precio=prec;
    }
    
    public void addComponente(String comp){
        componentes.add(comp);
    }
}
