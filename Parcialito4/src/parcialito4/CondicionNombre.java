/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialito4;

/**
 *
 * @author ilari
 */
public class CondicionNombre extends Condicion{

    String nombre;
    
    @Override
    public boolean cumple(Proveedor p) {
        return nombre.equalsIgnoreCase(p.getNombreEmpresa());
    }
    
    public CondicionNombre(String nombre){
        this.nombre=nombre;
    }
    
}
