/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2ej5;

/**
 *
 * @author ilari
 */
public class Peluquero {
    public static final int arrayTurnosPorDefecto[]= {10,11,12,13};
    public static final int cantTurnosPeluquero=4;
    private String nombre;
    private int turnos[];
    
    

    public static int getCantTurnosPeluquero() {
        return cantTurnosPeluquero;
    }

    public String getNombre() {
        return nombre;
    }

    public int[] getTurnos() {
        return turnos;
    }

    public static int[] getArrayTurnosPorDefecto() {
        return arrayTurnosPorDefecto;
    }

    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTurnos(int[] turnos) {
        this.turnos = turnos;
    }

    
    
    public Peluquero(){
        this("vacio",arrayTurnosPorDefecto);
    }
    
    public Peluquero(String nombre){
        this(nombre,arrayTurnosPorDefecto);
    }
    public Peluquero(String nombre,int[] turnos){
        this.setNombre(nombre);
        this.setTurnos(turnos);
        
    }
    
    public String obtenerData(){
        String dataTurnos=" ";
        for(int i=0;i<this.getTurnos().length;i++){
            dataTurnos=dataTurnos+this.getTurnos()[i]+"/";
        }
        return (this.getNombre()+" "+dataTurnos);
    }
    
}
