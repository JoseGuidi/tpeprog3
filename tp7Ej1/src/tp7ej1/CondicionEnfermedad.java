/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7ej1;

/**
 *
 * @author ilari
 */
public class CondicionEnfermedad extends Condicion{
    Enfermedad enfermedad;
    
    public boolean cumple(AgroQuimico a){
        return (a.tieneTodasPatologias(enfermedad.getPatologias()));
    }
    
    public CondicionEnfermedad(Enfermedad e){
        enfermedad=e;
    }
    
    
}
