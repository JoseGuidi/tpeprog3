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
public class ProductoRefrigerado extends IntermedioRefrigeradoyCongelado{
    
    static String[] alimentosRefrigerados={"pollos frescos", "milanesas de pollo", "de cerdo y de ternera", "pollo arrollado", "chorizos de cerdo"};
    
    @Override
    public void corroborarNombre(String nombre){
      
       for(int i=0;i<alimentosRefrigerados.length;i++){
           if(nombre.equals(alimentosRefrigerados[i])){
               this.setNombre(nombre);
           }
       }
     
    }
    
    
    
    
    /*public ProductoRefrigerado(int numeroLote, Date fechaVenc, Date fechaEnv,String granjaOrigen,double Temperatura,int codOrg){
        this(null,numeroLote,fechaVenc,fechaEnv,granjaOrigen,Temperatura,codOrg);
    }*/
    
    public ProductoRefrigerado(String nom,int numeroLote, Date fechaVenc, Date fechaEnv,String granjaOrigen,double Temperatura,int codOrg){
        super(nom,numeroLote,fechaVenc,fechaEnv,granjaOrigen,Temperatura,codOrg);
        if (nom!=null){
            this.corroborarNombre(nom);
        }
    }
    
}
