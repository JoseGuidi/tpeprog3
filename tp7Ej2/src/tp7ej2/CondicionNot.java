/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7ej2;

/**
 *
 * @author ilari
 */
public class CondicionNot extends Condicion{
    Condicion c1;
    
    public boolean cumple(Documento doc){
        return (!c1.cumple(doc));
    }
    
    public CondicionNot(Condicion c1){
        this.c1=c1;
    }
}
