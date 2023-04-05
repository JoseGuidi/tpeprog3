/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ej6;

/**
 *
 * @author ilari
 */
public class TrabajoConocimientoTotal extends Trabajo{
    
    public boolean puedeEvaluar(Evaluador e){
        return (e.getConocimientos().containsAll(this.getPalabrasClave()));
    }
    
    public TrabajoConocimientoTotal(String nombre){
        super(nombre);
    }
    
}
