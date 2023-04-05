/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej1;

/**
 *
 * @author ilari
 */
public class CondicionPalabraClave extends Condicion{
    String palabra;
    @Override
    public boolean cumple(Noticia n) {
       return n.getListadoPalabras().contains(palabra);
    }

    
    
    public CondicionPalabraClave(String palabra) {
        this.palabra = palabra;
    }
    
}
