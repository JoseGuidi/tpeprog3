/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej4;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ilari
 */
public class SeguroIntegrador extends Seguro{
    String dni;
    ArrayList<Seguro>seguros;
    
    @Override
    public String getDni() {
        return dni;
    }

    @Override
    public String getPoliza() {
        String polizaMayor="";
        for(Seguro s:seguros){
            if(!polizaMayor.equals("")){
                int comp=polizaMayor.compareTo(s.getPoliza());
                if(comp<0){
                    polizaMayor=s.getPoliza();
                }
            }
            else
                polizaMayor=s.getPoliza();
        }
        return polizaMayor;
    }

    @Override
    public double getMonto() {
        double total=0.0;
        for(Seguro s:seguros){
            total+=s.getMonto();
        }
        return total;
    }

    @Override
    public ArrayList<Seguro> buscar(Condicion c) {
        ArrayList<Seguro> aux=new ArrayList();
        for(Seguro s:seguros){
            aux.addAll(s.buscar(c));
        }
        return aux;
    }

    @Override
    public String getDescripcion() {
        return seguros.get(0).getDescripcion();
    }

   
    
    
}
