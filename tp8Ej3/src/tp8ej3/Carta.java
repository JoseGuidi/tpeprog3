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
public class Carta implements BuscadorCartas{
    Niño remitente;
    ArrayList<String> regalos;

    
    public String toString(){
        return "Regalos "+regalos.toString();
    }
    
    public Carta(){
        
        regalos=new ArrayList();
    }

    public void setRemitente(Niño remitente) {
        this.remitente = remitente;
    }

    public Niño getRemitente() {
        return remitente;
    }

    public void setRegalos(String regalo) {
        regalos.clear();
        regalos.add(regalo);
    }

    
    
    public void addRegalo(String r){
        regalos.add(r);
    }
    
    
    @Override
    public ArrayList<Carta> buscar(Condicion c) {
       ArrayList<Carta>carta=new ArrayList();
       if(c.cumple(this)){
           carta.add(this);
       }
       return carta;
    }

    public boolean ContieneRegalo(String regalo){
        return regalos.contains(regalo);
    }
    
    @Override
    public ArrayList<Carta> obtenerCartas() {
        ArrayList<Carta> a=new ArrayList();
        a.add(this);
        return a;
    }

    @Override
    public double porcentajeCartasPidenRegalo(String r) {
        return this.buscar(new CondicionRegalo(r)).size();
    }
}
