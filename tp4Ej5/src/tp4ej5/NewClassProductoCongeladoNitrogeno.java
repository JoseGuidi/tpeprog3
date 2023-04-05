/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4ej5;

import java.util.Date;

/**
 *
 * @author ilari
 */
public class NewClassProductoCongeladoNitrogeno extends ProductoCongelado{
    String metodoCongelacion;
    int tiempoExp;

    public void setMetodoCongelacion(String metodoCongelacion) {
        this.metodoCongelacion = metodoCongelacion;
    }

    public void setTiempoExp(int tiempoExp) {
        this.tiempoExp = tiempoExp;
    }

    public String getMetodoCongelacion() {
        return metodoCongelacion;
    }

    public int getTiempoExp() {
        return tiempoExp;
    }
    
    
    
    public String obtenerInfoCongelamiento(){
        return(" Tiempo expuesto al nitrogeno "+this.getTiempoExp()+" Metodo congelamiento "+this.getMetodoCongelacion());
    }
    
    public NewClassProductoCongeladoNitrogeno(String nom,int numeroLote, Date fechaVenc, Date fechaEnv,String granjaOrigen,double Temperatura,int codOrg,String metodoCongelamiento,int segundosExpuestoNitrogeno){
       super(nom,numeroLote,fechaVenc,fechaEnv,granjaOrigen,Temperatura,codOrg);
        this.setMetodoCongelacion(metodoCongelamiento);
        this.setTiempoExp(segundosExpuestoNitrogeno);
    }
    
}
