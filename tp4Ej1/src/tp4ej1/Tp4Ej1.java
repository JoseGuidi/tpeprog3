/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4ej1;

/**
 *
 * @author ilari
 */
public class Tp4Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alarma a = new Alarma();
        AlarmaLuminosa b = new AlarmaLuminosa();
        a.setSeAbrioAbertura(true);
        b.setSeAbrioAbertura(true);
        a.comprobar();
        b.comprobar();
    }
    
}
