/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7ej1;

/**
 *
 * @author ilari
 */
public class CondicionDoble extends Condicion{
    Condicion con1;
    Condicion con2;
    
    public boolean cumple(AgroQuimico a){
        return (con1.cumple(a)&&con2.cumple(a));
    }
    
    
    public CondicionDoble(Condicion cond1,Condicion cond2){
        con1=cond1;
        con2=cond2;
    }
}
