/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7ej2;

/**
 *
 * @author ilari
 */
public class CondicionTituloContieneUnaPalabra extends Condicion{
    String palabra;
    
    
    public boolean cumple(Documento doc){
        return doc.tituloContienePalabra(palabra);
    }
    
    public CondicionTituloContieneUnaPalabra(String palabra){
     this.palabra=palabra;
    }
}
