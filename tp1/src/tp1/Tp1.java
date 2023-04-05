/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1;

/**
 *
 * @author ilari
 */
public class Tp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       PuntoGeométrico p1= new PuntoGeométrico(1,1);
       RectanguloLados rect=new RectanguloLados(p1);
       System.out.println(rect.obtenerComoEstaParado());
       
       
    }
    
}
