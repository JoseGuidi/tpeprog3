/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7ej3;

/**
 *
 * @author ilari
 */
public class CondicionClasificacion extends Condicion{
    String clasificacion;
    
    public boolean cumple(Planta p){
        return p.esDeClasificacion(clasificacion);
    }
    
    
    public CondicionClasificacion(String clasificacion){
        this.clasificacion=clasificacion;
    }
    
}
