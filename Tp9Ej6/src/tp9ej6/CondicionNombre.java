/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej6;

/**
 *
 * @author ilari
 */
public class CondicionNombre extends Condicion{

    String nombre;
    
    @Override
    public boolean cumple(Comarca e) {
        return e.getNombre().equals(nombre);
    }
    
    public CondicionNombre(String nom){
        nombre=nom;
    }
    
}
