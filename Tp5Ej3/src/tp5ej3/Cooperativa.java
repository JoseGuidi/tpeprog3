/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ej3;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class Cooperativa {
     ArrayList<Cereal> cereales;
     ArrayList<Lote> lotes;
     ArrayList<String> mineralesPrimarios;
    

    public ArrayList<Cereal> getCereales() {
        ArrayList<Cereal> aux=(ArrayList<Cereal>) this.cereales.clone();
        return aux;
    }
     
     public ArrayList<Lote> getLotes() {
        ArrayList<Lote> aux=(ArrayList<Lote>) this.lotes.clone();
        return aux;
    }

    public ArrayList<String> getMineralesPrimarios() {
        ArrayList<String> aux= (ArrayList<String>)this.mineralesPrimarios.clone();
        return aux;
        
    }
     
    public void agregarLote(Lote e){
        this.lotes.add(e);
    }
    public void agregarMineral(String m){
        this.mineralesPrimarios.add(m);
    }
    
    public void asignarTipoLotes(){
        for(int i=0;i<this.getLotes().size();i++){
            this.getLotes().get(i).asignarTipoDeLote(this.getMineralesPrimarios());
        }
    }
    
    public Cooperativa(){
        this.cereales=new ArrayList<Cereal>();
        this.lotes=new ArrayList<Lote>();
        this.mineralesPrimarios=new ArrayList<String>();
    }
    
    public ArrayList<Cereal> queCerealesSePuedenPlantar(Lote l){
        ArrayList<Cereal> aux= new ArrayList<Cereal>();
        for(int i=0;i<this.cereales.size();i++){
            if(l.sePuedeSembrarCereal(this.getCereales().get(i))){
                aux.add(this.getCereales().get(i));
            }
        }
        return aux;
    }
    
    public ArrayList<Lote> queLotesPuedoUsar(Cereal c){
        ArrayList<Lote> aux= new ArrayList<Lote>();
        for(int i=0;i<this.lotes.size();i++){
            if(c.sePuedePlantarEnLote(this.getLotes().get(i))){
                aux.add(this.getLotes().get(i));
            }
        }
        return aux;
    }
    
    
    public void agregarCereal(Cereal c){
        this.cereales.add(c);
    }
    
     public static void main (String [ ] args){
         System.out.println("entra");
         Cereal girasol=new CerealGranoGrueso("girasol");
         Cereal alfalfa=new CerealPastura("Alfalfa");
         alfalfa.addMinerales("kk");
         Lote l=new Lote("lote 1");
         Cooperativa c=new Cooperativa();
         c.agregarMineral("nasi");
         c.agregarLote(l);
         c.agregarCereal(girasol);
         c.agregarCereal(alfalfa);
         c.asignarTipoLotes();
         //System.out.println(c.getCereales().toString());
         System.out.println(c.queLotesPuedoUsar(girasol));
         //System.out.println(c.queCerealesSePuedenPlantar(c.getLotes().get(0)));
     }
     
}
