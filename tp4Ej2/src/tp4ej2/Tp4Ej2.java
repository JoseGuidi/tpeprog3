/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4ej2;

/**
 *
 * @author ilari
 */
public class Tp4Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sensor comedor= new Sensor("comedor");
        Sensor cocina=new Sensor("cocina");
        AlarmaLuminosa a=new AlarmaLuminosa();
        a.insertar(comedor);
        a.insertar(cocina);
        a.getListaSensores().get(0).setSeAbrioAbertura(true);
        
        
        System.out.println(a.comprobar());
    }
    
}
