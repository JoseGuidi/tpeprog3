/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7ej4;

/**
 *
 * @author ilari
 */
public class CondicionMayorLugares extends Condicion{
    int lugar;
    
    @Override
    public boolean cumple(Ficha f){
        return f.espacioMayor(lugar);
    }
    public CondicionMayorLugares(int lugar){
        this.lugar=lugar;
    }
}
