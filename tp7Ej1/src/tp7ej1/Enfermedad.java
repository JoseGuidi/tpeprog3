/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7ej1;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class Enfermedad {
    String nombre;
    ArrayList<String>patologias;
    
    public String getNombre(){
        return nombre;
    }
    
    public void addPatologia(String p){
        this.patologias.add(p);
    }
    
    @Override
    public boolean equals(Object o){
        return((nombre==((Enfermedad)o).getNombre())&&(patologias.equals(((Enfermedad)o).getPatologias())));
    }
    
    public ArrayList getPatologias(){
        return new ArrayList<>(patologias);
    }
    
    public String toString (){
        return(nombre+"-"+patologias.toString());
    }
    
    public Enfermedad(String nombre){
        this.nombre=nombre;
        patologias=new ArrayList<>();
    }
    
}
