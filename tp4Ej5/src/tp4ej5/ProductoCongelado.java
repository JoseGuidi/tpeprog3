/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4ej5;

import java.util.Date;

/**
 *
 * @author ilari
 */
public abstract class ProductoCongelado extends IntermedioRefrigeradoyCongelado{
   
    static String[] alimentosCongelados={"hamburguesas", "papas fritas","arvejas", "granos de maíz", "formas de pollo rebozadas"};
    
    @Override
    public void corroborarNombre(String nombre){
      
       for(int i=0;i<alimentosCongelados.length;i++){
           if(nombre.equals(alimentosCongelados[i])){
               this.setNombre(nombre);
           }
       }
     
    }
    
    public String toString(){
        return (super.toString()+this.obtenerInfoCongelamiento());
    }
    
    public abstract String obtenerInfoCongelamiento();
    
    public ProductoCongelado(String nom,int numeroLote, Date fechaVenc, Date fechaEnv,String granjaOrigen,double Temperatura,int codOrg){
        super(nom,numeroLote,fechaVenc,fechaEnv,granjaOrigen,Temperatura,codOrg);
        if (nom!=null){
            this.corroborarNombre(nom);
        }
    }
}
