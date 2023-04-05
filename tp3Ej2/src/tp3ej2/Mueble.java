/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3ej2;

/**
 *
 * @author ilari
 */
public class Mueble {
    private String tipoMueble;
    private int peso;
    private int costoDeFabricacion;
    private double valorDeVenta;
    private String tipoMadera;
    private String color;

    public String getTipoMueble() {
        return tipoMueble;
    }

    public int getPeso() {
        return peso;
    }

    public int getCostoDeFabricacion() {
        return costoDeFabricacion;
    }

    public double getValorVenta() {
        return valorDeVenta;
    }

    public String getColor() {
        return color;
    }

    public void setTipoMueble(String tipoMueble) {
        this.tipoMueble = tipoMueble;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setCostoDeFabricacion(int costoDeFabricacion) {
        this.costoDeFabricacion = costoDeFabricacion;
    }

    public void setValorDeVenta(double valorDefabricacion) {
        this.valorDeVenta = valorDefabricacion*1.35;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getValorDeVenta() {
        return valorDeVenta;
    }

    public String getTipoMadera() {
        return tipoMadera;
    }
    
    
    public void setTipoMadera(String tipoMadera) {
        this.tipoMadera = tipoMadera;
    }
    
    public Mueble(String tipoMueble,int peso,int costoDeFabricacion,String color,String tipoMadera){
        this.tipoMueble=tipoMueble;
        this.peso=peso;
        this.costoDeFabricacion=costoDeFabricacion;
        this.color=color;
        this.setValorDeVenta(costoDeFabricacion);
        this.setTipoMadera(tipoMadera);
    }   

    
    public String obtenerInformacionMueble(){
        return("Tipo de mueble "+this.getTipoMueble()+" peso "+this.getPeso()+" costo de fabricacion "+this.getCostoDeFabricacion()+" costo de venta ")+this.getValorVenta()+" color "+this.getColor()+" tipo de madera "+this.getTipoMadera();
    }
    
}
