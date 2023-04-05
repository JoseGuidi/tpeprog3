/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7ej4;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class Tablero {
    ArrayList<Ficha>fichas;
    int puntajeMinimo;
    double dificultad;
    
    
    public double calcularDificultad(){
        double dif=0;
        for(int i=0;i<this.fichas.size();i++){
            dif=dif+fichas.get(i).obtenerDifFicha();
        }
        this.dificultad=dif;
        return dif;
    }
    
    public void addFicha(Ficha f){
        this.fichas.add(f);
    }
    
    public String toString(){
        return this.fichas.toString();
    }
    
    public ArrayList<Ficha> buscar(Condicion c){
        ArrayList<Ficha> filtrado=new ArrayList();
        for(int i=0;i<fichas.size();i++){
            if(c.cumple(fichas.get(i))){
                    filtrado.add(fichas.get(i));
            }
        }
        return filtrado;
    }
    
    public Tablero(int puntajeMinimo){
        fichas=new ArrayList<>();
        this.puntajeMinimo=puntajeMinimo;
    }
    
    public static void main(String args[]){
        Tablero t=new Tablero(5);
        Ficha f1=new Ficha("Ficha 1",2,3,5);
        Ficha f2=new FichaEspecial("Ficha 2",2,3);
        t.addFicha(f1);
        t.addFicha(f2);
        Condicion c1=new CondicionFortalezaMayor(1);
        Condicion c2=new CondicionMayorLugares(1);
        Condicion c3=new CondicionPoderMayor(1);
        Condicion c4=new CondicionAnd(c1,c3);
        Condicion c5=new CondicionOr(c1,c3);
        Condicion c6=new CondicionNot(c5);
        System.out.println(t.buscar(c6));
    }
}
