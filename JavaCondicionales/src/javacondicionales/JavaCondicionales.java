/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacondicionales;

/**
 *
 * @author ilari
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class JavaCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor;
        try{
        System.out.println("Ingresar un digito");
        BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
        valor=Integer.valueOf(entrada.readLine());
        System.out.println("El valor fue "+ valor);
        }
        catch(Exception e){
            System.out.println("No ingreso un digit");
        }
    }
    
}
