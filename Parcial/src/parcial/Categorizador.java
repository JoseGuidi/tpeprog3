/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class Categorizador {
    Condicion c;
    ArrayList<String>palabrasClave;

    public ArrayList<String> getPalabrasClave(){
        return new ArrayList(palabrasClave);
    }
    
    public void addPalabraClave(String p){
        palabrasClave.add(p);
    }
    
    public Categorizador(Condicion c) {
        palabrasClave=new ArrayList();
        this.c = c;
    }
    
    public boolean cumple(Noticia n){
        return c.cumple(n);
    }
    
}
