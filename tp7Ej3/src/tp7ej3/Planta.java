package tp7ej3;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ilari
 */
public class Planta {
    String nombreCientifico;
    ArrayList<String>nombresVulgares;
    String clasificacionSuperior;
    String familia;
    String clase;
    boolean esDeInterior;
    int riego;
    int sol;
    
    public void addNombreVulgar(String nombre){
        nombresVulgares.add(nombre);
    }
    
    public boolean nombreCientificoContienePalabra(String palabra){
        return nombreCientifico.contains(palabra);
    }
    
    public boolean nombreSeConoceComo(String nombre){
        return nombresVulgares.contains(nombre);
    }
    
    public boolean esDeClasificacion(String clasificacion){
        return clasificacionSuperior.equals(clasificacion);
    }
    
    public boolean requierenNivelDeSolSup(int nivel){
        return sol>nivel;
    }
    
    public boolean requiereNivelDeRiegoInferior(int nivel){
        return riego<nivel;
    }
    
    public String toString(){
        return(nombreCientifico+"-"+nombresVulgares.toString()+"-"+clasificacionSuperior+"-"+familia+"-"+clase+"-"+esDeInterior+"-"+riego+"-"+sol);
    }
    
    public Planta(String nombrecientifico,String clasificacionSuperior,String familia,String clase,boolean esDeInterior,int riego,int sol){
        this.nombresVulgares=new ArrayList<>();
        this.nombreCientifico=nombrecientifico;
        this.clasificacionSuperior=clasificacionSuperior;
        this.familia=familia;
        this.clase=clase;
        this.esDeInterior=esDeInterior;
        this.riego=riego;
        this.sol=sol;
    }
}
