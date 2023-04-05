/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8ej3;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class Localidad extends Ubicacion{

    ArrayList<Barrio>barrios;

    public Localidad(String nombre) {
        super(nombre);
        barrios=new ArrayList();
    }
    
    public void addBarrio(Barrio b){
        barrios.add(b);
}
    
    @Override
    public ArrayList<Carta> buscar(Condicion c) {
        ArrayList<Carta> filtrados=new ArrayList();
        filtrados.addAll(super.buscar(c));
        for(Barrio b:barrios){
            filtrados.addAll(b.buscar(c));
        }
        return filtrados;
    }

    @Override
    public ArrayList<Carta> obtenerCartas() {
        ArrayList<Carta> cartas=new ArrayList();
        cartas.addAll(super.obtenerCartas());
        for(Barrio b:barrios){
            cartas.addAll(b.obtenerCartas());
        }
        return cartas;
    }
    
    
    
    public String toString(){
        return "Barrios "+barrios.toString()+super.toString();
    }
    
}
