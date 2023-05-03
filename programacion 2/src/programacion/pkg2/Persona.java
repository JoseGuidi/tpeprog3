package programacion.pkg2;


import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Razor
 */
public class Persona {
    private String nombre,apellido;
    private LocalDate fnac;
    private long dni;
    private String sexo;
    private double altura,peso;
    
    private double minimoMasa=18.5;
    private double maximoMsa=25;
    
    public Persona(long dni){
        this(dni,"n","n");
    }
    public Persona(long dni, String nombre, String apellido){
        this(dni,nombre,apellido,"femenino");
    }
    public Persona(long dni,String nombre, String apellido, String sexo){
        this(dni,nombre,apellido,sexo, LocalDate.of(2000, 1,1));
    }
    public Persona(long dni,String nombre, String apellido, String sexo, LocalDate fnac){
        this(dni,nombre,apellido,sexo,fnac,1,1);
    }
    public Persona(long dni, String nombre, String apellido, String sexo, LocalDate fnac, double peso,double altura){
        if (dni<0){
            dni=0;
        }
        this.setDni(dni);
        this.nombre=nombre;
        this.apellido=apellido;
        this.fnac=fnac;
        this.sexo=sexo;
        this.peso=peso;
        this.altura=altura;
    }
    
    public long getDni(){
        return this.dni;
    }
    private void setDni(long dni){
        if (dni<0){
            dni=0;
        }
        this.dni=dni;
    }
    public void setNombre(String nombre){
        if((nombre!=null)&&(nombre.length()>1)&&(!nombre.equals("nico"))){
            this.nombre=nombre;
        }
    }
    public String getNombre(){
        return this.nombre;
    }
    public double indiceMasaCorporal(){
        return (this.getPeso()/this.getAltura*this.getAltura);
    }
    public boolean estaEnForma(){
        double masa=this.indiceMasaCorporal();
        return ((masa>this.minimoMasa)&&(masa<this.maximoMsa));
    }
}
