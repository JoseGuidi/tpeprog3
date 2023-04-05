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
public class Directorio extends ArchivoOdir{

    ArrayList<ArchivoSo> archivos;
    
        public Directorio(String nombre){
        this.setNombre(nombre);
        this.fechaCreacion=LocalDate.now();
        this.archivos=new ArrayList();
    }
    
    public String toString(){
        return super.toString()+archivos.toString()+"-"+"cantidad elementos "+this.getCantElementos();
    }
        
    public void addArchivo(ArchivoSo ar){
        this.archivos.add(ar);
    }
    
    public int getCantElementos(){
        int cant =1;
        for(int i=0;i<archivos.size();i++){
            cant+=archivos.get(i).getCantElementos();
        }
        return cant;
    }
    
    
    @Override
    public int getPeso() {
        int peso=0;
        for (int i=0;i<archivos.size();i++){
            peso+=archivos.get(i).getPeso();
        }
        return peso;
    }
    
}
