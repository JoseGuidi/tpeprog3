/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej5;

/**
 *
 * @author ilari
 */
public class PropagadorContiene extends Propagador{

    String palabra;
    
    @Override
    public boolean cumple(Notificacion n) {
        return n.getPalabras().contains(palabra);
    }
    
    public PropagadorContiene(String palabra){
        this.palabra=palabra;
    }
    
}
