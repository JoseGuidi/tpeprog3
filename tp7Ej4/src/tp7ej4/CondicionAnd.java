/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7ej4;

/**
 *
 * @author ilari
 */
public class CondicionAnd extends Condicion{
    Condicion c1;
    Condicion c2;
    
    public boolean cumple(Ficha f){
        return (c1.cumple(f)&&c2.cumple(f));
    }
    
    public CondicionAnd(Condicion c1,Condicion c2){
        this.c1=c1;
        this.c2=c2;
    }
}
