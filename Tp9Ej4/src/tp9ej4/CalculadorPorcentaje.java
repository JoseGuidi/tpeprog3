/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej4;

/**
 *
 * @author ilari
 */
public class CalculadorPorcentaje extends CalculadorMontoPoliza{

    double porcentaje,monto;
    
    @Override
    public double calcularMonto() {
        return monto*porcentaje;
    }

    public CalculadorPorcentaje(double porcentaje,double monto) {
        this.porcentaje = porcentaje;
    }
    
}
