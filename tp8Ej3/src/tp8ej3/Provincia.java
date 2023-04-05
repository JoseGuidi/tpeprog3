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
public class Provincia extends Ubicacion{
    ArrayList<Localidad>localidades;

    public Provincia(String nombre) {
        super(nombre);
        localidades=new ArrayList();
    }
    
    public void addLocalidad(Localidad l){
        localidades.add(l);
}
    
    @Override
    public ArrayList<Carta> obtenerCartas() {
        ArrayList<Carta> cartas=new ArrayList();
        cartas.addAll(super.obtenerCartas());
        for(Localidad l:localidades){
            cartas.addAll(l.obtenerCartas());
        }
        return cartas;
    }
    
    @Override
    public ArrayList<Carta> buscar(Condicion c) {
        ArrayList<Carta>filtrados=new ArrayList();
        filtrados.addAll(super.buscar(c));
        for(Localidad l:localidades){
            filtrados.addAll(l.buscar(c));
        }
        return filtrados;
    }
    
}
