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
public class Comarca extends ElementoTerritorio implements Comparable<Comarca>{
    
    int superficie;
    int cantHabitantes;
    int montoIngresos;

    public Comarca(String nombre, int superficie, int cantHabitantes, int montoIngresos) {
        super(nombre);
        this.superficie = superficie;
        this.cantHabitantes = cantHabitantes;
        this.montoIngresos = montoIngresos;
    }

   

    @Override
    public int getSuperficie() {
        return superficie;
    }

    @Override
    public int getCantHabitantes() {
        return cantHabitantes;
    }

    @Override
    public int getMontoIngresos() {
        return montoIngresos;
    }


    @Override
    public ArrayList<Comarca> buscarComarca(Condicion c) {
        ArrayList<Comarca>aux=new ArrayList();
        if(c.cumple(this)){
            aux.add(this);
        }
        return aux;
        
    }

    @Override
    public int compareTo(Comarca o) {
        int aux;
        aux=this.getNombre().compareTo(o.getNombre());
        if(aux==0){
            aux=this.getCantHabitantes()-o.getCantHabitantes();
            if(this.getCantHabitantes()-o.getCantHabitantes()==0){
                aux=this.getSuperficie()-o.getSuperficie();
                if(this.getSuperficie()-o.getSuperficie()==0){
                    aux=this.getMontoIngresos()-o.getMontoIngresos();
                    if(aux==0){
                        return aux;
                    }
                    else
                    {
                        if(aux<0){
                            return -1;
                        }
                        else return 1;
                    }
                }
                else{
                    if(aux<0)
                        return -1;
                    else
                        return 1;
                }
            }
            else{
                if(aux<0){
                    return -1;
                }
                else 
                    return 1;
            }
                
        }
        else return aux;
    }
    
    
    
}
