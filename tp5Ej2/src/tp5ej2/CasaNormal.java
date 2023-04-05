/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ej2;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class CasaNormal extends Casa{
    
    @Override
    public boolean cumpleCondAdicionales(Alumno al){
        return true;
    }
    
    public CasaNormal(String nombre,int cantmax){
        super(nombre,cantmax);
    }
    
}
