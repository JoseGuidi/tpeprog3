/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7ej4;

/**
 *
 * @author ilari
 */
public class CondicionNot extends Condicion{
    Condicion c1;
    
    public boolean cumple(Ficha f){
        return !c1.cumple(f);
    }
    
    public CondicionNot(Condicion c1){
        this.c1=c1;
    }
}
