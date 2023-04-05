/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3ej3;

/**
 *
 * @author ilari
 */
public class Habilidad {
    private String nombreHabilidad;
    private int nivelDeHabilidad;

    public String getNombreHabilidad() {
        return nombreHabilidad;
    }

    public int getNivelDeHabilidad() {
        return nivelDeHabilidad;
    }

    public void setNombreHabilidad(String nombreHabilidad) {
        this.nombreHabilidad = nombreHabilidad;
    }

    public void setNivelDeHabilidad(int nivelDeHabilidad) {
        this.nivelDeHabilidad = nivelDeHabilidad;
    }
    
    
    
    public Habilidad(String nombre,int nivelHabilidad){
        this.setNivelDeHabilidad(nivelHabilidad);
        this.setNombreHabilidad(nombre);
        
    }
    
}
