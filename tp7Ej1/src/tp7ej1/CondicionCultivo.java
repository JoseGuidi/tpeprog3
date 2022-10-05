/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7ej1;

/**
 *
 * @author ilari
 */
public class CondicionCultivo extends Condicion{
    Cultivo cultivo;
    
    public boolean cumple(AgroQuimico a){
        return cultivo.puedeSerUtil(a);
    }
    
    public CondicionCultivo(Cultivo c){
        cultivo=c;
    }
    
}
