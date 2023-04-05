/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ej5;

/**
 *
 * @author ilari
 */
public class EmpleadoBasico extends Empleado{
    public final int salarioBase=15000;
    
    public double consultarSalario(){
        return(this.salarioBase);
    }
    
    public EmpleadoBasico(String nombre,String apellido, int dni ){
        super( nombre, apellido,  dni);
        this.setSueldo(salarioBase);
    }
    
}
