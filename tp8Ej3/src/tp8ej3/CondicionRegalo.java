/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8ej3;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class CondicionRegalo extends Condicion{
    String regalo;
    @Override
    public boolean cumple(BuscadorCartas b) {
        boolean cumple=false;
        ArrayList<Carta> cartas=new ArrayList();
        cartas.addAll(b.obtenerCartas());
        for(Carta c:cartas){
            if(c.ContieneRegalo(regalo)){
                cumple=true;
            }
        }
        return cumple;
    }
    
    public CondicionRegalo(String regalo){
        this.regalo=regalo;
    }
    
}
