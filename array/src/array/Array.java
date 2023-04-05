/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 *

package array;

/**
 *
 * @author ilari
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Array {

    /**
     * @param args the command line arguments
     */
    static void cargararray(int [] arregloenteros){
        for(int i=0;i<=max;i++){
            arregloenteros[i]=1;
        }
       
    }
    
    static void mostrararreglo(int [] arregloenteros){
        for(int i=0;i<=max;i++){
            arregloenteros[i]=1;
        }
    }
    
    public static void main(String[] args) {
        int arregloenteros[];
        arregloenteros= new int [10];
        cargararray(arregloenteros);
        mostrararreglo(arregloenteros);
    }
    
}
