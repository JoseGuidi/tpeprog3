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
public class Barrio implements BuscadorCartas{

    String nombre;
    Buzon buzon;

    public Barrio(String nombre, Buzon buzon) {
        this.nombre = nombre;
        this.buzon = buzon;
    }

    public String getNombre() {
        return nombre;
    }

    public Buzon getBuzon() {
        return buzon;
    }
   
    public String toString(){
        return "Nombre barrio "+nombre;
    }
    
    @Override
    public ArrayList<Carta> buscar(Condicion c) {
        ArrayList<Carta>filtro=new ArrayList();
        filtro.addAll(buzon.buscar(c));
        return filtro;
    }

    @Override
    public ArrayList<Carta> obtenerCartas() {
        return new ArrayList(buzon.obtenerCartas());
    }
    @Override
    public double porcentajeCartasPidenRegalo(String r) {
       ArrayList<Carta> filtro=this.buscar(new CondicionRegalo(r));
       return ((filtro.size()/this.obtenerCartas().size())*100);
    }
}
