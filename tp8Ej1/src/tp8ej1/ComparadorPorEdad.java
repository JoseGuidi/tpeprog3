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
public class ComparadorPorEdad implements Comparator<Socio>{

    @Override
    public int compare(Socio o1, Socio o2) {
        return (o1.getEdad()-o2.getEdad());
    }
    
}
