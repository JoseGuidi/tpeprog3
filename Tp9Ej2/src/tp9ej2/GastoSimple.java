/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej2;

/**
 *
 * @author ilari
 */
public class GastoSimple extends Gasto{

    double monto;

    public GastoSimple(double monto, String descripcion) {
        super(descripcion);
        this.monto = monto;
    }
    
    
    
    @Override
    public double getMonto() {
        return monto;
    }
    
}
