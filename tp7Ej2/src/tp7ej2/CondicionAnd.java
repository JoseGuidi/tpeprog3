/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7ej2;

/**
 *
 * @author ilari
 */
public class CondicionAnd extends Condicion{
    Condicion c1;
    Condicion c2;
    
    public boolean cumple(Documento doc){
        return (c1.cumple(doc)&&c2.cumple(doc));
    }
    
    public CondicionAnd(Condicion c1,Condicion c2){
        this.c1=c1;
        this.c2=c2;
    }
}
