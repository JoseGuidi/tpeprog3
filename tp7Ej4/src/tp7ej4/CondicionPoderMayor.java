/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7ej4;

/**
 *
 * @author ilari
 */
public class CondicionPoderMayor extends Condicion{
    int poder;
    
    @Override
    public boolean cumple(Ficha f){
        return (f.poderMayor(poder));
    }
    
    public CondicionPoderMayor(int poder){
        this.poder=poder;
    }
}
