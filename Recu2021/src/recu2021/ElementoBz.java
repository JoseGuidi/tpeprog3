/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recu2021;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public abstract class ElementoBz {
    
    public abstract int getPrecio();
    public abstract int getPeso();
    public abstract ArrayList<String> getCategoria();
    public abstract int getCant();
    public abstract ArrayList<ElementoBz> buscar(Condicion c);
    public abstract ElementoBz copia();
}
