/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4ej3;

/**
 *
 * @author ilari
 */
public class EmpleadoHorasExtra extends Empleado{
    private double extraxHora;
    private int cantHorasExtra;

    public void setExtraxHora(double extraxHora) {
        this.extraxHora = extraxHora;
    }

    public void setCantHorasExtra(int cantHorasExtra) {
        this.cantHorasExtra = cantHorasExtra;
    }

    public double getExtraxHora() {
        return extraxHora;
    }

    public int getCantHorasExtra() {
        return cantHorasExtra;
    }
    
    
    public EmpleadoHorasExtra(String nombre){
        this(nombre,100,0);
    }
    
    public EmpleadoHorasExtra(String nombre, double extraxHora,int cantHorasExtra){
        this(nombre,extraxHora,cantHorasExtra,1000);
    }
    
    public double calcularSalario(){
        return(this.getSalario()+(this.getCantHorasExtra()*this.getExtraxHora()));
    }
    
    public String toString(){
        return("Nombre "+this.getNombre()+" Salario "+this.getSalario()+" Cant horas extra "+this.getCantHorasExtra())+" Precio por hora extra "+this.getExtraxHora();
    }
    
    public EmpleadoHorasExtra(String nombre, double extraxHora,int cantHorasExtra,double salario){
        super(nombre,salario);
        this.setCantHorasExtra(cantHorasExtra);
        this.setExtraxHora(extraxHora);
    }
    
}
