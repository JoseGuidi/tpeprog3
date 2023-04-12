/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tplista;

/**
 *
 * @author Razor
 */


public class EjerciciosOrdenamiento {
    public static int[] ordenarArregloSeleccion(int[] arr,int size){
       
        
        for(int i=0;i<size;i++){
            int mayor=-1;
            int aux=-1;
            for(int j=0;j<size-i;j++){
                if((mayor==-1)||(arr[j]>mayor)){
                    mayor=arr[j];
                    aux=j;
                }
                if(j+1==size-i){
                    int aux2=arr[j];
                    arr[j]=mayor;
                    arr[aux]=aux2;
                }
            }
        }
        return arr;
    }
    public static void mostrarArreglo(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
        }
    
    public static void main(String[] args){
        int[] arr=new int [4];
        arr[0]=4;
        arr[1]=1;
        arr[2]=3;
        arr[3]=2;
        mostrarArreglo(arr);
        arr=ordenarArregloSeleccion(arr, arr.length);
        mostrarArreglo(arr);
    }
}

