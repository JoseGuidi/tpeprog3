/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7ej3;

/**
 *
 * @author ilari
 */
public class CondicionPocoRiego extends Condicion{
    public static final int pocoRiego=3;
    
    public boolean cumple(Planta p){
        return p.requiereNivelDeRiegoInferior(pocoRiego);
    }
    
    public CondicionPocoRiego(){
        
    }
}
