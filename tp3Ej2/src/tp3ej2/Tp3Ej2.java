/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3ej2;

/**
 *
 * @author ilari
 */
public class Tp3Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mueble silla=new Mueble("Silla",10,100,"Negra","Pino");
        Mueble mesa=new Mueble("Silla",10,100,"Negra","Pino");
        Mueble banco=new Mueble("Mesa",13,135,"Negra","Pino");
        FabricaDeMuebles f=new FabricaDeMuebles(3,3,3,silla,banco,mesa);
        
    }
    
}
