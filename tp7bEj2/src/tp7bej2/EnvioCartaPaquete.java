/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7bej2;

/**
 *
 * @author ilari
 */
public class EnvioCartaPaquete extends Envio{

    String destinatario,dirDestinatario,remitente,dirRemitente;
    boolean casa;
    int peso;

    public String getDestinatario() {
        return destinatario;
    }

    public String getDirDestinatario() {
        return dirDestinatario;
    }

    public String getRemitente() {
        return remitente;
    }

    public String getDirRemitente() {
        return dirRemitente;
    }


    public boolean isCasa() {
        return casa;
    }

    @Override
    public int getPeso() {
        return peso;
    }

    
    
    public EnvioCartaPaquete(int nro,String destinatario, String dirDestinatario, 
            String remitente, String dirRemitente, String ciudad, boolean casa, int peso) {
        this.nroTracking=nro;
        this.destinatario = destinatario;
        this.dirDestinatario = dirDestinatario;
        this.remitente = remitente;
        this.dirRemitente = dirRemitente;
        this.setCiudad(ciudad); 
        this.casa = casa;
        this.peso = peso;
    }
    
    @Override
    public String toString(){
        return (super.toString()+"-"+"Destinatario "+"-"+this.getDestinatario()+"-"+
                "Remitente"+"-"+this.getDirRemitente()+"-"+"ciudad"+"-"+this.getCiudad());
    }
    
    
    @Override
    protected void actualizarNroTracking(int nro) {
        this.setNroTracking(nro); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String obtenerDestinatario() {
        return this.getDestinatario(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    
}
