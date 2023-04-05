/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialito4;

/**
 *
 * @author ilari
 */
public class CondicionDeudaMayor extends Condicion{

    double deuda;
    
    @Override
    public boolean cumple(Proveedor p) {
        return p.getDeudaActual()>deuda;
    }
    
    
    public CondicionDeudaMayor(double deuda){
        this.deuda=deuda;
    }
}
