/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej1;

/**
 *
 * @author ilari
 */
public class CondicionLargoSuperior extends Condicion{

    int largo;
    
    @Override
    public boolean cumple(Noticia n) {
        return n.getTexto().length()>largo;
    }

    public CondicionLargoSuperior(int largo) {
        this.largo = largo;
    }
    
    
    
}
