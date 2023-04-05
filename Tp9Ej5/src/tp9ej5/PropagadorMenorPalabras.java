/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej5;

/**
 *
 * @author ilari
 */
public class PropagadorMenorPalabras extends Propagador{

    int cantidad;
    
    @Override
    public boolean cumple(Notificacion n) {
        return n.getPalabras().size()<cantidad;
    }
    
    public PropagadorMenorPalabras(int cantidad){
        this.cantidad=cantidad;
    }
}
