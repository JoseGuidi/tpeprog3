/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ej2;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public abstract class Casa {
    String nombre;
    int cantMaxima;
    ArrayList<String> cualidadesDeseadas;
    ArrayList<Alumno> integrantes;
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantMaxima() {
        return cantMaxima;
    }

    public ArrayList<String> getCualidadesDeseadas() {
        return cualidadesDeseadas;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setCualidad(String cualidad){
        this.cualidadesDeseadas.add(cualidad);
    }

    public void setCantMaxima(int cantMaxima) {
        this.cantMaxima = cantMaxima;
    }

    public ArrayList<Alumno> getIntegrantes() {
        ArrayList<Alumno> aux=new ArrayList<>();
        aux.addAll(this.integrantes);
        System.out.println(aux);
        return aux;
    }
    
    
    
    public boolean tieneLasCualidades(Alumno alum){
          return(alum.getCualidades().containsAll(cualidadesDeseadas));
    }
    
    public void addIntegrante(Alumno al){
        this.integrantes.add(al);
        al.setAsignado(true);
    }
    
    public String toString(){
        return(" Nombre casa "+this.getNombre()+" cualidades "+this.cualidadesDeseadas.toString()+ " cant max "+this.cantMaxima+" integrantes "+this.integrantes.toString());
    }
    
    public abstract boolean cumpleCondAdicionales(Alumno al);
    
    public boolean cumpleCondicionesBasicas(Alumno al){
        if(this.integrantes.size()<this.getCantMaxima()){
            if(this.tieneLasCualidades(al)){
                
                return this.cumpleCondAdicionales(al);
                
            }
        }
        return false;
    }
        
    
    
    public void entraAlaCasa(Alumno al){
        if(this.cumpleCondicionesBasicas(al)){
            
            this.addIntegrante(al);
        }
    }
    
    public Casa(String nombre,int cantmax){
        this.setNombre(nombre);
        this.cantMaxima=cantmax;
        this.cualidadesDeseadas=new ArrayList();
        this.integrantes=new ArrayList();
    }
    
}
