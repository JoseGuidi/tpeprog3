/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8ej4;

/**
 *
 * @author ilari
 */
public class ComparadorAgrupacion extends Comparador{

    @Override
    public int compare(Candidato o1, Candidato o2) {
        return o1.getAgrupacion().compareTo(o2.getAgrupacion());
    }
    
}
