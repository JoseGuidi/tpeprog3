/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;

/**
 *
 * @author ilari
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    static void mostrararreglo(int [] arregloenteros){
        for(int i=0;i<=max-1;i++){
            
            System.out.println(arregloenteros[i]);
        }
    }
     
    static void cargararray(int [] arregloenteros){
        for(int i=0;i<=max-1;i++){
            arregloenteros[i]=i;
        }
       
    }
    static void invertirarreglo(int[] arregloenteros){
        int aux;
        
        for(int i=0;i<=(max/2);i++)
        {
            aux=arregloenteros[i];
            arregloenteros[i]=arregloenteros[(max-1)-i];
            arregloenteros[(max-1)-i]=aux;
           
            
           
        }
       
        mostrararreglo(arregloenteros);
    }
       
    public static final int max=10;
    public static void main(String[] args) {
        int arregloenteros[];
        arregloenteros= new int [10];
        cargararray(arregloenteros);
        mostrararreglo(arregloenteros);
        invertirarreglo(arregloenteros);
    }
    
}
