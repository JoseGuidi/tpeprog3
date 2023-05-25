/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package backtracking;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ilari
 */
public class BackTracking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear el laberinto representado por una matriz de casillas
        Casilla[][] laberinto = new Casilla[4][4];
        
        // Inicializar las casillas con sus valores y direcciones
        // Ejemplo de valores y direcciones de casillas ficticias
        for (int i = 0; i < laberinto.length; i++) {
            for (int j = 0; j < laberinto[i].length; j++) {
                int valor = i + j;  // Valor ficticio para cada casilla
                if((i==2)&&(j==3))
                    valor=0;
                boolean arriba = true;
                boolean abajo = true;
                boolean izquierda = true;
                boolean derecha = true;
                
                // Crear la casilla con los valores y direcciones correspondientes
                Casilla casilla = new Casilla(valor, arriba, abajo, izquierda, derecha);
                
                // Asignar la casilla a la matriz del laberinto
                laberinto[i][j] = casilla;
                casilla.setFila(i);
                casilla.setColumna(j);
            }
        }
        
        // Definir las coordenadas de inicio y fin del laberinto
        int desdeF = 0;
        int desdeC = 0;
        int hastaF = 3;
        int hastaC = 3;
        
        // Crear instancia de la clase BackTrackingEj
        BackTrackingEj backtracking = new BackTrackingEj(laberinto,4);
        
        // Resolver el laberinto y obtener el camino mínimo
        /*List<Casilla> caminoMinimo = backtracking.problemaMatriz(desdeF, desdeC, hastaC, hastaF);
        
        // Imprimir el camino mínimo
        System.out.println("Camino mínimo:");
        for (Casilla casilla : caminoMinimo) {
            System.out.println("Fila: " + casilla.getFila() + ", Columna: " + casilla.getColumna() + ", Valor: " + casilla.getValor());
        }*/
        /*int[] numeros = {2, 4, 6, 8};
        int sumaObjetivo = 12;
        
        // Crear instancia de la clase ProblemaSubconjuntos
      
        
        // Resolver el problema y obtener la lista de subconjuntos
        List<int[]> subconjuntos = backtracking.problemaSubConjuntos(numeros, sumaObjetivo);
        
        // Imprimir los subconjuntos encontrados
        System.out.println("Subconjuntos que suman " + sumaObjetivo + ":");
        for (int[] subconjunto : subconjuntos) {
            System.out.println(Arrays.toString(subconjunto));
        }*/
        List<Integer> numeros = Arrays.asList(4, 7, 2, 1, 5, 3, 6);

        List<List<Integer>> soluciones = backtracking.particionConjunto(numeros);

        for (List<Integer> solucion : soluciones) {
            System.out.println(solucion);
        }
    }
   }
    

