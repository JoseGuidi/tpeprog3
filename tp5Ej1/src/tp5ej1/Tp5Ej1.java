/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5ej1;


/**
 *
 * @author ilari
 */
public class Tp5Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila pila=new Pila();
        ObjetoPrueba o=new ObjetoPrueba("o prueba");
        ObjetoPrueba i=new ObjetoPrueba("2 prueba");
        pila.push(o);
        pila.push(i);
        Pila aux= pila.reverse();
        System.out.println(aux.show());
    }
    
}
