/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej6;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public abstract class ElementoTerritorio {
    String nombre;
    public abstract ArrayList<Comarca>buscarComarca(Condicion c);
    public abstract int getCantHabitantes();
    public abstract int getSuperficie();
    public abstract int getMontoIngresos();
    public double ingresosPerCapita(){
        return (double)((double)this.getMontoIngresos()/(double)this.getCantHabitantes());
    }
    public double densidadPoblacional(){
        return (double)((double)this.getCantHabitantes()/(double)this.getSuperficie());
    }

    public ElementoTerritorio(String nombre) {
        this.nombre = nombre;
    }
    
     public String getNombre() {
        return nombre;
    }
}
