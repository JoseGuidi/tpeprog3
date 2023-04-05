/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ej6;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class Evaluador {
    String nombre;
    ArrayList<String> conocimientos;
    String tipo;
    int cantTrabajos;
    static String ConocimientosBasicos[] = {"algoritmos", "lenguajes de programación"};
    
    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getConocimientos() {
        ArrayList<String> aux= new ArrayList();
        aux.addAll(this.conocimientos);
        return aux;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCantTrabajos() {
        return cantTrabajos;
    }

    public void setCantTrabajos(int cantTrabajos) {
        this.cantTrabajos = cantTrabajos;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void addConocimiento(String conocimiento){
        this.conocimientos.add(conocimiento);
        
    }
    
    public String toString(){
        return("Nombre "+this.getNombre()+" tipo "+this.getTipo()+" conocimientos "+this.getConocimientos().toString());
    }
    
    public boolean puedeEvaluar(Trabajo t){
        if (t.puedeEvaluar(this)){
            this.setCantTrabajos(this.getCantTrabajos()+1);
        }
        return t.puedeEvaluar(this);
    }
    
    public String evaluarTipoEvaluador(ArrayList<String> ConocimientosGenerales,ArrayList<String> ConocimientosExpertos){
        if(this.getConocimientos().containsAll(ConocimientosExpertos)){
            this.setTipo("experto");
            
        }
        else if(this.getConocimientos().containsAll(ConocimientosGenerales)){
            this.setTipo("general");
        }
        return this.getTipo();
    }
    
    public void insertarConocimientosBasicos(){
        for(int i=0;i<ConocimientosBasicos.length;i++){
            this.conocimientos.add(ConocimientosBasicos[i]);
        }
    }
    
    public Evaluador(String nombre){
        this.setNombre(nombre);
        this.conocimientos= new ArrayList();
        this.insertarConocimientosBasicos();
        this.cantTrabajos=0;
    }
    
    
}
