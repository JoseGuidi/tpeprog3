/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7bej2;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class EnvioCombo extends Envio{
    ArrayList<Envio> envios;

    
    public EnvioCombo(){
        this.envios=new ArrayList();
        
    }
   
    
    
    public void addEnvio(Envio e){
        if(envios.isEmpty()){
            this.setNroTracking(e.getNroTracking());
            this.envios.add(e);
            this.setCiudad(e.getCiudad());
        }
        else{
            if(ciudad.equals(e.getCiudad())){
                this.envios.add(e);
                e.actualizarNroTracking(this.getNroTracking());
            }
            else
                System.out.println("Ciudad incorrecta");
        }
    }
    
    public ArrayList<Envio> getEnvios() {
        return new ArrayList(envios);
    }
    
    @Override
    public String toString(){
        return envios.toString();
    }
    
    @Override
    protected void actualizarNroTracking(int nro) {
        for(int i=0;i<this.envios.size();i++){
            this.envios.get(i).actualizarNroTracking(nro);
        } 
    }

    
    
    @Override
    public String obtenerDestinatario() {
        if(this.envios.isEmpty()){
            return ("no hay destinatarios");
        }
        else
            return (this.envios.get(0).obtenerDestinatario());
    }

    @Override
    public int getPeso() {
        int peso=0;
        for(int i=0;i<this.envios.size();i++){
            peso+=envios.get(i).getPeso();
        }
        return peso;
    }
}
