/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8ej1;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class Socio {
    String nombre,apellido;
    int edad;
    boolean ultimaCuotaPaga;
    ArrayList<Alquiler>alquileres;

    public String toString(){
        return nombre+"-"+apellido+"-"+edad+"-"+ultimaCuotaPaga+"-"+alquileres.toString();
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isUltimaCuotaPaga() {
        return ultimaCuotaPaga;
    }

    public ArrayList<Alquiler> getAlquileres() {
        return new ArrayList(alquileres);
    }
    
    public boolean alquiloUnaCancha(int id){
        boolean alquilo=false;
        for(int i=0;i<this.alquileres.size();i++){
            if(alquileres.get(i).getIdCancha()==id){
                alquilo=true;
            }
        }
        return alquilo;
    }
    
    public boolean pagoMasDe(int valor){
        boolean pago=false;
        for(int i=0;i<this.alquileres.size();i++){
            if(alquileres.get(i).getValorAlquiler()>valor){
                pago=true;
            }
        }
        return pago;
    }
    
    public int obtenerTotalAlquileres(int cancha){
        int cant=0;
        for(int i=0;i<this.alquileres.size();i++){
            if(alquileres.get(i).getIdCancha()==cancha){
                cant++;
            }
        }
        return cant;
    }
    
    public void addAlquiler(Alquiler a){
        this.alquileres.add(a);
    }
    
    public Socio(String nombre,String apellido,int edad,boolean ultimaCuotaPaga){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.ultimaCuotaPaga=ultimaCuotaPaga;
        this.alquileres=new ArrayList();
    }
}
