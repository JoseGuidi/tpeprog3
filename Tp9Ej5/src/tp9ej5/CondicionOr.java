/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej5;

/**
 *
 * @author ilari
 */
public class CondicionOr extends Condicion{

    Condicion c1;
    Condicion c2;
    
    @Override
    public boolean cumple(Empleado e) {
        return c1.cumple(e)||c2.cumple(e);
    }
    
    public CondicionOr(Condicion c1,Condicion c2){
        this.c1=c1;
        this.c2=c2;
    }
    
}
