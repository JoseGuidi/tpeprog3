/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6ej1;

/**
 *
 * @author ilari
 */
public class Tp6Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VideoClubAutos v=new VideoClubAutos();
        Cliente c1=new Cliente("Pepe");
        Item i1=new Pelicula("El tunel",0);
        v.addCliente(c1);
        v.addItem(i1);
        v.getClientes().get(0).alquilar(i1);
        System.out.println(v.obtenerAlquileresCliente(c1));
    }
    
}
