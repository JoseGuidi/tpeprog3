/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej1;

/**
 *
 * @author ilari
 */
public class CondicionAutor extends Condicion{

    String nombreAutor;
    
    @Override
    public boolean cumple(Noticia n) {
        return n.getAutor().equals(nombreAutor);
    }

    public CondicionAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    
    
    
    
}
