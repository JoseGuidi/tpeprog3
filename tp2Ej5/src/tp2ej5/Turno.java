/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2ej5;

/**
 *
 * @author ilari
 */
public class Turno {
    private Peluquero arrayPeluqueros[];
    private Peluquero peluqueroSelect;
    private int cantPeluqueros;
    private int horaSelect;

    public Peluquero[] getPeluqeuroDeTurno() {
        return arrayPeluqueros;
    }

    public int getCantPeluqueros() {
        return cantPeluqueros;
    }

    public void setPeluqeuroDeTurno(Peluquero[] peluqeuroDeTurno) {
        this.arrayPeluqueros = peluqeuroDeTurno;
    }

    public void setCantPeluqueros(int cantPeluqueros) {
        this.cantPeluqueros = cantPeluqueros;
    }

    public void setArrayPeluqueros(Peluquero[] arrayPeluqueros) {
        this.arrayPeluqueros = arrayPeluqueros;
    }

    public void setPeluqueroSelect(Peluquero peluqueroSelect) {
        this.peluqueroSelect = peluqueroSelect;
    }

    public Peluquero[] getArrayPeluqueros() {
        return arrayPeluqueros;
    }

    public Peluquero getPeluqueroSelect() {
        return peluqueroSelect;
    }

    public int getHoraSelect() {
        return horaSelect;
    }

    public void setHoraSelect(int horaSelect) {
        this.horaSelect = horaSelect;
    }
    
    
    public Turno(Peluquero[] p){
        this(p,4);
    }
    
    public Turno(Peluquero[] p,int cantPelucas){
        this.cantPeluqueros=cantPelucas;
        this.arrayPeluqueros=new Peluquero[cantPelucas];
        this.setPeluqeuroDeTurno(p);
        this.peluqueroSelect=new Peluquero();
    }
    
    public String mostrarDatosTurno(){
        String mostrar="";
        
            mostrar=mostrar+this.getPeluqueroSelect().getNombre()+" "+this.getHoraSelect();
        
        return (mostrar);
    }
    
    public void encontrarProximoTurno(){
        
        int horaProxima=0;
        int PelucaProx=0;
        int horaProx=0;
        for(int i=0;i<this.getArrayPeluqueros().length;i++){
            for(int j=0;j<this.getPeluqeuroDeTurno()[i].getTurnos().length;j++){
                if(horaProxima==0){
                    horaProxima=this.getPeluqeuroDeTurno()[i].getTurnos()[j];
                    PelucaProx=i;
                    horaProx=j;
                }
                else{
                    if(horaProxima>this.getPeluqeuroDeTurno()[i].getTurnos()[j]){
                        horaProxima=this.getPeluqeuroDeTurno()[i].getTurnos()[j];
                        PelucaProx=i;
                        horaProx=j;
                    }
                    }
                }
            }
        System.out.println("Hora proxima "+horaProxima+" Peluquero "+this.getArrayPeluqueros()[PelucaProx].getNombre()+" Hora "+this.getArrayPeluqueros()[PelucaProx].getTurnos()[horaProx]);
        
            
            this.setPeluqueroSelect(this.getArrayPeluqueros()[PelucaProx]);
            this.setHoraSelect(horaProxima);
        
        }
    public void encontrarProximoTurnoPeluquero(Peluquero p){
        int proximoTurno=0;
        for(int i=0;i<this.getArrayPeluqueros().length;i++){
            if(this.getArrayPeluqueros()[i]==p){
                for(int j=0;j<p.getTurnos().length;j++){
                    if(proximoTurno==0){
                        proximoTurno=p.getTurnos()[j];
                    }
                    else{
                        if(proximoTurno>p.getTurnos()[j]){
                            proximoTurno=p.getTurnos()[j];
                            
                        }
                    }
                }
            }
        }
        this.setPeluqueroSelect(p);
        this.setHoraSelect(proximoTurno);
    }
       
    }

