/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8ej4;

import java.util.Comparator;

/**
 *
 * @author ilari
 */
public abstract class Comparador implements Comparator<Candidato>{

    @Override
    public abstract int compare(Candidato o1, Candidato o2);
    
}
