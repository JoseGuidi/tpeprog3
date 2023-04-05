/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ilari
 */
public class CondicionOr extends Condicion{

    Condicion c1,c2;
    
    @Override
    public boolean cumple(Habitacion h) {
        return c1.cumple(h)||c2.cumple(h);
    }

    public CondicionOr(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }
    
}
