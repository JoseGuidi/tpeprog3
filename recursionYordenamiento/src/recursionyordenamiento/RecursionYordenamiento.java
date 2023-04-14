/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursionyordenamiento;

/**
 *
 * @author ilari
 */
public class RecursionYordenamiento {

    /**
     * @param args the command line arguments
     */
    
    public static int[] ordenarSeleccion(int[]arr){
        for(int i=0;i<arr.length;i++){
           
            int menor=i;
            
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[menor]){
                    menor=j;
                }
                 if(menor != i) {
                    int temp = arr[i];
                    arr[i] = arr[menor];
                    arr[menor] = temp;
                }
            }
        }
        return arr;
    }
    
    public static int[] ordenarBurbujeo(int[] arr){
        boolean swapped=true;
        int j=0;
        int aux;
        while(swapped){
            swapped=false;
            j++;
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    aux=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=aux;
                    swapped=true;
                }
            }
        }
        return arr;
    }
    
    public static void mostrarArreglo(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
    public void merge(int low,int middle,int high,int[] helper,int[] numbers){
        //copiar al helper
        for(int i=low;i<=high;i++){
            helper[i]=numbers[i];
        }
        int i = low;
        int j = middle + 1;
        int k = low;
        // copiar de manera ordenada al array original los valores de la
        // mitad izquierda o de la derecha
        while (i <= middle && j <= high) {
            if (helper[ i ] <= helper[ j ]) {
                numbers[ k ] = helper[ i ];
                i++;
            } 
            else {
                numbers[ k ] = helper[ j ];
                j++;
            }
            k++;
        }
        // si quedaron elementos copiarlos al array original
        while (i <= middle) {
            numbers[ k ] = helper[ i ];
            k++;
            i++;
        }
        while (j <= high) {
            numbers[ k ] = helper[ j ];
            k++;
            j++;
        }

    }
    
    public void mergesort(int low,int high){
        int[ ] numbers;//arreglo a ordenar
        int[ ] helper;
        int size;

        //si low es menor que high continua el ordenamiento
        //si low no es menor que high entonces el array esta ordenado
        //ya que es el caso base donde el array tiene solo un elemento
        if(low<high){
            //obtener elñ indice del elemento que se encuentra en la mitad
            //el resultado se redondea al entero menor
            int middle=(low+high)/2;
            //ordenar la mitad izquierda del array llamada recursiva
            mergesort(low,middle);
            //ordenar la mitad derecha
            mergesort(middle+1,high);
            //combinar mitades ordenadas
            //merge(low,middle,high,helper,numbers);
        }
    }
    
    public static void quicksort(int[] arr, int low, int high) {
    if (low < high) {
        // Elegimos el primer elemento como pivote
        int pivot = arr[low];
        // Obtenemos el índice de separación del arreglo
        int partitionIndex = partition(arr, low, high, pivot);
        // Ordenamos recursivamente los dos subarreglos creados
        quicksort(arr, low, partitionIndex - 1);
        quicksort(arr, partitionIndex, high);
        }
    }

    public static int partition(int[] arr, int low, int high, int pivot) {
        // Mientras el índice de la izquierda sea menor al de la derecha
        while (low <= high) {
            // Avanzamos el índice de la izquierda mientras el elemento sea menor al pivote
            while (arr[low] < pivot) {
                low++;
            }
            // Retrocedemos el índice de la derecha mientras el elemento sea mayor al pivote
            while (arr[high] > pivot) {
                high--;
            }
            // Si todavía no hemos cruzado los índices, intercambiamos los elementos en esas posiciones
            if (low <= high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                // Avanzamos los índices
                low++;
                high--;
            }
        }
        // Devolvemos el índice de separación
        return low;
    }
    
    public static void main(String[] args) {
        int arr[]=new int[4];
        arr[0]=4;
        arr[1]=1;
        arr[2]=3;
        arr[3]=2;
        mostrarArreglo(arr);
        quicksort(arr,0,3);
        mostrarArreglo(arr);
    }
    
}
