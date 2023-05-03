/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionalespractico;

/**
 *
 * @author ilari
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class CondicionalesPractico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor;
        try{
            System.out.println("Ingresar un entero");
            BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
            valor=Integer.valueOf(entrada.readLine());
            switch (valor){
                case 0:{
                    System.out.println("No master un 0 no");
                }
                default:{
                    if(valor>0){
                        System.out.println("Positivo");
                        if(valor>100){
                            System.out.println("Re grande master");
                        }
                        else if(valor<100){
                            System.out.println("Chico");
                        }
                    }
                    else{
                        if(valor%2==0){
                            System.out.println("Es multiplo de 2");
                        }
                        else if(valor%3==0){
                            System.out.println("Es multiplo de 3");
                        }
                        else{
                            System.out.println("Ninguna de las opciones");
                        }
                    }
                }
            }
        }
        catch(Exception e){
            System.out.println("Algo rompiste");
        }
    }
    
}
