/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

/**
 *
 * @author ilari
 */
public class CondicionAnd extends Condicion{

    Condicion c1,c2;
    
    @Override
    public boolean cumple(Noticia n) {
        return c1.cumple(n)&&c2.cumple(n);
    }
    
    public CondicionAnd(Condicion c1,Condicion c2){
        this.c1=c1;
        this.c2=c2;
    }
    
}
