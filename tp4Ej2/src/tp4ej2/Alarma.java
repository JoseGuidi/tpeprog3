/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4ej2;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class Alarma {
    private ArrayList<Sensor> listaSensores;
    private Timbre timbre;
    
    public ArrayList<Sensor> getListaSensores() {
        return listaSensores;
    }

    public void setListaSensores(ArrayList<Sensor> listaSensores) {
        this.listaSensores = listaSensores;
    }

    public Timbre getTimbre() {
        return timbre;
    }

    public void setTimbre(Timbre timbre) {
        this.timbre = timbre;
    }
    
    
    
    public void insertar(Sensor s){
        this.getListaSensores().add(s);
    }
    
    public Sensor recuperar(int i){
        return (this.getListaSensores().get(i));
    }
    
    public String toString(){
        String s="";
        for(int i=0;i<this.getListaSensores().size();i++){
            s=s+this.getListaSensores().get(i).toString();
        }
        return s;
    }
    
    public String comprobar(){
        String s="";
        s="Todo correcto";
        for(int i=0;i<this.getListaSensores().size();i++){
            if((this.getListaSensores().get(i).isSeAbrioAbertura()==true)||(this.getListaSensores().get(i).isSeDetectoMov()==true)||(this.getListaSensores().get(i).isSeRompioVidrio()==true)){
                if(s=="Todo correcto"){
                    s="Se vulnero en "+this.getListaSensores().get(i).getNombreLugar();
                    this.getTimbre().hacerSonar();
                }
                else{
                    s=s+" Se vulnero en "+this.getListaSensores().get(i).getNombreLugar();
                    this.getTimbre().hacerSonar();
                }
            } 
            else{
                
            }
        }
        return s;
    }    
    
    public Alarma(){
        this.setListaSensores( new ArrayList<Sensor>());
        this.setTimbre(new Timbre());
    }
    
}
