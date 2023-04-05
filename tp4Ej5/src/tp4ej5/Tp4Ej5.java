/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4ej5;

import java.util.Date;

/**
 *
 * @author ilari
 */
public class Tp4Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewClassProductoCongeladoNitrogeno milanga=new NewClassProductoCongeladoNitrogeno("granos de maíz",1,new Date(),new Date(),"La granja de jose",5,8001,"A lo nasi",55);
        System.out.println(milanga.toString());
    }
    
}
