/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpeprog;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class Alumno extends ElementoU{

    String apellido;
    int dni;
    int edad;
    ArrayList<String>palabrasClave;

    @Override
    public String toString(){
        return nombre+" "+apellido+" "+dni;
    }
    
    @Override
    public boolean equals(Object o){
        Alumno al=(Alumno)o;
        return (nombre.equals(al.getNombre())&&(apellido.equals(al.getApellido()))&&(dni==al.getDni())&&edad==al.getEdad());
    }
    
    public Alumno(String nombre, String apellido, int dni, int edad) {
        super(nombre);
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        palabrasClave=new ArrayList();
    }

    public void addPalabra(String p){
        palabrasClave.add(p);
    }
    
    public ArrayList<String> getPalabrasClave(){
        return new ArrayList(palabrasClave);
    }
    

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    

    @Override
    public int obtenerCantidad() {
        return 1;
    }

    

    
    
    
    
}
