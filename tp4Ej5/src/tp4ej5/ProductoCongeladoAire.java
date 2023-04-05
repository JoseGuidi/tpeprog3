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
public class ProductoCongeladoAire extends ProductoCongelado{
    double porcNitrogeno;
    double porcOxigeno;
    double porcDioxidoCarbono;
    double porcVaporDeAgua;

    public double getPorcNitrogeno() {
        return porcNitrogeno;
    }

    public double getPorcOxigeno() {
        return porcOxigeno;
    }

    public double getPorcDioxidoCarbono() {
        return porcDioxidoCarbono;
    }

    public double getPorcVaporDeAgua() {
        return porcVaporDeAgua;
    }

    public void setPorcNitrogeno(double porcNitrogeno) {
        this.porcNitrogeno = porcNitrogeno;
    }

    public void setPorcOxigeno(double porcOxigeno) {
        this.porcOxigeno = porcOxigeno;
    }

    public void setPorcDioxidoCarbono(double porcDioxidoCarbono) {
        this.porcDioxidoCarbono = porcDioxidoCarbono;
    }

    public void setPorcVaporDeAgua(double porcVaporDeAgua) {
        this.porcVaporDeAgua = porcVaporDeAgua;
    }
    
    
    
    public String obtenerInfoCongelamiento(){
        return(" Porc diox "+this.getPorcDioxidoCarbono()+" porc nitrogeno "+this.getPorcNitrogeno()+" porc ox "+this.getPorcOxigeno()+" porc vapor "+this.getPorcVaporDeAgua());
    }
    
    public ProductoCongeladoAire(String nom,int numeroLote, Date fechaVenc, Date fechaEnv,String granjaOrigen,double Temperatura,int codOrg,double porcNitrogeno,double porcOxigeno, double porcDioxido,double porcVaporDeagua){
        super(nom,numeroLote,fechaVenc,fechaEnv,granjaOrigen,Temperatura,codOrg);
        this.setPorcDioxidoCarbono(porcDioxido);
        this.setPorcNitrogeno(porcNitrogeno);
        this.setPorcOxigeno(porcOxigeno);
        this.setPorcVaporDeAgua(porcVaporDeagua);
    }
}
