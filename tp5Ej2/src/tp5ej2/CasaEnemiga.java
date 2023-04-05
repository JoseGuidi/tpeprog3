/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ej2;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class CasaEnemiga extends CasaLinaje{

    ArrayList<Casa> casasEnemigas;

    public ArrayList<Casa> getCasasEnemigas() {
        ArrayList <Casa> aux= (ArrayList <Casa>) this.casasEnemigas.clone();
        return aux;
    }
    
    
    public void addCasaEnemiga(Casa enemy){
        this.casasEnemigas.add(enemy);
    }
    
    public boolean cumpleCondAdicionales(Alumno al){
        System.out.println(this.getCasasEnemigas());
        boolean entra=false;
        if(super.cumpleCondAdicionales(al)){
            for(int i=0;i<this.getCasasEnemigas().size();i++){
                if(this.getCasasEnemigas().get(i).cumpleCondicionesBasicas(al)){
                    System.out.println("evalua "+this.getCasasEnemigas().get(i).cumpleCondicionesBasicas(al));
                    entra=true;
                    return false;
                }
            }
            if (entra==false){
                return true;
            }
        }
        
           return false;
        
            
    }
    
    public CasaEnemiga(String nombre,int cantmax){
        super(nombre,cantmax);
        this.casasEnemigas= new ArrayList<>();
    }
}
