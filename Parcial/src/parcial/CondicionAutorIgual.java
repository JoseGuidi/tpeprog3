/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

/**
 *
 * @author ilari
 */
public class CondicionAutorIgual extends Condicion{

    String autor;
    
    @Override
    public boolean cumple(Noticia n) {
        return n.AutorIgual(autor);
    }
    
    public CondicionAutorIgual(String aut){
        autor=aut;
    }
    
}
