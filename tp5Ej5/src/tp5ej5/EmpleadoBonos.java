/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ej5;

/**
 *
 * @author ilari
 */
public class EmpleadoBonos extends Empleado{
    int cantBonos;
    int bonifBonos;
    int cantVentas;

    public int getCantBonos() {
        return cantBonos;
    }

    public int getBonifBonos() {
        return bonifBonos;
    }

    public int getCantVentas() {
        return cantVentas;
    }

    public void setCantVentas(int cantVentas) {
        this.cantVentas = cantVentas;
    }
    
    public int cumpleBonos(){
        if(this.getCantVentas()>=this.getCantBonos()){
            return this.getBonifBonos();
        }
        return 0;
    }
    
    public void addVenta(){
        this.setCantVentas(this.getCantVentas()+1);
    }
    
    public  double consultarSalario(){
        return(this.getSueldo()+(this.cumpleBonos()));
    }
    
    public void setCantBonos(int cantBonos) {
        this.cantBonos = cantBonos;
    }

    public void setBonifBonos(int bonifBonos) {
        this.bonifBonos = bonifBonos;
    }
    
    public EmpleadoBonos(String nombre,String apellido, int dni,int sueldo,int cantBonos, int bonifBonos){
        super(nombre,apellido,dni,sueldo);
        this.setBonifBonos(bonifBonos);
        this.setCantBonos(cantBonos);
        this.setCantVentas(0);
    }
    
    
}
