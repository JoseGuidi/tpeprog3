/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2ej2;

/**
 *
 * @author ilari
 */
public class Agenda {
    private Persona usuario;
    private Reunion reuniones[];
    private int cantReuniones;
    public Agenda (){
        this(new Persona());
    }
    public Agenda(Persona p){
        this(p,1);
    }
    public Agenda(Persona usuario,int cantReuniones){
        this.usuario=usuario;
        this.cantReuniones=cantReuniones;
        this.reuniones=new Reunion[cantReuniones];
        this.inicReuniones();
    }

    public Persona getUsuario() {
        return usuario;
    }

    public Reunion[] getReuniones() {
        return reuniones;
    }

    public int getCantReuniones() {
        return cantReuniones;
    }

    public void setUsuario(Persona usuario) {
        this.usuario = usuario;
    }

    public void setReuniones(Reunion[] reuniones) {
        this.reuniones = reuniones;
    }

    public void setCantReuniones(int cantReuniones) {
        this.cantReuniones = cantReuniones;
    }
    
    public void insertarReunion(Reunion r){
        boolean inserto=false;
        int i=0;
        while((!inserto)&&(i<this.getCantReuniones())){
            if(this.getReuniones()[i]==null){
                this.getReuniones()[i]=r;
                inserto=true;
            }
            i++;
        }
    }
    
    public boolean superpopneHorario(Reunion r){
        boolean superpone=false;
        int i=0;
        while(this.getReuniones()[i]!=null){
            if(r.getHora()==this.getReuniones()[i].getHora()){
                superpone=true;
            }
            i++;
        }
        return(superpone);
    }
    
    public void inicReuniones(){
        for(int i=0;i<this.cantReuniones;i++){
            Reunion r=new Reunion();
            boolean superpone=superpopneHorario(r);
            if(!superpone){
               insertarReunion(r);
            }
            else{
                System.out.println("Tenes un problema de horarios");
                insertarReunion(r);   
            }
        }
    }
    
    
    public String obtenerInfoAgenda(){
        return(this.getUsuario().getNombre()+" "+this.getUsuario().getApellido()+" "+this.getCantReuniones());
    }
    
}
