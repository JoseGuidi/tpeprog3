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
public class Buzon implements BuscadorCartas{
    ArrayList<Niño>niños;
    ArrayList<Carta>cartas;

    public Buzon(){
        niños=new ArrayList();
        cartas=new ArrayList();
    }
    
    public String toString(){
        return "Niños buzon"+niños.toString()+"Cartas "+cartas.toString();
    }
    
    public void addNiño(Niño n){
        niños.add(n);
}
    
    public Carta getCarta(int i){
        return cartas.get(i);
    }
    
    public void recibirCarta(Carta c){
        System.out.println("recibe carta");
        if(niños.contains(c.getRemitente())){
            cartas.add(c);
        }
        else{
            c.setRegalos("Trozo carbon");
            cartas.add(c);
        }
    }
    
    @Override
    public ArrayList<Carta> buscar(Condicion c) {
        ArrayList<Carta>filtro=new ArrayList();
        for(Carta ca:cartas){
            filtro.addAll(ca.buscar(c));
        }
        return filtro;
    }

    @Override
    public ArrayList<Carta> obtenerCartas() {
        return new ArrayList(cartas);
    }

    @Override
    public double porcentajeCartasPidenRegalo(String r) {
       ArrayList<Carta> filtro=this.buscar(new CondicionRegalo(r));
       return ((filtro.size()/cartas.size())*100);
    }
}
