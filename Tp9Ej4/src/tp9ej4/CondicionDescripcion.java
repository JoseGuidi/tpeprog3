/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej4;

/**
 *
 * @author ilari
 */
public class CondicionDescripcion extends Condicion{

    String descripcion;
    
    @Override
    public boolean cumple(Seguro s) {
        return s.getDescripcion().contains(descripcion);
    }
    
    public CondicionDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    
}
