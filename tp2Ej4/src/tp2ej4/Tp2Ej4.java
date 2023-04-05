/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2ej4;

/**
 *
 * @author ilari
 */
public class Tp2Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RegistroUsuario u=new RegistroUsuario("pepe");
        u.setCantTurnos2Meses(4);
        Turno t=new Turno(u,"Cancha fulvo");
        System.out.println(t.devolverDatosTurno());
    }
    
}
