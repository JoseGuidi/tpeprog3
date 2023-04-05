/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ej5;

/**
 *
 * @author ilari
 */
public abstract class Empleado {
    String nombre;
    String apellido;
    int dni;
    int sueldo;
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public int getSueldo() {
        return sueldo;
    }
    
    
    
    public abstract double consultarSalario();
    
    public String toString(){
        return("Nombre "+this.getNombre()+" Apellido "+this.getApellido()+" Dni "+this.getDni()+" Sueldo "+this.consultarSalario());
    }
    
    public Empleado(String nombre,String apellido, int dni){
        this.setDni(dni);
        this.setNombre(nombre);
        
        this.setApellido(apellido);
    }
    
    public Empleado(String nombre,String apellido, int dni,int sueldo ){
        this.setDni(dni);
        this.setNombre(nombre);
        this.setSueldo(sueldo);
        this.setApellido(apellido);
    }
}
