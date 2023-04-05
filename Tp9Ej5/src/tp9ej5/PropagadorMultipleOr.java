/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej5;

/**
 *
 * @author ilari
 */
public class PropagadorMultipleOr extends Propagador{

    Propagador p1;
    Propagador p2;
    
    @Override
    public boolean cumple(Notificacion n) {
        return p1.cumple(n)||p2.cumple(n);
    }
    
    public PropagadorMultipleOr(Propagador p1,Propagador p2){
        this.p1=p1;
        this.p2=p2;
    }
    
}
