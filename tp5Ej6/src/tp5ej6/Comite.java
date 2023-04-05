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
public class Comite {
    ArrayList<Evaluador> evaluadores;
    ArrayList<String> conocimientosGenerales;
    ArrayList<String> conocimientosExpertos;
    ArrayList<Trabajo> trabajos;
    
    
    public ArrayList<String> getConocimientosExpertos() {
        ArrayList<String> aux=new ArrayList();
        aux.addAll(this.conocimientosExpertos);
        return aux;
    }
    public ArrayList<String> getconocimientosGenerales() {
        ArrayList<String> aux=new ArrayList();
        aux.addAll(this.conocimientosGenerales);
        return aux;
    }
    
    public ArrayList<Evaluador> getevaluadores() {
        ArrayList<Evaluador> aux=new ArrayList();
        aux.addAll(this.evaluadores);
        return aux;
    }
    
    public ArrayList<Trabajo> getTrabajos() {
        ArrayList<Trabajo> aux=new ArrayList();
        aux.addAll(this.trabajos);
        return aux;
    }
    
    public void addTrabajo(Trabajo t){
        this.trabajos.add(t);
    }
    
    public void addEvaluador(Evaluador e){
        e.evaluarTipoEvaluador(conocimientosGenerales, conocimientosExpertos);
        this.evaluadores.add(e);
    }
    public void addconocimientosExpertos(String e){
        this.conocimientosExpertos.add(e);
    }
    public void addconocimientosGenerales(String e){
        this.conocimientosGenerales.add(e);
    }
    
    public String toString(){
        return ("Evaluadores "+this.getevaluadores().toString()+" Conocimientos expertos "+this.getConocimientosExpertos().toString()+" Conocimientos generales "+this.getconocimientosGenerales().toString()+" trabajos "+this.getTrabajos());
    }
    
    public Comite(){
        this.evaluadores=new ArrayList();
        this.conocimientosGenerales=new ArrayList();
        this.conocimientosExpertos=new ArrayList();
        this.trabajos=new ArrayList();
    }
    
    public String encontrarEvaluador(Trabajo t){
        for(int i=0;i<this.getevaluadores().size();i++){
            if(t.puedeEvaluar(this.getevaluadores().get(i))){
                return (this.getevaluadores().get(i)).getNombre();
            }
        }
        return "nadie";
    }
    
    public ArrayList<String> encontrarTrabajos(Evaluador e){
        ArrayList salida=new ArrayList();
        for(int i=0;i<this.getTrabajos().size();i++){
            if(e.puedeEvaluar(this.getTrabajos().get(i))){
                salida.add(this.getTrabajos().get(i));
            }
        }
        return salida;
    }
    
    public static void main(String [] args){
        Comite c=new Comite();
        Evaluador luis =new Evaluador("luis");
        Trabajo t=new TrabajoContenidoParcial("total");
        t.addPalabraClave("Ser experto");
        t.addPalabraClave("choto");
        c.addTrabajo(t);
        luis.addConocimiento("Ser experto");
        c.addconocimientosExpertos("Ser experto");
        c.addconocimientosGenerales("algoritmos");
        c.addconocimientosGenerales("lenguajes de programación");
        c.addEvaluador(luis);
        System.out.println(c.encontrarTrabajos(luis));
        System.out.println(c.toString());
    }
}
