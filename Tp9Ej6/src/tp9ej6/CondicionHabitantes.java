/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej6;

/**
 *
 * @author ilari
 */
public class CondicionHabitantes extends Condicion{

    int habitantes;
    
    @Override
    public boolean cumple(Comarca e) {
        return e.getCantHabitantes()>habitantes;
    }
    
    
    public CondicionHabitantes(int hab){
        habitantes=hab;
    }
}
