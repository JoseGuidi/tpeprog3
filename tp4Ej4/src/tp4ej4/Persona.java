/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4ej4;

import java.util.Date;

/**
 *
 * @author ilari
 */
public class Persona {
    String nombre;
    String apellido;
    int numpas;
    Date fechaNac;
    Estado queHace;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNumpas() {
        return numpas;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public Estado getQueHace() {
        return queHace;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setQueHace(Estado queHace) {
        this.queHace = queHace;
    }

    public void setNumpas(int numpas) {
        this.numpas = numpas;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    public boolean estaDisponibleParaEvento(){
        return(!this.getQueHace().isConcentrado()&&this.getQueHace().isEnPaisOrigen());
    }
    
    public Persona(String nombre, String apellido, int numpas){
        this(nombre,apellido,numpas,new Date(),new Estado());
    }
    
    @Override
    public String toString(){
        return("Apellido " +this.getApellido()+" Nombre "+this.getNombre()+" Num pasaporte "+this.getNumpas()+" Fecha nac "+this.getFechaNac().toString()+" Que hace "+this.getQueHace().toString());
    }
    public Persona(String nombre, String apellido, int numpas,Date fechanac,Estado estado){
        this.setApellido(apellido);
        this.setNombre(nombre);
        this.setNumpas(numpas);
        this.setFechaNac(fechanac);
        this.setQueHace(estado);
    }
    
}
