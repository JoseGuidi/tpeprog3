/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionalesejercicio3;

/**
 *
 * @author ilari
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class CondicionalesEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        try{
        System.out.println("Ingrese un numero");
        BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
        numero=Integer.valueOf(entrada.readLine());
        if((numero%6==0)&&(numero%7==0)){
            System.out.println("Es multipo de 6 y 7");
        }
        else if((numero>30)&&(numero%2==0)){
            System.out.println("Mayor a 30 y multiplo de 2");
        }
        if (numero/5>10){
            System.out.println("Cociente mayor a 10");
        }  
        }
        catch(Exception e){
            System.out.println("Que haces master");
        }
    }
    
}
