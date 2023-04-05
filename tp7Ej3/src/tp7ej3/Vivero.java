/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7ej3;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class Vivero {
    ArrayList<Planta>plantas;
    
    
    public ArrayList buscar(Condicion c){
        ArrayList<Planta> filtrados = new ArrayList<>();
        for(int i=0;i<plantas.size();i++){
            if(c.cumple(plantas.get(i))){
                filtrados.add(plantas.get(i));
            }
        }
        return filtrados;
    }
    
    public void addPlanta(Planta p){
        plantas.add(p);
    }
    
    public Vivero(){
        plantas=new ArrayList<>();
    }
    public static void main(String args[]){
        Vivero viverito=new Vivero();
        Planta potus=new Planta("Epipremnum aureum","Epipremnum","Araceae","Monocotyledoneae",true,3,4);
        potus.addNombreVulgar("potus");
        potus.addNombreVulgar("pothos");
        viverito.addPlanta(potus);
        Condicion c=new CondicionPocoRiego();
        Condicion c2=new CondicionClasificacion("Epipremnum");
        Condicion c3=new CondicionOr(c,c2);
        Condicion c4=new CondicionNOT(c3);
        System.out.println(viverito.buscar(c3));
    }
}
