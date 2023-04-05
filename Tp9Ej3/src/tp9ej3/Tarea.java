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
public abstract class Tarea{
    public abstract LocalDate getFechaInic();
    public abstract LocalDate getFechaFin();
    public abstract ArrayList<Tarea>buscarTareas(Condicion c);
    public abstract ArrayList<Tarea>buscarTareas(Recurso r);
    public abstract ArrayList<Recurso>obtenerRecursosTarea();
    //public abstract LocalDate obtenerDuracion();
}
