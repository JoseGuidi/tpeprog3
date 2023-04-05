/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3ej3;

/**
 *
 * @author ilari
 */
public class Tp3Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personaje razor=new Personaje("Nico", "Razor",true);
        Personaje fozter=new Personaje("Choni","fozter",false);
        System.out.println(razor.toString());
        System.out.println(fozter.toString());
        Juego j=new Juego(razor,fozter);
        System.out.println(j.jugar());
        
    }
    
}
