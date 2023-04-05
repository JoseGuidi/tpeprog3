/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7ej2;

/**
 *
 * @author ilari
 */
public class CondicionOr extends Condicion{
    Condicion con1;
    Condicion con2;
    
    public boolean cumple(Documento doc){
        return (con1.cumple(doc)||con2.cumple(doc));
    }
    
    public CondicionOr(Condicion c1,Condicion c2){
        con1=c1;
        con2=c2;
    }
}
