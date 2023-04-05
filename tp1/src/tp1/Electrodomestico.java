/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1;

/**
 *
 * @author ilari
 */
public class Electrodomestico {
    
    private String nombre,color;
    private int precio,peso,consumo;
    
    private static final int bajoConsumo=45;
    private static final int altaGama=3;
    
    public Electrodomestico(String nombre){
        this(nombre,"gris plata");
        
    }
    public Electrodomestico(String nombre,String color){
        this(nombre,color,100);
    }
    public Electrodomestico(String nombre,String color,int precio){
        this(nombre,color,precio,2);
    }
    public Electrodomestico(String nombre,String color,int precio,int peso){
        this(nombre,color,precio,peso,10);
    }
    public Electrodomestico(String nombre, String color, int precio, int peso, int consumo){
        this.nombre=nombre;
        this.consumo=consumo;
        this.color=color;
        this.peso=peso;
        this.precio=precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public int getPrecio() {
        return precio;
    }

    public int getPeso() {
        return peso;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }
    
    public boolean esBajoConsumo(int consumo){
        return (consumo<bajoConsumo);
    }
    public double calcularBalance(int peso,int costo){
        return (costo/peso);
    }
    
    public boolean esDeGamaAlta(){
        return((calcularBalance(this.peso,this.precio))<altaGama);
    }
    
    public String accederAInformacion(){
        return(this.nombre+"-"+this.color+"-"+this.consumo+"-"+this.peso+"-"+this.precio);
    }
}

