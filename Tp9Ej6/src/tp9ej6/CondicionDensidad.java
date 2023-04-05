/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej6;

/**
 *
 * @author ilari
 */
public class CondicionDensidad extends Condicion{

    double densidad;
    
    @Override
    public boolean cumple(Comarca e) {
        return e.densidadPoblacional()>densidad;
    }
    
    public CondicionDensidad(double den){
        densidad=den;
    }
    
}
