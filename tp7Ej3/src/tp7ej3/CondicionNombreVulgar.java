/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7ej3;

/**
 *
 * @author ilari
 */
public class CondicionNombreVulgar extends Condicion{
    String nombre;
    
    public boolean cumple(Planta p){
        return p.nombreSeConoceComo(nombre);
    }
    
    public CondicionNombreVulgar(String nombre){
        this.nombre=nombre;
    }
}
