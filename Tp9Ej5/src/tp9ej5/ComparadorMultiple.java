/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej5;

/**
 *
 * @author ilari
 */
public class ComparadorMultiple extends Comparador{

    Comparador c1,c2;
    
    @Override
    public int compare(Empleado o1, Empleado o2) {
        int aux=c1.compare(o1, o2);
        if (aux==0){
            aux=c2.compare(o1, o2);
        }
        return aux;
    }
    
    public ComparadorMultiple(Comparador c1,Comparador c2){
        this.c1=c1;
        this.c2=c2;
    }
}
