/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

/**
 *
 * @author ilari
 */
public class CondicionCategoriaIgual extends Condicion{

    String cat;
    
    @Override
    public boolean cumple(Noticia n) {
        return n.CategoriaIgual(cat);
    }
    
    public CondicionCategoriaIgual(String c){
        cat=c;
    }
    
}
