/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5ej2;

/**
 *
 * @author ilari
 */
public class Tp5Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno nico=new Alumno("Nico");
        Alumno ignacio=new Alumno("ignacio");
        nico.setFamiliar(ignacio);
        ignacio.setFamiliar(nico);
        nico.setCualidad("ser un peda");
        nico.setCualidad("ser un choto");
        CasaNormal a=new CasaNormal("casa enemiga",5);
        a.setCualidad("ser un peda");
        CasaEnemiga n=new CasaEnemiga("Nueva casa",5);
        n.addCasaEnemiga(a);
        n.setCualidad("ser un peda");
        //System.out.println(nico.toString());
        //System.out.println(ignacio.toString());
        n.addIntegrante(ignacio);
        
        n.entraAlaCasa(nico);
        System.out.println(n.toString());
    }
    
}
