/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tprecursividad;

/**
 *
 * @author Razor
 */
public class TpRecursividad {

    /**
     * @param args the command line arguments
     */
    
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
        String a=convertirAbinario(26);
        String b=fiboNumber(5);
        
        System.out.println(b);
    }
    
}
