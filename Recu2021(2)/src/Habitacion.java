
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ilari
 */
public class Habitacion extends ElementoSh{
    ArrayList<String>comodidades;
    int cantidadCamas;
    LocalDate fechaOcupacion;
    boolean aceptaMascotas;
    int metrosHabitacion;
    Turista t;
    
    
    public Habitacion(int cantidadCamas,boolean aceptaMascotas,int metrosHabitacion){
        this.cantidadCamas=cantidadCamas;
        this.aceptaMascotas=aceptaMascotas;
        this.metrosHabitacion=metrosHabitacion;
        comodidades=new ArrayList();
        t=null;
    }
    
    public void ocuparHabitacion(Turista t){
        fechaOcupacion=LocalDate.now();
        this.t=t;
    }
    
    public void desocuparHabitacion(){
        this.t=null;
    }
    
    public boolean estaDisponible(){
        return t==null;
    }
    
    public void addComodidad(String c){
        comodidades.add(c);
    }
    
    public ArrayList<String> getComodidad(){
        return new ArrayList(comodidades);
    }

    public void setCantidadCamas(int cantidadCamas) {
        this.cantidadCamas = cantidadCamas;
    }

    public void setAceptaMascotas(boolean aceptaMascotas) {
        this.aceptaMascotas = aceptaMascotas;
    }

    public void setMetrosHabitacion(int metrosHabitacion) {
        this.metrosHabitacion = metrosHabitacion;
    }

    public int getCantidadCamas() {
        return cantidadCamas;
    }

    public LocalDate getFechaOcupacion() {
        return fechaOcupacion;
    }

    public boolean isAceptaMascotas() {
        return aceptaMascotas;
    }

    @Override
    public ArrayList<Habitacion> buscar(Condicion c,Criterio cri) {
        ArrayList<Habitacion>filtro=new ArrayList();
        if(this.estaDisponible())
            if(c.cumple(this))
                filtro.add(this);
        
        return filtro;
    }

    @Override
    public int obtenerMetros() {
        return metrosHabitacion;
    }

    @Override
    public int contarEnbaseCondicion(Condicion c) {
        if(c.cumple(this))
            return 1;
        return 0;
    }
    
    public boolean contieneCaracteristica(String car){
        return comodidades.contains(car);
    }
    
}
