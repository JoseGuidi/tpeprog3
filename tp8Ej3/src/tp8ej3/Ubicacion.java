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
public class Ubicacion implements BuscadorCartas{
    String nombre;
    ArrayList<Buzon>buzones;

    public String toString(){
        return "Nombre ubicacion "+nombre+buzones.toString();
    }
    
    public Ubicacion(String nombre) {
        this.nombre = nombre;
        this.buzones = new ArrayList();
    }
    
    public void insertarCarta(Carta c){
        buzones.get(0).recibirCarta(c);
    }
    
    public ArrayList<Carta>buscar(Condicion c){
        ArrayList<Carta>filtro=new ArrayList();
        for(Buzon b:buzones){
            filtro.addAll(b.buscar(c));
        }
        return filtro;
    }
    
    public void addBuzon(Buzon b){
        this.buzones.add(b);
    }

    @Override
    public ArrayList<Carta> obtenerCartas() {
        ArrayList<Carta> cartas=new ArrayList();
        for(Buzon b:buzones){
            cartas.addAll(b.obtenerCartas());
        }
        
        return cartas;
    }
    @Override
    public double porcentajeCartasPidenRegalo(String r) {
       ArrayList<Carta> filtro=this.buscar(new CondicionRegalo(r));
       System.out.println(filtro.size()+"/"+this.obtenerCartas().size());
       return ((double)(filtro.size()/(double)this.obtenerCartas().size())*100);
    }
    
    
}
