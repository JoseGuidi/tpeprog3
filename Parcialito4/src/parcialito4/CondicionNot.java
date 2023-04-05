/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialito4;

/**
 *
 * @author ilari
 */
public class CondicionNot extends Condicion{
    Condicion c1;
    
    
    public CondicionNot(Condicion c1){
        this.c1=c1;
    }

    @Override
    public boolean cumple(Proveedor p) {
       return !c1.cumple(p);
    }
}
