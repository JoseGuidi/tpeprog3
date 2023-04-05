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
public class TareaCompuesta extends Tarea{

    ArrayList<Tarea>tareas;
    
    public void addTarea(Tarea t){
        tareas.add(t);
    }
    
    @Override
    public LocalDate getFechaInic() {
       LocalDate fechainic=null;
        for(Tarea t:tareas){
            if(fechainic==null){
                fechainic=t.getFechaInic();
            }
            else{
                if(t.getFechaInic().isBefore(fechainic)){
                    fechainic=t.getFechaInic();
                }
            }
        }
        return fechainic;
    }

    @Override
    public LocalDate getFechaFin() {
        LocalDate fechafin=null;
        for(Tarea t:tareas){
            if(fechafin==null){
                fechafin=t.getFechaFin();
            }
            else{
                if(t.getFechaFin().isAfter(fechafin)){
                    fechafin=t.getFechaFin();
                }
            }
        }
        return fechafin;
    }

    public TareaCompuesta() {
        tareas=new ArrayList();
    }

    
    
    @Override
    public ArrayList<Tarea> buscarTareas(Condicion c) {
        ArrayList<Tarea>tareas=new ArrayList();
        for(Tarea t:tareas){
            tareas.addAll(t.buscarTareas(c));
        }
        return tareas;
    }

    @Override
    public ArrayList<Tarea> buscarTareas(Recurso r) {
        ArrayList<Tarea>tareas=new ArrayList();
        for(Tarea t:tareas){
            tareas.addAll(t.buscarTareas(r));
        }
        return tareas;
    }

    @Override
    public ArrayList<Recurso> obtenerRecursosTarea() {
        ArrayList<Recurso>recursos=new ArrayList();
        ArrayList<Recurso>aux=new ArrayList();
        for(Tarea t:tareas){
            aux.addAll(t.obtenerRecursosTarea());
        }
        for(Recurso r:aux){
            if(!recursos.contains(r)){
                recursos.add(r);
            }
        }
        return recursos;
    }

    
    
    
}
