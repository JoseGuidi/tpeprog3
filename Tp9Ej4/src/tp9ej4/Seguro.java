/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej4;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ilari
 */
public abstract class Seguro {
    public abstract String getDni();
    public abstract String getPoliza();
    public abstract double getMonto();
    public abstract ArrayList<Seguro> buscar(Condicion c);
    public ArrayList<Seguro> buscar(Condicion c, Comparador com) {
        ArrayList<Seguro>seguros=this.buscar(c);
        Collections.sort(seguros, com);
        return seguros;
    }
    public abstract String getDescripcion();
}
