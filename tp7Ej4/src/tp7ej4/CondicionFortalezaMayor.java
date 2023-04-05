/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7ej4;

/**
 *
 * @author ilari
 */
public class CondicionFortalezaMayor extends Condicion{
    int fortaleza;
    
    public boolean cumple(Ficha f){
        return f.fortalezaMayor(fortaleza);
    }
    
    public CondicionFortalezaMayor(int fort){
        fortaleza=fort;
    }
    
    
}
