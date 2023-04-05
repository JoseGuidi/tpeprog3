/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ilari
 */
public class CondicionLibre extends Condicion{

    @Override
    public boolean cumple(Habitacion h) {
        return h.estaDisponible();
    }
    
}
