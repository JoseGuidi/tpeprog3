/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8ej1;

/**
 *
 * @author ilari
 */
public class CondicionAlquilaronCancha extends Condicion{
    int idCancha;
    
    public boolean cumple(Socio s){
        return (s.alquiloUnaCancha(idCancha));
    }
    
    public CondicionAlquilaronCancha(int idCancha){
        this.idCancha=idCancha;
    }
}
