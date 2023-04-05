/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej5;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class Notificacion {
    ArrayList<String>palabras;
    Empleado remitente;
    LocalDate fecha;
    public void addPalabra(String p){
        palabras.add(p);
        
    }
    
    public ArrayList<String> getPalabras(){
        return new ArrayList(palabras);
    }
    
    public Notificacion(Empleado remitente){
        palabras=new ArrayList();
        fecha=LocalDate.now();
        this.remitente=remitente;
    }
    
}
