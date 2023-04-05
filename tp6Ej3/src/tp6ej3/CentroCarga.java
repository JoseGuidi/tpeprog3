/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6ej3;

import java.time.LocalDate;

/**
 *
 * @author ilari
 */
public class CentroCarga {
    ColaOrdenada barcos;
    ColaOrdenada camiones;
    
    public void agregarBarco(Barco b){
        if(!camiones.isVacio()){
            Camion c=(Camion)camiones.obtenerSig();
            b.cargarCamion(c);
        }
        barcos.agregar(b);
    }
    public void agregarCamion(Camion c){
        if(!barcos.isVacio()){
            Barco b=(Barco)barcos.obtenerSig();
            b.cargarCamion(c);
            this.agregarBarco(b);
        }
        else{
            camiones.agregar(c);
        }
    }
    public String toString(){
        return(barcos.toString()+camiones.toString());
    }
    
    public CentroCarga(){
        barcos=new ColaOrdenada();
        camiones=new ColaOrdenada();
    }
    
     public static void main(String[] args) {
         CentroCarga centro=new CentroCarga();
         Barco b1=new Barco("b1",100);
         Barco b2=new Barco("b2",150);
         Barco b3=new Barco("b3",120);
         LocalDate c=LocalDate.now();
         Camion c1=new Camion("c1",c);
         Camion c2=new Camion("c2",c.plusDays(2));
         Camion c3=new Camion("c3",c.plusDays(1));
         centro.agregarCamion(c1);
         centro.agregarCamion(c2);
         centro.agregarCamion(c3);
         centro.agregarBarco(b1);
         centro.agregarBarco(b2);
         centro.agregarBarco(b3);
         System.out.println(centro);
     }
}
