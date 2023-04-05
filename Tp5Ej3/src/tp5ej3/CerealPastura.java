/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ej3;




/**
 *
 * @author ilari
 */
public class CerealPastura extends Cereal{
    static String nombresPastura[] = {"Alfalfa","trebol"};
    
    public boolean comprobarNombre(String nombre){
        boolean tiene=false;
        for(int i=0;i<nombresPastura.length;i++){
            if(nombresPastura[i]==nombre){
                tiene=true;
            }
        }
        return tiene;
    }
    
    public boolean sePuedePlantarEnLote(Lote l){
        boolean puedo=super.sePuedePlantarEnLote(l);
        if(puedo){
            return(l.getCantHectareas()>50);
        }
        return false;
    }
    public CerealPastura(String nombre){
        super(nombre);
    }
    
}
