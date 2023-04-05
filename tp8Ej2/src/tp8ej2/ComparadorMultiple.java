/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8ej2;

/**
 *
 * @author ilari
 */
public class ComparadorMultiple extends Comparador{

    Comparador c1;
    Comparador c2;

    public ComparadorMultiple(Comparador c1, Comparador c2) {
        this.c1 = c1;
        this.c2 = c2;
    }
    
    
    
    @Override
    public int compare(ElementoSa o1, ElementoSa o2) {
        int resultado=c1.compare(o1, o2);
        if (resultado==0){
            return c2.compare(o1, o2);
        }
        return resultado;
    }
    
}
