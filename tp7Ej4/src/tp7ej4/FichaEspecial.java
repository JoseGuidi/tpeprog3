/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7ej4;

/**
 *
 * @author ilari
 */
public class FichaEspecial extends Ficha{
    
    
    
    public FichaEspecial(String nombre,int golpes,int espacio){
        super(nombre,golpes,espacio,(((double)golpes)/(espacio)));
       
    }
}
