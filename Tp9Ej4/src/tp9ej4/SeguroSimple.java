/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej4;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class SeguroSimple extends Seguro{
    String dni;
    CalculadorMontoPoliza calculador;
    int monto;
    String nroPoliza;
    String descripcion;

    public SeguroSimple(String dni, int monto, String nroPoliza, String descripcion) {
        this(dni,monto,nroPoliza,descripcion,new CalculadorMontoFijo(monto));
    }
    
    public SeguroSimple(String dni, int monto, String nroPoliza, String descripcion,CalculadorMontoPoliza c) {
        this.dni = dni;
        this.monto = monto;
        this.nroPoliza = nroPoliza;
        this.descripcion = descripcion;
        this.calculador=new CalculadorMontoFijo(this.monto);
        this.calculador=c;
    }
    
    @Override
    public String getPoliza() {
        return this.nroPoliza;
    }

    public void setCalculador(CalculadorMontoPoliza c){
        this.calculador=c;
    }
    
    @Override
    public double getMonto() {
        return calculador.calcularMonto();
    }

    @Override
    public String getDni() {
        return dni;
    }

    @Override
    public ArrayList<Seguro> buscar(Condicion c) {
        ArrayList<Seguro>filtro=new ArrayList();
        if(c.cumple(this)){
            filtro.add(this);
        }
        return filtro;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public ArrayList<Seguro> buscar(Condicion c, Comparador com) {
        return this.buscar(c);
    }

    
    
}
