/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3ej1;

/**
 *
 * @author ilari
 */
public class Persona {
    private String nombre;
    private long dni;
    private boolean esEmpleado;
    private int encuestasRespondidas;

    public String getNombre() {
        return nombre;
    }

    public long getDni() {
        return dni;
    }

    public boolean isEsEmpleado() {
        return esEmpleado;
    }

    public int getEncuestasRespondidas() {
        return encuestasRespondidas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setEsEmpleado(boolean esEmpleado) {
        this.esEmpleado = esEmpleado;
    }

    public void setEncuestasRespondidas(int encuestasRespondidas) {
        this.encuestasRespondidas = encuestasRespondidas;
    }
    
    
    
  
    public Persona(String nombre,long dni){
        this(nombre,dni,false,0);
    }
    
    public Persona(String nombre,long dni,boolean esEmpleado,int encuestasRespondidas){
        this.setNombre(nombre);
        this.setDni(dni);
        this.setEncuestasRespondidas(encuestasRespondidas);
        this.setEsEmpleado(esEmpleado);
    }
   
    public String obtenerInformacionPersona(){
        return (" Nombre persona"+this.getNombre()+" Dni "+this.getDni()+" Encuestas respondidas "+this.getEncuestasRespondidas());
    }
    
}
