/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2ej2;

/**
 *
 * @author ilari
 */
public class Persona {
    private String nombre;
    private String apellido;
    private long telefono;
    private String email;

    
    public Persona(){
        this("N","N");
    }
    public Persona(String nombre,String apellido){
        this(nombre,apellido,0," ");
    }
    public Persona(String nombre,String apellido, long telefono,String email){
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        this.email=email;
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public long getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

  

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
}
