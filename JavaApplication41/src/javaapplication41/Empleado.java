/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication41;

/**
 *
 * @author ilari
 */
public class Empleado {
    private int cantidadEmpleados;
    private String nombre;
    private int legajo;
    public Empleado (String nombre){
        this.nombre=nombre;
        legajo=cantidadEmpleados++;
        cantidadEmpleados=cantidadEmpleados+1;
    }
    public int getLegajo(){
        return legajo;
    }
    public int getNombre(){
        return legajo;
    }
}
