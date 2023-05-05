/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tprecursividad;

import java.util.List;

/**
 *
 * @author Razor
 */
public class TpRecursividad {

    /**
     * @param args the command line arguments
     */
    
    public static void fibo(int num,int ant,int actual){
        if(num>=2){
            int res=ant+actual;
            System.out.println(res);
            actual=res;
            ant=actual;
            fibo(num-1,ant,actual);
        }
        else
            System.out.println(1);
    }
    
    public static String fiboNumber(int n){
        
        if(n<=1)
            return n+"";
        else{
            int a=(Integer.parseInt(fiboNumber(n-1)+Integer.parseInt(fiboNumber(n-2))));
            return (String.valueOf(a));
        }
    }
    
    public static String convertirAbinario(int numero){
        if(numero==0)
            return "";
        else
            return (numero%2+convertirAbinario(numero/2));
    }
    
    public static void main(String[] args) {
        
        fibo(5,1,1);
       
    }
    
}
