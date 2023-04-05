/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2ej5;

/**
 *
 * @author ilari
 */
public class Tp2Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int turnosNoche[]={21,20,19,22};
        int turnosTarde[]={13,14,15,16};
        Peluquero pp=new Peluquero("pp");
        Peluquero pp2=new Peluquero("pp2",turnosNoche);
        Peluquero pp3=new Peluquero("pp3",turnosTarde);
        Peluquero pp4=new Peluquero("pp4");
        Peluquero pelucas[]={pp,pp2,pp3,pp4};
        Turno t=new Turno(pelucas);
        System.out.println(t.mostrarDatosTurno());
        t.encontrarProximoTurnoPeluquero(pp2);
        System.out.println(t.mostrarDatosTurno());
    }
    
}
