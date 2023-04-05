/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2ej3;

/**
 *
 * @author ilari
 */
public class Provincia {
    private String nombre;
    private int cantCiudades;
    private Ciudad arregloCiudades[];

    public String getNombre() {
        return nombre;
    }

    public int getCantCiudades() {
        return cantCiudades;
    }

    public Ciudad[] getArregloCiudades() {
        return arregloCiudades;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantCiudades(int cantCiudades) {
        this.cantCiudades = cantCiudades;
    }

    public void setArregloCiudades(Ciudad[] arregloCiudades) {
        this.arregloCiudades = arregloCiudades;
    }
    
    public Provincia(){
        this("Provincia x");
    }
    public Provincia(String nombre){
        this(nombre,3);
    }
   
    public Provincia(String nombre,int cantciudades){
        this.nombre=nombre;
        this.cantCiudades=cantciudades;
        this.arregloCiudades=new Ciudad[cantciudades];
        
        for(int i=0;i<this.getCantCiudades();i++){
            this.insertarCiudades(new Ciudad());
        }
    }
    
    public void insertarCiudades(Ciudad c){
        boolean inserto=false;
        int i=0;
        int cant=this.getCantCiudades();
        while((inserto==false)&&(i<cant)){
            if(this.getArregloCiudades()[i]==null){
                this.getArregloCiudades()[i]=c;
                inserto=true;
            }
            i++;
        }
    }
    
    public void insertarCiudades(Ciudad c,int pos){
        boolean inserto=false;
        int i=0;
        int cant=this.getCantCiudades();
        while((inserto==false)&&(i<cant)){
            if(i==pos){
                this.getArregloCiudades()[i]=c;
                inserto=true;
            }
            i++;
        }
    }
    
    public String obtenerInformacionProvincia(){
        int cant=this.getCantCiudades();
        String devolver=("Nombre "+this.getNombre()+" Cant ciudades "+this.getCantCiudades())+"/";
        for(int i=0;i<cant;i++){
            devolver=devolver+this.getArregloCiudades()[i].obtenerInfoCiudad();
        }
        return(devolver);
    }
    
    public String cualesCiudadesGastanMas(){
        int gasto;
        int recaudacion;
        String ciudadesEnDeuda=" ";
        for(int i=0;i<this.getCantCiudades();i++){
            if(this.getArregloCiudades()[i].getHabitantes()>10){
                gasto=this.getArregloCiudades()[i].getGastos();
                recaudacion=this.getArregloCiudades()[i].getHabitantes()*this.getArregloCiudades()[i].getMontoRecaudado().getMonto();
                if(gasto>recaudacion){
                    ciudadesEnDeuda=ciudadesEnDeuda+" "+this.getArregloCiudades()[i].getNombre()+",";
                }
            }
            
        }
        return ciudadesEnDeuda;
    }
    public int cantCiudadesDeuda(){
        int gasto;
        int recaudacion;
        int ciudadesDeuda=0;
        for(int i=0;i<this.getCantCiudades();i++){
            if(this.getArregloCiudades()[i].getHabitantes()>10){
                gasto=this.getArregloCiudades()[i].getGastos();
                recaudacion=this.getArregloCiudades()[i].getHabitantes()*this.getArregloCiudades()[i].getMontoRecaudado().getMonto();
                if(gasto>recaudacion){
                    ciudadesDeuda=ciudadesDeuda+1;
                }
            }
            
        }
        return ciudadesDeuda;
    }
}
