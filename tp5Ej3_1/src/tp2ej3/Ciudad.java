/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2ej3;

/**
 *
 * @author ilari
 */
public class Ciudad {
    private int habitantes;
    private Imp montoRecaudado;
    private int gastos;
    private String nombre;
    
    public Ciudad(){
        this("ciudad x");
    }
    public Ciudad(String nombre){
        this(10,new Imp(),20,nombre);
    }
    public Ciudad(int habitantes,Imp montoRecaudado,int gastos,String nombre){
        this.habitantes=habitantes;
        this.montoRecaudado=montoRecaudado;
        this.gastos=gastos;
        this.nombre=nombre;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public Imp getMontoRecaudado() {
        return montoRecaudado;
    }

    public int getGastos() {
        return gastos;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public void setMontoRecaudado(Imp montoRecaudado) {
        this.montoRecaudado = montoRecaudado;
    }

    public void setGastos(int gastos) {
        this.gastos = gastos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String obtenerInfoCiudad(){
        String devolver=("nombre "+this.getNombre()+" habitantes "+this.getHabitantes()+" monto recaudado "+this.getMontoRecaudado().obtenerInfo()+" gasto "+this.getGastos());
        devolver=devolver+"\n";
        return(devolver);
    }        
}
