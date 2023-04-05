/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp8ej1;

/**
 *
 * @author ilari
 */
public class Tp8Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Club sanmartin=new Club();
       Socio jorge=new Socio("jorge","rial",55,true);
       Socio diego=new Socio("diego","peretti",60,true);
       Socio ignacio=new Socio("ignacio","petrelli",80,true);
       Alquiler cancha2=new Alquiler(2,600);
       diego.addAlquiler(cancha2);
       diego.addAlquiler(cancha2);
       ignacio.addAlquiler(cancha2);
       jorge.addAlquiler(cancha2);
       sanmartin.addSocio(diego);
       sanmartin.addSocio(ignacio);
       sanmartin.addSocio(jorge);
       Condicion c=new CondicionCuotaInpaga();
       //System.out.println(diego.obtenerTotalAlquileres(2));
       System.out.println(sanmartin.buscar(c,new ComparadorPorEdad()));
    }
    
}
