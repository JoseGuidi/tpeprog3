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
public class IntermedioRefrigeradoyCongelado extends ProductoFresco{
    double temperaturaMantenimiento;
    int codigoOrganizacion;
    
    public double getTemperaturaMantenimiento() {
        return temperaturaMantenimiento;
    }

    public int getCodigoOrganizacion() {
        return codigoOrganizacion;
    }

    public void setTemperaturaMantenimiento(double temperaturaMantenimiento) {
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    public void setCodigoOrganizacion(int codigoOrganizacion) {
        this.codigoOrganizacion = codigoOrganizacion;
    }
    
    @Override
    public String toString(){
        return(super.toString()+" Temp conserva "+this.getTemperaturaMantenimiento()+" Cod org "+this.getCodigoOrganizacion());
    }
    public IntermedioRefrigeradoyCongelado(String nom,int numeroLote, Date fechaVenc, Date fechaEnv,String granjaOrigen,double Temperatura,int codOrg){
        super(nom,numeroLote,fechaVenc,fechaEnv,granjaOrigen);
        this.setTemperaturaMantenimiento(Temperatura);
        this.setCodigoOrganizacion(codOrg);
        
    }
}
