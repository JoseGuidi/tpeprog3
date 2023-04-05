/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2ej3;

/**
 *
 * @author ilari
 */
public class ContribuyenteProgramador extends ContribuyentePorcentajes{
    public void asignarPorcentajesPorDefecto(){
        this.setPorcentajeAdcional(1.02);
        this.setPorcentajePagar(0.2);
    }
    
    public String toString(){
        return(super.toString()+" Porcentaje adicional "+this.getPorcentajeAdcional()+" Porcentaje a pagar "+this.getPorcentajePagar());
    }
    
    public ContribuyenteProgramador(String nombre,int codId,int montoFijo){
        super(nombre,codId,montoFijo);
        
    }
}
