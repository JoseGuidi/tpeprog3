/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3ej1;

/**
 *
 * @author ilari
 */
public class Tp3Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       Persona niquito = new Persona("Niquito",42542399);
       Persona marcos = new Persona("marcos",45552399);
       Persona jorge = new Persona("Jorge",40212545,true,0);
       Encuesta e=new Encuesta("Experimento social",4,jorge);
       e=e.responderEncuesta(niquito);
       System.out.println(e.obtenerInformacion());
       e=e.responderEncuesta(marcos);
       System.out.println(e.obtenerInformacion());
      
    }
    
}
