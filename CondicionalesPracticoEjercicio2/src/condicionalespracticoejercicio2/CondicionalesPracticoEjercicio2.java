/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionalespracticoejercicio2;

/**
 *
 * @author ilari
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CondicionalesPracticoEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char valor;
        try{
        System.out.println("Ingresar el char");
        BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
        valor=entrada.readLine().charAt(0);
        if ((valor>='0')&&(valor<='9')){
            System.out.println("Es un digito");
        }
        else if((valor>='a')&&(valor<='z')){
            
            switch(valor){
                case 'a': case 'e': case 'o': case 'i': case 'u':{
                    System.out.println("Fue minuscula "+valor);
                    break;
                }
                default:{
                    System.out.println("Fue minuscula "+valor);
                    break;
                }
            }
        }
        else{
            System.out.println("Es cualquier otro caractera");
        }
        
        }
        catch(Exception e){
            
        }
    }
    
}
