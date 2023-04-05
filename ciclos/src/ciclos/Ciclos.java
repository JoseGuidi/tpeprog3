/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclos;

/**
 *
 * @author ilari
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero,i;
       char caracter;
       String cadena;
       try{
           do {
            System.out.println("Ingresar el caracter");
            BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
            cadena=entrada.readLine();
            caracter=cadena.charAt(0);
            if((caracter>='a')&&(caracter<='z')){
                try{
                System.out.println("Ingresa un número");
                numero=Integer.valueOf(entrada.readLine());
                if((numero>=1)||(numero<=5)){
                    for(i=1;i<=10;i++){
                        System.out.println((numero)+" por "+(i)+" = "+ (numero*i));
                    }
                }
                }
                catch(Exception e){
                    
                }
            }
            }
           while((caracter>='a')&&(caracter<='z'));
           }
        catch(Exception e){
        }
       }
 
    }
    

