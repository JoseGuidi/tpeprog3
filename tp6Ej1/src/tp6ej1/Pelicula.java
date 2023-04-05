/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6ej1;

import java.time.LocalDate;

/**
 *
 * @author ilari
 */
public class Pelicula extends Item{
    String nombre;
    int cantCopias;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantCopias(int cantCopias) {
        this.cantCopias = cantCopias;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantCopias() {
        return cantCopias;
    }
    
    @Override
    public boolean sePuedeAlquilar(){
        return (this.getCantCopias()>0);
    }
    
    
    
    public Pelicula(String nombre,int cantCopias){
        super(null);
        this.setCantCopias(cantCopias);
        this.setNombre(nombre);
    }
}
