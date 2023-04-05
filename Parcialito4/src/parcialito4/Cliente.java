/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialito4;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class Cliente {
    String nombre;
    String apellido;
    int edad;
    ArrayList<String> preferencias;

    public Cliente(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.preferencias=new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
    
    public void SetEdad(int edad){
        this.edad=edad;
    }
    
    public void addPreferencia(String pref){
        preferencias.add(pref);
    }
}
