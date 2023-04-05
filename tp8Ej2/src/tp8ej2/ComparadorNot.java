/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8ej2;

/**
 *
 * @author ilari
 */
public class ComparadorNot extends Comparador{

    Comparador c1;
    
    @Override
    public int compare(ElementoSa o1, ElementoSa o2) {
        return -1*c1.compare(o1, o2);
    }

    public ComparadorNot(Comparador c1) {
        this.c1 = c1;
    }
    
    
    
}
