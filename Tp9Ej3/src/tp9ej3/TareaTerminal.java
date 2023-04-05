/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej3;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class TareaTerminal extends Tarea{
    LocalDate fechaInicReal;
    LocalDate fechaFinReal;
    LocalDate fechaInic;
    LocalDate fechaFin;
    ArrayList<Recurso>recursos;
    String completada;

    public String getCompletada() {
        return completada;
    }

    
    
    public TareaTerminal(LocalDate fechaInicReal, LocalDate fechaFinReal, LocalDate fechaInic, LocalDate fechaFin) {
        this.fechaInicReal = fechaInicReal;
        this.fechaFinReal = fechaFinReal;
        this.fechaInic = fechaInic;
        this.fechaFin = fechaFin;
        recursos=new ArrayList();
    }
    
    public void tareaEncurso(){
        completada="en curso";
    }
    public void tareaEnEspera(){
        completada="en espera";
    }
    public void tareaCompletada(){
        completada="completada";
    }
    
    public void addRecurso(Recurso r){
        recursos.add(r);
    }
    
    @Override
    public LocalDate getFechaInic() {
        return fechaInic;
    }

    @Override
    public LocalDate getFechaFin() {
        return fechaFin;
    }

    @Override
    public ArrayList<Tarea> buscarTareas(Condicion c) {
        ArrayList<Tarea>filtro=new ArrayList();
        if(c.cumple(this)){
            filtro.add(this);
        }
        return filtro;
    }

    @Override
    public ArrayList<Tarea> buscarTareas(Recurso r) {
        ArrayList<Tarea> tareas=new ArrayList();
        if(this.recursos.contains(r)){
            tareas.add(this);
        }
        return tareas;
    }

    @Override
    public ArrayList<Recurso> obtenerRecursosTarea() {
        return new ArrayList(recursos);
    }

    
    
}
