/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionalesejercico2;

/**
 *
 * @author ilari
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class CondicionalesEjercico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor1,valor2;
        try{
        System.out.println("Ingrese el primer valor");
        BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
        valor1=Integer.valueOf(entrada.readLine());
        System.out.println("Ingrese el segundo valor");
        valor2=Integer.valueOf(entrada.readLine());
        if(valor1>valor2){
           System.out.println("A");
       }
       else if((valor1%2==0)&&(valor2%2==0)){
           System.out.println("B");
       }
       else{
           System.out.println("C");
       }
        }
        catch(Exception e)
        {
    }

    }
}
