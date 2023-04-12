/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triangulo;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author ilari
 */
public class Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double lado1,lado2,lado3;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Inrgesar el lado 1");
            lado1=Double.valueOf(entrada.readLine());
            System.out.println("Inrgesar el lado 2");
            lado2=Double.valueOf(entrada.readLine());
            System.out.println("Inrgesar el lado 3");
            lado3=Double.valueOf(entrada.readLine());
            System.out.println("Los valores de los lados fueron " +lado1+" "+lado2+" "+lado3);
            
        }
        catch(Exception e){
            
        }
        
    }
 
}
