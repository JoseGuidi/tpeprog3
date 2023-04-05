/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8ej1;

import java.util.Comparator;

/**
 *
 * @author ilari
 */
public class ComparadorTotalAlquileresCancha implements Comparator<Socio>{

    int idCancha;
    
    public ComparadorTotalAlquileresCancha(int id){
        idCancha=id;
    }
    
    @Override
    public int compare(Socio o1, Socio o2) {
        //System.out.println(o1.obtenerTotalAlquileres(idCancha)-o2.obtenerTotalAlquileres(idCancha));
        return o1.obtenerTotalAlquileres(idCancha)-o2.obtenerTotalAlquileres(idCancha);
    }
    
}
