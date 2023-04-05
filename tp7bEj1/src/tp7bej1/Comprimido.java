/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7bej1;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class Comprimido extends ArchivoSo{
    ArrayList<ArchivoOdir> elementos;
    double tazaCompresion;

    public double getTazaCompresion() {
        return tazaCompresion;
    }
    
    public void addArchivo(ArchivoOdir a){
        this.elementos.add(a);
    }
    
    public String toString(){
        return super.toString()+elementos.toString()+"-"+"Taza compresion"+this.tazaCompresion;
    }
    
    public Comprimido(String nombre,double tazaCompresion){
        this.fechaCreacion=LocalDate.now();
        this.nombre=nombre;
        this.tazaCompresion=tazaCompresion;
        this.elementos=new ArrayList();
    }
    @Override
    public int getCantElementos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getPeso() {
        int peso=0;
        for (int i=0;i<elementos.size();i++){
            peso+=elementos.get(i).getPeso();
        }
        return (int)(peso*tazaCompresion);
    }
    
}
