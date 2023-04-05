package tp9ej5;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ilari
 */
public abstract class ElementoSistemaComunicacion {
    public abstract int obtenerCantidadMensajes();
    public abstract int obtenerCantidad();
    public abstract void obtenerNot(Notificacion n);
    public abstract ArrayList<Empleado>buscar(Condicion c,Comparador comp);
}
