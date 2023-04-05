/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2ej4;

/**
 *
 * @author ilari
 */
public class Turno {
    private String cancha;
    private RegistroUsuario usuario;
    private double precio;

    public String getCancha() {
        return cancha;
    }

    public RegistroUsuario getUsuario() {
        return usuario;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCancha(String cancha) {
        this.cancha = cancha;
    }

    public void setUsuario(RegistroUsuario usuario) {
        this.usuario = usuario;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public Turno(RegistroUsuario nombre){
        this(nombre,"Cancha paddle");
    }
    public Turno(RegistroUsuario usuario,String cancha){
        this.cancha=cancha;
        this.usuario=usuario;
        if(this.getCancha()=="Cancha paddle"){
            this.setPrecio(100);
        }
        else{
            this.setPrecio(400);
        }
        this.calcularPrecio();
    }
    public void calcularPrecio(){
        if(this.getUsuario().esSocio()){
            this.setPrecio(this.getPrecio()*0.9);
        }
    }
    public String devolverDatosTurno(){
        return (this.getCancha()+" "+this.getUsuario().devolverDatos()+" "+this.getPrecio());
    }
    
}
