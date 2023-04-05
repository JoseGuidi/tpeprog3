/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej5;

/**
 *
 * @author ilari
 */
public class CondicionNotCantPalabras extends Condicion{

    int cantpal;
    
    @Override
    public boolean cumple(Empleado e) {
        boolean tiene=false;
        for(Notificacion n:e.getNot()){
            if(n.getPalabras().size()<cantpal){
                tiene=true;
            }
        }
        return tiene;
    }
    
    
    public CondicionNotCantPalabras(int cant){
        cantpal=cant;
    }
}
