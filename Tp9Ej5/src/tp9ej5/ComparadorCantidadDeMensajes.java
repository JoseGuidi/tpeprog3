/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej5;

/**
 *
 * @author ilari
 */
public class ComparadorCantidadDeMensajes extends Comparador{

    @Override
    public int compare(Empleado o1, Empleado o2) {
        int aux=o1.getNot().size()-o2.getNot().size();
        if (aux>0){
            return 1;
        }
        else if(aux<0){
            return -1;
        }
        return 0;
    }
    
}
