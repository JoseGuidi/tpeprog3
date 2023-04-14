/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tparboles;

/**
 *
 * @author ilari
 */
public class TpArboles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tree a=new Tree(2);
        a.add(7);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(9);
        a.add(8);
        a.add(10);
        a.add(1);
        a.add(0);
        a.add(-1);
        a.printPreOrder();
        System.out.println(a.getHeight());
    }
    
}
