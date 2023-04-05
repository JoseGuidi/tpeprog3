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
public class Pais extends Ubicacion{
    ArrayList<Provincia>provincias;

    public Pais(String nombre) {
        super(nombre);
        provincias=new ArrayList();
    }
    
    public void addProvincia(Provincia p){
        provincias.add(p);
}
    
    @Override
    public ArrayList<Carta> obtenerCartas() {
        ArrayList<Carta>cartas=new ArrayList();
        cartas.addAll(super.obtenerCartas());
        for(Provincia p:provincias){
            cartas.addAll(p.obtenerCartas());
        }
        return cartas;
    }
    
    @Override
    public ArrayList<Carta> buscar(Condicion c) {
        ArrayList<Carta>filtrados=new ArrayList();
        filtrados.addAll(super.buscar(c));
        for(Provincia p:provincias){
            filtrados.addAll(p.buscar(c));
        }
        return filtrados;
    }
    
}
