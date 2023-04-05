/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej4;

/**
 *
 * @author ilari
 */
public class CalculadorMontoFijo extends CalculadorMontoPoliza{

    double monto;
    
    @Override
    public double calcularMonto() {
       return monto;
    }

    public CalculadorMontoFijo(double monto) {
        this.monto = monto;
    }
    
    
    
}
