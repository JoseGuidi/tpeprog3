/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpeback.greedy.prog3;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class Main {
    public static void main(String[] args){
    
    String path = "src/tpeback/greedy/prog3/datos.txt";
		CSVReader reader = new CSVReader(path);
                ArrayList<String[]> datos=reader.read();
                
                System.out.println(datos);
        }
    }

