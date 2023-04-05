/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ej5;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class EmpleadoVentas extends Empleado{
    public final int salarioBase=13000;
    ArrayList<Integer> ventas;
    int adicionalVenta;

    public int getAdicionalVenta() {
        return adicionalVenta;
    }

    public void setAdicionalVenta(int adicionalVenta) {
        this.adicionalVenta = adicionalVenta;
    }
    
    public double totalRecaudacionVentas(){
        double aux=0;
        for(int i=0;i<this.getVentas().size();i++){
            aux=aux+this.getVentas().get(i);
        }
        return aux;
    }
    
    public ArrayList<Integer> getVentas() {
        ArrayList<Integer> aux=new ArrayList();
        aux.addAll(this.ventas);
        return aux;
    }
    
    public void addVenta(int venta){
        this.ventas.add(venta);
    }
    
    public  double consultarSalario(){
        return(this.getSueldo()+(this.totalRecaudacionVentas()*((this.getAdicionalVenta()*10)/100)));
    }
    
    public EmpleadoVentas(String nombre,String apellido, int dni,int sueldo,int adicionalventa){
        super(nombre,apellido,dni,sueldo);
        this.ventas=new ArrayList();
        this.setAdicionalVenta(adicionalventa);
    }
    
}
