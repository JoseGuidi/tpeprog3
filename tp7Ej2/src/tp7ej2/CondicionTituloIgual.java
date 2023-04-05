/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7ej2;

/**
 *
 * @author ilari
 */
public class CondicionTituloIgual extends Condicion{
    String titulo;
    
    public boolean cumple(Documento doc){
        return doc.tituloEsIgual(titulo);
    }
    
    public CondicionTituloIgual(String titulo){
        this.titulo=titulo;
    }
}
