/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

/**
 *
 * @author ilari
 */
public class CondicionContenidoTiene extends Condicion{

    String contenido;
    
    @Override
    public boolean cumple(Noticia n) {
        return n.contenidoContiene(contenido);
    }
    
    public CondicionContenidoTiene(String text){
        contenido=text;
    }
    
}
