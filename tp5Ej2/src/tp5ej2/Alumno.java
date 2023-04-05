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
public class Alumno {
    ArrayList<String> cualidades;
    String nombre;
    ArrayList<Alumno> familiares;
    boolean disponible;

    public ArrayList<String> getCualidades() {
        ArrayList<String> aux= (ArrayList<String>) this.cualidades.clone();
        return aux;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Alumno> getFamiliares() {
        ArrayList<Alumno> aux = (ArrayList<Alumno>) this.familiares.clone();
        return aux;
    }

    public boolean isAsignado() {
        return disponible;
    }

    public void setCualidad(String cualidad){
        this.cualidades.add(cualidad);
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean equals(Alumno al){
        
        if(this.getNombre()==al.getNombre()){
            System.out.println("return true equals");
            return true;
        }
        return false;
    }

    public void setAsignado(boolean asignado) {
        this.disponible = asignado;
    }
    
    public void setFamiliar(Alumno nombre){
        this.familiares.add(nombre);
    }
    
    @Override
    public String toString(){
        String n="";
        
        for (int i=0;i<this.getFamiliares().size();i++){
            n=n+" "+this.getFamiliares().get(i).getNombre();
        }
        return ("Nombre "+this.getNombre()+" Familiares "+n+" Cualidades "+this.getCualidades().toString()+" Esta asignado "+this.isAsignado());
    }
    
    public Alumno(String nombre){
        this.setNombre(nombre);
        this.setAsignado(false);
        this.familiares=new ArrayList<>();
        this.cualidades=new ArrayList<>();
    }
    
}
