/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej5;

/**
 *
 * @author ilari
 */
public class CondicionNotContienePalabra extends Condicion{

    String palabra;
    
    @Override
    public boolean cumple(Empleado e) {
        boolean tiene=false;
        for(Notificacion n:e.getNot()){
            if(n.getPalabras().contains(palabra)){
                tiene=true;
            }
        }
        return tiene;
    }
    
    public CondicionNotContienePalabra(String pal){
        palabra=pal;
    }
    
}
