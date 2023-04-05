/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8ej4;

/**
 *
 * @author ilari
 */
public class Main {
    public static void main(String [] args){
        Candidato milei=new Candidato("Milei","La agrup de milei","El partido de milei");
        Candidato nisman=new Candidato("nisman","La agrup de nisman","El partido de nisman");
        Candidato macri=new Candidato("macri","La agrup de macri","El partido de macri");
        Votante nico=new Votante("42542399");
        Votante josedeodo=new Votante("42552399");
        Votante fozter=new Votante("1820200");
        josedeodo.crearVoto(milei);
        //nico.crearVoto(milei);
        Mesa ladelaescuela=new Mesa();
        Mesa ladelacity=new Mesa();
        ladelacity.addPadron(fozter);
        fozter.crearVoto(macri);
        fozter.registrarVoto(ladelacity);
        ladelaescuela.addPadron(nico);
        ladelaescuela.addPadron(josedeodo);
        josedeodo.registrarVoto(ladelaescuela);
        nico.registrarVoto(ladelaescuela);
        Compuesto comp=new Compuesto();
        Compuesto comp2=new Compuesto();
        comp.addElemento(ladelacity);
        comp2.addElemento(ladelaescuela);
        comp.addElemento(comp2);
        CondicionVotoBlanco c1=new CondicionVotoBlanco();
        System.out.println(comp.porcVotos(c1));
    }
}
