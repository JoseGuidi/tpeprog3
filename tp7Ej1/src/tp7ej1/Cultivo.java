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
public class Cultivo {
    String nombre;
    ArrayList<Enfermedad>enfermedades;
    
    public String getNombre(){
        return nombre;
    }
    
    @Override
    public boolean equals(Object o){
        return ((nombre==(((Cultivo)o).getNombre()))&&(enfermedades.equals(((Cultivo)o).getEnfermedades())));
    }
    
    public void addEnfermedad(Enfermedad e){
        this.enfermedades.add(e);
    }
    public ArrayList getEnfermedades(){
        return new ArrayList<>(enfermedades);
    }
    
    public String toString(){
        return(nombre+"-"+enfermedades.toString());
    }
    
    public boolean puedeSerUtil(AgroQuimico a){
        boolean sirve=false;
        if(!a.contieneCultivo(this)){
            for(int i=0;i<this.enfermedades.size();i++){
            if(a.tieneTodasPatologias(enfermedades.get(i).getPatologias())){
                sirve=true;
                }
            }
        }
        return sirve;
    }
    
    public Cultivo(String nombre){
        this.nombre=nombre;
        this.enfermedades=new ArrayList<>();
    }
}
