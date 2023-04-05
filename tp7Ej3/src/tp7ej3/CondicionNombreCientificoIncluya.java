/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7ej3;

/**
 *
 * @author ilari
 */
public class CondicionNombreCientificoIncluya extends Condicion{
    String nombre;
    
    public boolean cumple(Planta p){
        return p.nombreCientificoContienePalabra(nombre);
    }
    
    public CondicionNombreCientificoIncluya(String nombre){
        this.nombre=nombre;
    }
}
