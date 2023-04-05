/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5ej5;

/**
 *
 * @author ilari
 */
public class Tp5Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmpleadoBasico nico=new EmpleadoBasico("Nico","Ilari",42542399);
        EmpleadoVentas manuel=new EmpleadoVentas("Manuel","Ferreira",45153698,10000,10);
        EmpleadoBonos juan=new EmpleadoBonos("Juan","Ortiz",19254369,10000,2,1000);
        juan.addVenta();
        juan.addVenta();
        manuel.addVenta(1000);
        System.out.println(juan.toString());
        System.out.println(manuel.toString());
        System.out.println(nico.toString());
    }
    
}
