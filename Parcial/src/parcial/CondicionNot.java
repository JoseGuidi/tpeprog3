/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

/**
 *
 * @author ilari
 */
public class CondicionNot extends Condicion{
    Condicion c1;
    @Override
    public boolean cumple(Noticia n) {
        return !c1.cumple(n);
    }
    public CondicionNot(Condicion c){
        c1=c;
    }
}
