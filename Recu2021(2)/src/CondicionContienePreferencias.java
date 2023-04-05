/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ilari
 */
public class CondicionContienePreferencias extends Condicion{

    String pref;
    
    @Override
    public boolean cumple(Habitacion h) {
        return h.contieneCaracteristica(pref);
    }

    public CondicionContienePreferencias(String pref) {
        this.pref = pref;
    }
    
}
