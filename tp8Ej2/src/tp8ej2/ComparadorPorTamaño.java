/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8ej2;

/**
 *
 * @author ilari
 */
public class ComparadorPorTamaño extends Comparador{

    @Override
    public int compare(ElementoSa o1, ElementoSa o2) {
        return (int) (o1.getPeso()-o2.getPeso());
    }
    
}
