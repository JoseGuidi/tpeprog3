/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej4;

/**
 *
 * @author ilari
 */
public class CalculadorPorcentajeYmonto extends CalculadorPorcentaje{
    
     @Override
     public double calcularMonto() {
        return monto+monto*porcentaje;
    }

    public CalculadorPorcentajeYmonto(double porcentaje, double monto) {
        super(porcentaje, monto);
    }
    
     
     
}
