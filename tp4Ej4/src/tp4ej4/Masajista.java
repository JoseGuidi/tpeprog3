/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4ej4;

import java.util.Date;

/**
 *
 * @author ilari
 */
public class Masajista extends Persona{
    String titulo;
    int cantAños;

    public String getTitulo() {
        return titulo;
    }

    public int getCantAños() {
        return cantAños;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCantAños(int cantAños) {
        this.cantAños = cantAños;
    }
    
    public String toString(){
        return (super.toString()+ " Titulo "+this.getTitulo()+" Cant años "+this.getCantAños());
    }
    public Masajista(String nombre, String apellido, int numpas,String titulo,int cantaños){
        this(nombre,apellido,numpas,new Date(),new Estado(),titulo,cantaños);
    }
    public Masajista (String nombre, String apellido, int numpas,Date fechanac,Estado estado,String titulo,int cantaños){
        super(nombre,apellido,numpas,fechanac,estado);
        this.setCantAños(cantaños);
        this.setTitulo(titulo);
    }
}
