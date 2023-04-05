/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ilari
 */
public class CondicionMetrosMayor extends Condicion{
    int metros;
    @Override
    public boolean cumple(Habitacion h) {
        return h.obtenerMetros()>metros;
    }

    public CondicionMetrosMayor(int metros) {
        this.metros = metros;
    }
    
}
