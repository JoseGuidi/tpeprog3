/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tp8ej3;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public interface BuscadorCartas {
    public abstract ArrayList<Carta>buscar(Condicion c);
    
    public ArrayList<Carta> obtenerCartas();
    
    public double porcentajeCartasPidenRegalo(String r);
}
