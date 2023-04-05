/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2ej3;

/**
 *
 * @author ilari
 */
public class ContribuyenteComerciante extends ContribuyentePorcentajes{
    public void asignarPorcentajesPorDefecto(){
        this.setPorcentajeAdcional(1.035);
        this.setPorcentajePagar(0.5);
    }
    
    public ContribuyenteComerciante(String nombre,int codId,int montoFijo){
        super(nombre,codId,montoFijo);
    }
}
