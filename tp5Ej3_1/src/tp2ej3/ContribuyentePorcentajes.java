/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2ej3;

/**
 *
 * @author ilari
 */
public abstract class ContribuyentePorcentajes extends Contribuyente{
    double porcentajePagar;
    double porcentajeAdcional;

    public double getPorcentajePagar() {
        return porcentajePagar;
    }

    public double getPorcentajeAdcional() {
        return porcentajeAdcional;
    }

    public void setPorcentajePagar(double porcentajePagar) {
        this.porcentajePagar = porcentajePagar;
    }

    public void setPorcentajeAdcional(double porcentajeAdcional) {
        this.porcentajeAdcional = porcentajeAdcional;
    }
    
    
    
    public abstract void asignarPorcentajesPorDefecto();
    
    public double doubleCuantoAporta(){
        return (this.getMontofijo()*this.getPorcentajePagar()*this.getPorcentajeAdcional());
    }
    
    public ContribuyentePorcentajes(String nombre,int codId,int montoFijo){
        super(nombre,codId,montoFijo);
        this.asignarPorcentajesPorDefecto();
    }
}
