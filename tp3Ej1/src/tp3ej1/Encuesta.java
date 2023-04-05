/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3ej1;

/**
 *
 * @author ilari
 */
public class Encuesta {
    private String nombreEncuesta;
    private String preguntas[];
    private String respuestas[];
    private int cantPreguntas;
    private Persona personaEncuestada;
    private Persona empleadoEncuesta;
    private long dniPersonaEncuestada;
    
    
    
    public String getNombreEncuesta() {
        return nombreEncuesta;
    }

    public String[] getPreguntas() {
        return preguntas;
    }

    public int getCantPreguntas() {
        return cantPreguntas;
    }

    public String[] getRespuestas() {
        return respuestas;
    }

    
    
    public Persona getPersonaEncuestada() {
        return personaEncuestada;
    }

    public Persona getEmpleadoEncuesta() {
        return empleadoEncuesta;
    }

    public long getDniPersonaEncuestada() {
        return dniPersonaEncuestada;
    }

    public void setNombreEncuesta(String nombreEncuesta) {
        this.nombreEncuesta = nombreEncuesta;
    }

    public void setRespuestas(String[] respuestas) {
        this.respuestas = respuestas;
    }

    public void setPreguntas(String[] preguntas) {
        this.preguntas = preguntas;
    }

    public void setCantPreguntas(int cantPreguntas) {
        this.cantPreguntas = cantPreguntas;
    }  

    public void setPersonaEncuestada(Persona personaEncuestada) {
        this.personaEncuestada = personaEncuestada;
    }

    public void setEmpleadoEncuesta(Persona empleadoEncuesta) {
        this.empleadoEncuesta = empleadoEncuesta;
    }

    public void setDniPersonaEncuestada(long dniPersonaEncuestada) {
        this.dniPersonaEncuestada = dniPersonaEncuestada;
    }
    
   
    public Encuesta( Persona empleadoEncuesta){
        this("encuesta ",4,empleadoEncuesta);
    }
    
    public Encuesta(String nombreEncuesta,int cantPreguntas,Persona empleadoEncuesta){
        this.setCantPreguntas(cantPreguntas);
        
        this.setEmpleadoEncuesta(empleadoEncuesta);
        
        this.setPreguntas(new String[cantPreguntas]);
        this.setRespuestas(new String[cantPreguntas]);
        this.setNombreEncuesta(nombreEncuesta);
    }
    
    
    public Encuesta responderEncuesta(Persona p){
        
        if (p.getDni()!=this.getDniPersonaEncuestada()){
            for(int i=0;i<this.getCantPreguntas();i++){
            this.getRespuestas()[i]="Nc/nc";
        }
        this.getEmpleadoEncuesta().setEncuestasRespondidas(this.getEmpleadoEncuesta().getEncuestasRespondidas()+1);
        p.setEncuestasRespondidas(p.getEncuestasRespondidas()+1);
        this.setDniPersonaEncuestada(p.getDni());
        this.setPersonaEncuestada(p);
        }
        else{
            System.out.println("ya contestaste");
        }
        return this;
    }
    
    public String obtenerInformacion(){
        return ("Nombre encuesta"+this.getNombreEncuesta()+" Empleado Encuesta "+this.getEmpleadoEncuesta().obtenerInformacionPersona()+" Persona encuestada "+this.getPersonaEncuestada().obtenerInformacionPersona()+" Dni de persona que respondio "+this.getDniPersonaEncuestada());
    }
    
}
