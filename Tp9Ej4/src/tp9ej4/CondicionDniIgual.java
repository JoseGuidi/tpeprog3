/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej4;

/**
 *
 * @author ilari
 */
public class CondicionDniIgual extends Condicion{

    String dni;
    
    @Override
    public boolean cumple(Seguro s) {
        return s.getDni().equals(dni);
    }
    
    public CondicionDniIgual(String dni){
        this.dni=dni;
    }
    
}
