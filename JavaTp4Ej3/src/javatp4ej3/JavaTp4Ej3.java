/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javatp4ej3;

/**
 *
 * @author Razor
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class JavaTp4Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mes,anio;
        try{
        System.out.println("Ingrese el mes del anio");
        BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
        mes=Integer.valueOf(entrada.readLine());
        switch(mes){
            case 1:case 3: case 5: case 7: case 8: case 10: case 12:{
                System.out.println("Tiene 31 dias");
                break;
            }
            case 4: case 6: case 9: case 11:{
                System.out.println("Tiene 30 dias");
                break;
            }
            case 2:{
                System.out.println("Ingersar el anio");
                anio=Integer.valueOf(entrada.readLine());
                if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
                    System.out.println("Biciesto");
                    System.out.println("Tiene 29 dias");
                }
                else{
                    System.out.println("Tiene 28 dias");
                }
                break;
            }
        }
        }
        catch(Exception e){
            
        }
    }
    
}
