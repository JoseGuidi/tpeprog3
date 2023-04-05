/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej4;

/**
 *
 * @author ilari
 */
public class ComparadorNroPoliza extends Comparador{

    @Override
    public int compare(Seguro o1, Seguro o2) {
        return o1.getPoliza().compareTo(o2.getPoliza());
    }
    
}
