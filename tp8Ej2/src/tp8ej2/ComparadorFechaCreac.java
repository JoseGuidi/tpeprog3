/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8ej2;

/**
 *
 * @author ilari
 */
public class ComparadorFechaCreac extends Comparador{

    @Override
    public int compare(ElementoSa o1, ElementoSa o2) {
        return o1.getFecha().compareTo(o2.getFecha());
        
    }
}
