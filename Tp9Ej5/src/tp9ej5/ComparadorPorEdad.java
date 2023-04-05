/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej5;

/**
 *
 * @author ilari
 */
public class ComparadorPorEdad extends Comparador{

    @Override
    public int compare(Empleado o1, Empleado o2) {
        int aux=o1.getEdad()-o2.getEdad();
        if(aux<0){
            return -1;
        }
        else if(aux>0){
            return 1;
        }
        return 0;
    }
    
}
