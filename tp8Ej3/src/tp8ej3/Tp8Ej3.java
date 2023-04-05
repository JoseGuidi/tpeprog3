/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp8ej3;

/**
 *
 * @author ilari
 */
public class Tp8Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buzon b=new Buzon();
        Buzon b2=new Buzon();
        Carta car2=new Carta();
        Barrio bar=new Barrio("l'veyron",b);
        car2.addRegalo("Moto");
        Niño tomas=new Niño(car2,bar,42542398);
        b2.addNiño(tomas);
        Carta car=new Carta();
        Niño nico=new Niño(car,bar,42542399);
        nico.addRegalo("Pc gamer");
        //System.out.println(nico);
        nico.introducirCarta();
        //System.out.println(b.porcentajeCartasPidenRegalo("Trozo carbon"));
        Localidad dx=new Localidad("dx");
        dx.addBarrio(bar);
        dx.addBuzon(b2);
        dx.insertarCarta(car2);
        //System.out.println(dx);
        //System.out.println(b);
        System.out.println(b2);
        System.out.println(dx.porcentajeCartasPidenRegalo("Moto"));
    }
    
}
