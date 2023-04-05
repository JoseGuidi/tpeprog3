/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8ej1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author ilari
 */
public class Club {
    ArrayList<Socio>socios;
    
    public ArrayList<Socio> buscar(Condicion c,Comparator orden){
        ArrayList<Socio>filtrado=new ArrayList();
        for(int i=0;i<this.socios.size();i++){
            if(c.cumple(socios.get(i))){
                filtrado.add(socios.get(i));
            }
        }
       Collections.sort(socios, orden);
       Collections.reverse(socios);
       return socios;
    }
    
    public String toString(){
        return socios.toString();
    }
    
    public void addSocio(Socio s){
        socios.add(s);
    }
    
    public Club(){
        socios=new ArrayList();
    }
}
