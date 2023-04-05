/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7bej1;

import java.time.LocalDate;

/**
 *
 * @author ilari
 */
public class Link extends ArchivoSo{
    ArchivoOdir referencia;
    public static final int PESO=1;

    public Link(String nombre, ArchivoOdir referencia){
        this.referencia=referencia;
        this.setNombre(nombre);
        this.fechaCreacion=LocalDate.now();
    }
    
    public String toString(){
        return super.toString()+"Referencia"+referencia.toString();
    }
    
    @Override
    public int getCantElementos() {
       return 1;
    }

    @Override
    public int getPeso() {
        return PESO;
    }
    
    
}
