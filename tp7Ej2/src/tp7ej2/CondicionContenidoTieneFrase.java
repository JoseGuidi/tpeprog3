/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7ej2;

/**
 *
 * @author ilari
 */
public class CondicionContenidoTieneFrase extends Condicion{
    String frase;
    
    public boolean cumple(Documento doc){
        return doc.contenidoTieneFrase(frase);
    }
    
    public CondicionContenidoTieneFrase(String frase){
        this.frase=frase;
    }
}
