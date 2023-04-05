/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpeprog;

/**
 *
 * @author ilari
 */
public class CriterioDniAlumno extends Criterio{

    @Override
    public int compare(Object o1, Object o2) {
        Alumno a1=(Alumno)o1;
        Alumno a2=(Alumno)o2;
        int aux = a1.getDni()-a2.getDni();
        if(aux<0)
            aux=-1;
        else if(aux>0)
            aux=1;
        
        return aux;
    }
    
}
