/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ilari
 */
public class CondicionNot extends Condicion{
    Condicion c1;
    @Override
    public boolean cumple(Habitacion h) {
        return !c1.cumple(h);
    }

    public CondicionNot(Condicion c1) {
        this.c1 = c1;
    }
    
}
