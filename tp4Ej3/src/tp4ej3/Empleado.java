/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4ej3;

/**
 *
 * @author ilari
 */
public class Empleado {
    private String nombre;
    private double salario;

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    public Empleado(String nombre){
        this(nombre,1000);
    }
    
    public double calcularSalario(){
        return this.getSalario();
    }
    
    public String toString(){
        return ("Nombre "+this.getNombre()+" Salario "+this.getSalario());
    }
    
    public Empleado(String nombre, double salario){
        this.setNombre(nombre);
        this.setSalario(salario);
    }
    
}
