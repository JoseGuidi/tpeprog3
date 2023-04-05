/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8ej2;

/**
 *
 * @author ilari
 */
public class CondicionNombre extends Condicion{

    String palabra;

    public CondicionNombre(String palabra) {
        this.palabra = palabra;
    }
    
    
    
    @Override
    public boolean cumple(ElementoSa e) {
          return e.getNombre().contains(palabra);
    }
    
}
