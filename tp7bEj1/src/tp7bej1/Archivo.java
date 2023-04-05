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
public class Archivo extends ArchivoOdir{
    int peso;
    LocalDate fechaMod;

    @Override
    public void setNombre(String nombre){
        super.setNombre(nombre);
        this.fechaMod=LocalDate.now();
    }
    
    public String toString(){
        return super.toString()+"Fecha mod"+this.fechaMod;
    }
    
    public void setPeso(int peso) {
        this.peso = peso;
        this.fechaMod=LocalDate.now();
    }
    
    public Archivo(int peso,String nombre){
        this.setNombre(nombre);
        this.setPeso(peso);
        this.fechaCreacion=LocalDate.now();
        this.fechaMod=LocalDate.now();
    }
    
    @Override
    public int getPeso() {
        return this.peso; 
    }

    @Override
    public int getCantElementos() {
        return 1;
    }
    
}
