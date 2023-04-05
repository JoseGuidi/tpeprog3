/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej6;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ilari
 */
public class Region extends ElementoTerritorio{

    ArrayList<ElementoTerritorio>elementos;
    
    @Override
    public ArrayList<Comarca> buscarComarca(Condicion c) {
        ArrayList<Comarca>filtro=new ArrayList();
        for(ElementoTerritorio e:elementos){
            filtro.addAll(e.buscarComarca(c));
        }
        Collections.sort(filtro);
        return filtro;
    }

    @Override
    public int getCantHabitantes() {
        int cant=0;
        for(ElementoTerritorio e:elementos){
            cant+=e.getCantHabitantes();
        }
        return cant;
    }

    @Override
    public int getSuperficie() {
        int superficie=0;
        for(ElementoTerritorio e:elementos){
            superficie+=e.getSuperficie();
        }
        return superficie;
    }

    @Override
    public int getMontoIngresos() {
        int monto=0;
        for(ElementoTerritorio e:elementos){
            monto+=e.getMontoIngresos();
        }
        return monto;
    }

    public void addElemento(ElementoTerritorio e){
        elementos.add(e);
    }
    
    public Region(String nombre) {
        super(nombre);
        this.elementos=new ArrayList();
    }
    
}
