/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

/**
 *
 * @author ilari
 */
public class CondicionTituloContenga extends Condicion{

    String palabra;
    
    @Override
    public boolean cumple(Noticia n) {
        return n.tituloContiene(palabra);
    }
    
    public CondicionTituloContenga(String p){
        palabra=p;
    }
    
}
