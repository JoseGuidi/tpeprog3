/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4ej3;

/**
 *
 * @author ilari
 */
public class EmpleadoComision extends Empleado{
    private int cantVentas;
    private double comision;

    public void setCantVentas(int cantVentas) {
        this.cantVentas = cantVentas;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public int getCantVentas() {
        return cantVentas;
    }

    public double getComision() {
        return comision;
    }
    
    public double calcularSalario(){
        double ventascomision;
        ventascomision=this.getComision()/100;
        System.out.println(ventascomision);
        ventascomision=ventascomision*this.getCantVentas();
        System.out.println(ventascomision);
        return (this.getSalario()+(this.getSalario()*ventascomision));
    }
    
    public String toString(){
        return("Nombre "+this.getNombre()+" Salario "+this.getSalario()+" Cant ventas "+this.getCantVentas())+" interes por comision "+this.getComision();
    }
    
    public EmpleadoComision(String nombre){
        this(nombre,0);
    }
    public EmpleadoComision(String nombre,int cantVentas){
        this(nombre,0,5,1000);
    }
    public EmpleadoComision(String nombre,int cantVentas,double comision,int salario){
        super(nombre,salario);
        this.setCantVentas(cantVentas);
        this.setComision(comision);
    }
    
}
