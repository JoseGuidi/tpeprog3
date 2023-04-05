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
public class ProductoFresco extends Producto{
    Date fechaEnvasado;
    String granjaOrigen;

    public void setFechaEnvasado(Date fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public void setGranjaOrigen(String granjaOrigen) {
        this.granjaOrigen = granjaOrigen;
    }

    public Date getFechaEnvasado() {
        return fechaEnvasado;
    }

    public String getGranjaOrigen() {
        return granjaOrigen;
    }
    
    @Override
    public String toString(){
        return(super.toString()+ " Fecha envasado "+this.getFechaEnvasado()+" Granja origen "+this.granjaOrigen);
    }
    
    public void corroborarNombre(String nombre){
        System.out.println("Entra ");
        if(nombre.equals("huevos gallina blanco")||nombre.equals("huevos gallina color")||nombre.equals("huevos codorniz")){
        super.setNombre(nombre);
    }
    }
    
    /*public ProductoFresco(int nrolote,Date fechaVenc,Date fechEnvasado,String granjaOrigen){
        this(null,nrolote,fechaVenc,fechEnvasado,granjaOrigen);
    }*/
    
    public ProductoFresco(String nombre,int nrolote,Date fechaVenc,Date fechEnvasado,String granjaorigen){
        super(nrolote,fechaVenc);
        this.setFechaEnvasado(fechEnvasado);
        this.setGranjaOrigen(granjaorigen);
        if (nombre!=null){
            this.corroborarNombre(nombre);
        }
        
    }
    
    
}
