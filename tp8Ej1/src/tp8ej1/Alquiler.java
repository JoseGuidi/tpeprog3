/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8ej1;

import java.time.LocalDate;

/**
 *
 * @author ilari
 */
public class Alquiler {
    LocalDate fecha;
    int idCancha;
    int valorAlquiler;

    public String toString(){
        return fecha+"-"+idCancha+"-"+valorAlquiler;
    }
    
    public Alquiler(int idCancha,int valorAlquiler){
        this.idCancha=idCancha;
        this.valorAlquiler=valorAlquiler;
        this.fecha=LocalDate.now();
    }
    
    public LocalDate getFecha() {
        return fecha;
    }

    public int getIdCancha() {
        return idCancha;
    }

    public int getValorAlquiler() {
        return valorAlquiler;
    }
    
    
    
}
