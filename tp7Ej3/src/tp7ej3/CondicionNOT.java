/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7ej3;

/**
 *
 * @author ilari
 */
public class CondicionNOT extends Condicion{
    Condicion c1;
    
    public boolean cumple(Planta p){
        return (!c1.cumple(p));
    }
    
    public CondicionNOT(Condicion c1){
        this.c1=c1;
    }
}
