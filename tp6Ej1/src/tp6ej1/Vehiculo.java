/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6ej1;

import java.time.LocalDate;

/**
 *
 * @author ilari
 */
public class Vehiculo extends Item{
    String marca;
    int kms;
    int patente;
    String tipo;
    boolean alquilado;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    public void setPatente(int patente) {
        this.patente = patente;
    }

    public void setTipo(String tipo) {
        if(tipo=="naftero"||tipo=="gasolero"||tipo=="electrico"){
            this.tipo = tipo;
        }
        else{
            this.tipo="naftero";
        }
    }

    public void setAlquilado(boolean estado) {
        this.alquilado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public int getKms() {
        return kms;
    }

    public int getPatente() {
        return patente;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isAlquilado() {
        return alquilado;
    }
    
    public boolean sePuedeAlquilar(){
        return(!this.isAlquilado());
    }
    
    
    public Vehiculo(String marca,int kms,int patente,String tipo){
        super(null);
        this.setKms(kms);
        this.setMarca(marca);
        this.setPatente(patente);
        this.setAlquilado(false);
        this.setTipo(tipo);
    }
}
