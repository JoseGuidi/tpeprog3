/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8ej1;

/**
 *
 * @author ilari
 */
public class CondicionCuotaInpaga extends Condicion{
    
    public boolean cumple(Socio s){
        return !(s.isUltimaCuotaPaga());
    }
    
}