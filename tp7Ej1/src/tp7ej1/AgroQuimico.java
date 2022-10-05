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
public class AgroQuimico {
    String nombre;
    ArrayList<Cultivo> cultivosNoRecomendados;
    ArrayList<String>patologias;
    
    public String getNombre(){
        return nombre;
    }
    
    public boolean contieneCultivo(Cultivo c){
     return cultivosNoRecomendados.contains(c);
    }
    
    public void addCultivoNoRecomendado(Cultivo c){
        cultivosNoRecomendados.add(c);
    }
    
    public void addPatologias(String p){
        patologias.add(p);
    }
    
    public ArrayList getCultivosNoRecomendados(){
        return new ArrayList<>(cultivosNoRecomendados);
    }
    
    public ArrayList getPatologias(){
        return new ArrayList<>(patologias);
    }
    
    public String toString(){
        return(nombre+"-"+cultivosNoRecomendados.toString()+"-"+patologias.toString());
    }
    
    public boolean tieneTodasPatologias(ArrayList<String> patologiasAfuera){
     return patologias.containsAll(patologiasAfuera);
    }
    
    public AgroQuimico(String nombre){
        this.nombre=nombre;
        this.cultivosNoRecomendados=new ArrayList<>();
        this.patologias=new ArrayList<>();
    }
}
