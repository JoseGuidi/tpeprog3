/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6ej3;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class ColaOrdenada {
   ArrayList<VehiculoOrdenado>vehiculos;
   
   public VehiculoOrdenado obtenerSig(){
       VehiculoOrdenado aux=vehiculos.get(0);
       vehiculos.remove(0);
       return aux;
   }
   
   public String toString(){
       return(vehiculos.toString());
   }
   
   public void agregar(VehiculoOrdenado v){
       boolean encontro=false;
       if(!vehiculos.isEmpty()){
        for(int i=0;i<vehiculos.size();i++){
           if((v.esMayor(vehiculos.get(i)))&&(encontro==false)){
               encontro=true;
               vehiculos.add(i, v);
           }
        } 
       }
       if(!encontro){
           vehiculos.add(v);
       }
       
   }
   
   public boolean isVacio(){
       return(vehiculos.isEmpty());
   }
   
   public ColaOrdenada(){
       vehiculos=new ArrayList<>();
   }
}
