/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej5;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class Empleado extends ElementoSistemaComunicacion{
    String nombre;
    String apellido;
    String nroLegajo;
    int edad;
    ArrayList<Notificacion>notificaciones;

    public int getEdad(){
        return edad;
    }
    
    public Empleado(String nombre, String apellido, String nroLegajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroLegajo = nroLegajo;
        notificaciones=new ArrayList();
    }
    
    public ArrayList<Notificacion> getNot(){
        return new ArrayList(notificaciones);
    }
    
    @Override
    public void obtenerNot(Notificacion n) {
        notificaciones.add(n);
    }

    @Override
    public ArrayList<Empleado> buscar(Condicion c,Comparador comp) {
        ArrayList<Empleado>filtro=new ArrayList();
        if(c.cumple(this)){
            filtro.add(this);
        }
        return filtro;
    }

    @Override
    public int obtenerCantidad() {
        return 1;
    }

    @Override
    public int obtenerCantidadMensajes() {
        return this.getNot().size();
    }
    
}
