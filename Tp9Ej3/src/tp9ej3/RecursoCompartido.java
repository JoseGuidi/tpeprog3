/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej3;

/**
 *
 * @author ilari
 */
public class RecursoCompartido extends Recurso{

    public RecursoCompartido(String nombre) {
        super(nombre);
    }
    
    @Override
    public boolean estaDisponible() {
        return true;
    }
    
}
