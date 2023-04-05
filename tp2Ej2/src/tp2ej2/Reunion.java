/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2ej2;

/**
 *
 * @author ilari
 */
public class Reunion {
    private String lugarReunion;
    private Persona arrayPersonasReunion[];
    private int cantPersonas;
    private String temaReunion;
    private double duracionReunion;
    private Persona arrayAyudantesReunion[];
    private int cantAyudantes;
    private double hora;
    public Reunion(){
        this(new Persona());
    }
    public Reunion(Persona p){
        this("Teatro",1,"Tabaco",2.2,1,p,15);
    }
    public Reunion(String lugarReunion,int cantPersonas,String temaReunion,double duracionReunion,int cantAyudantes, Persona usuario,double hora){
        this.lugarReunion=lugarReunion;
        this.arrayPersonasReunion=new Persona[cantPersonas+1];
        this.cantPersonas=cantPersonas;
        this.temaReunion=temaReunion;
        this.duracionReunion=duracionReunion;
        this.arrayAyudantesReunion=new Persona[cantAyudantes];
        this.cantAyudantes=cantAyudantes;
        this.insertarPersona(usuario);
        
    }

    public String getLugarReunion() {
        return lugarReunion;
    }

    public Persona[] getArrayPersonasReunion() {
        return arrayPersonasReunion;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public String getTemaReunion() {
        return temaReunion;
    }

    public double getDuracionReunion() {
        return duracionReunion;
    }

    public double getHora() {
        return hora;
    }

    public Persona[] getArrayAyudantesReunion() {
        return arrayAyudantesReunion;
    }

    public int getCantAyudantes() {
        return cantAyudantes;
    }

    public void setLugarReunion(String lugarReunion) {
        this.lugarReunion = lugarReunion;
    }

    public void setArrayPersonasReunion(Persona[] arrayPersonasReunion) {
        this.arrayPersonasReunion = arrayPersonasReunion;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public void setTemaReunion(String temaReunion) {
        this.temaReunion = temaReunion;
    }

    public void setDuracionReunion(double duracionReunion) {
        this.duracionReunion = duracionReunion;
    }

    public void setArrayAyudantesReunion(Persona[] arrayAyudantesReunion) {
        this.arrayAyudantesReunion = arrayAyudantesReunion;
    }

    public void setCantAyudantes(int cantAyudantes) {
        this.cantAyudantes = cantAyudantes;
    }
    
    public void insertarPersona(Persona p){
        boolean inserto=false;
        int i=0;
        while((!inserto)&&(i<this.getArrayPersonasReunion().length)){
            if(this.getArrayPersonasReunion()[i]==null){
                this.getArrayPersonasReunion()[i]=p;
                inserto=true;
            }
            i++;
        }
        
    }
    
    public String obtenerInfoReunion(){
        return("Lugar "+this.getLugarReunion()+" Cant personas "+this.getCantPersonas()+" cant ayudantes "+this.getCantAyudantes()+" tema "+this.getTemaReunion()+" duracion "+this.getDuracionReunion());
    }
    
}
