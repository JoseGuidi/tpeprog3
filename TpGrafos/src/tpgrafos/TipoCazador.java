/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpgrafos;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class TipoCazador {
    int poscazador;
    ArrayList<Integer>posleones;

    public TipoCazador(int poscazador, ArrayList<Integer> posleones) {
        this.poscazador = poscazador;
        this.posleones = posleones;
    }

    public int getPoscazador() {
        return poscazador;
    }

    public ArrayList<Integer> getPosleones() {
        return posleones;
    }

    public void setPoscazador(int poscazador) {
        this.poscazador = poscazador;
    }

    public void setPosleones(ArrayList<Integer> posleones) {
        this.posleones = posleones;
    }
    
    public boolean equals(Object o){
        return poscazador==(Integer)o;
    }
}
