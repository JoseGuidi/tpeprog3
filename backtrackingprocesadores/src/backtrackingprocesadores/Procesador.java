/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backtrackingprocesadores;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class Procesador {
    ArrayList<Tarea> tareas;

    public Procesador(ArrayList<Tarea> tareas) {
        this.tareas = tareas;
    }
    
    public void addTarea(Tarea t){
        tareas.add(t);
    }
    
    
}
