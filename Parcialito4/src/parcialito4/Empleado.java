/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialito4;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class Empleado {
    int idLegajo;
    String nombre;
    ArrayList<String>habilidades;

    public Empleado(int idLegajo, String nombre) {
        this.idLegajo = idLegajo;
        this.nombre = nombre;
        this.habilidades=new ArrayList();
    }

    public int getIdLegajo() {
        return idLegajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void addHabilidad(String hab){
        habilidades.add(hab);
    }
    
    
    
}
