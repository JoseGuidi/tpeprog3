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
public class ProductoCongeladoAgua extends ProductoCongelado{
    double salinidadPorLitroAgua;

    public void setSalinidadPorLitroAgua(double salinidadPorLitroAgua) {
        this.salinidadPorLitroAgua = salinidadPorLitroAgua;
    }

    public double getSalinidadPorLitroAgua() {
        return salinidadPorLitroAgua;
    }
    
    public String obtenerInfoCongelamiento(){
        return(" Salinidad por litro de agua "+this.getSalinidadPorLitroAgua()); 
    }
    
    public ProductoCongeladoAgua(String nom,int numeroLote, Date fechaVenc, Date fechaEnv,String granjaOrigen,double Temperatura,int codOrg,double salinidadPorLitroAgua){
       super(nom,numeroLote,fechaVenc,fechaEnv,granjaOrigen,Temperatura,codOrg);
       this.setSalinidadPorLitroAgua(salinidadPorLitroAgua);
    }
}
