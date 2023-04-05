/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej5;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ilari
 */
public class Grupo extends ElementoSistemaComunicacion{

    ArrayList<ElementoSistemaComunicacion>elementos;
    Propagador propagadorNot;

    public void setPropagador(Propagador p){
        this.propagadorNot=p;
    }
    
    public Grupo(Propagador propagadorNot) {
        this.propagadorNot = propagadorNot;
        elementos=new ArrayList();
    }
    
    
    
    @Override
    public void obtenerNot(Notificacion n) {
        if(propagadorNot.cumple(n)){
            for(ElementoSistemaComunicacion e:elementos){
                e.obtenerNot(n);
            }
        }
    }

    @Override
    public ArrayList<Empleado> buscar(Condicion c,Comparador comp) {
        ArrayList<Empleado>filtro=new ArrayList();
        for(ElementoSistemaComunicacion e:elementos){
            for(Empleado em:e.buscar(c,comp)){
                if(!filtro.contains(em)){
                    filtro.add(em);
                }
            }
        }
        Collections.sort(filtro, comp);
        return filtro;
    }

    @Override
    public int obtenerCantidad() {
        int cantidad=0;
        for(ElementoSistemaComunicacion e:elementos){
            cantidad+=e.obtenerCantidad();
        }
        return cantidad;
    }

    @Override
    public int obtenerCantidadMensajes() {
        int cantidad=0;
        for (ElementoSistemaComunicacion e:elementos){
            cantidad+=e.obtenerCantidadMensajes();
        }
        return cantidad;
    }
    
}
