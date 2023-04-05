/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4ej3;

/**
 *
 * @author ilari
 */
public class Tp4Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado jorge=new Empleado("Jorge",1000);
        System.out.println(jorge.toString());
        System.out.println(jorge.calcularSalario());
        EmpleadoHorasExtra juan=new EmpleadoHorasExtra("Juan",100,2,1000);
        System.out.println(juan.toString());
        System.out.println(juan.calcularSalario());
        EmpleadoComision pedro=new EmpleadoComision("pedro",2,5,1000);
        System.out.println(pedro.toString());
        System.out.println(pedro.calcularSalario());
    }
    
}
