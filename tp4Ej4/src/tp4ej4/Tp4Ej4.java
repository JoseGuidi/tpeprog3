/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4ej4;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ilari
 */
public class Tp4Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estado normal=new Estado();
        Date fechanac=new Date(100,7,28);
        Masajista nico=new Masajista("Nico","Ilari",24,"Un peda del masaje",5);
        Futbolista pablo=new Futbolista("Pablo","El peda",5,1);
        ArrayList<Persona> personas=new ArrayList<Persona>();
        personas.add(nico);
        personas.add(pablo);
        for(int i=0;i<personas.size();i++){
            System.out.println(personas.get(i).toString());
        }
    }
    
}
