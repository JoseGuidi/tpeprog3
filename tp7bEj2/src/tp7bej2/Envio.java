/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7bej2;

/**
 *
 * @author ilari
 */
public abstract class Envio{
    int nroTracking;
    String ciudad="";

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }
    
    
    
    public void setNroTracking(int nroTracking) {
        this.nroTracking = nroTracking;
    }

    public int getNroTracking() {
        return nroTracking;
    }
    
    
    @Override
    public String toString(){
        return ("Nro tracking "+this.nroTracking);
    }
    
    protected abstract void actualizarNroTracking(int nro);
    
    public abstract String obtenerDestinatario();
    
    public abstract int getPeso();
}
