/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tplista;

/**
 *
 * @author ilari
 */
public class TpLista {

    public MySimpleLinkedList construirNuevaLista(MySimpleLinkedList a,MySimpleLinkedList b){
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a="hello";
        String b="world";
        Pila<String> pila=new Pila();
        pila.push(a);
        pila.push(b);
        System.out.println(pila);
        pila.reverse();
        System.out.println(pila);
    }
    
}
