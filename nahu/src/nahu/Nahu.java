/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nahu;

/**
 *
 * @author ilari
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Nahu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int entero1;
    int cociente;
    boolean cond1,cond2,cond3;
    try{
      BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Ingrese un valor entero: ");
      entero1= Integer.valueOf(entrada.readLine());
      cociente=(entero1/5);
      cond1=(((entero1%6)==0)&&(entero1%7)==0);
      cond2=(((entero1>30)&&((entero1%2)==0))||(entero1<=30));
      cond3=(cociente>10);
      System.out.println("Resultado condicion 1: "+cond1);
      System.out.println("Resultado condicion 2: "+cond2);
      System.out.println("Resultado condicion 3: "+cond3);
    }
   catch(Exception exc){
     System.out.println(exc);
   }
    }
    
}
