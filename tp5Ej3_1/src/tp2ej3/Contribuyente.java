/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2ej3;

/**
 *
 * @author ilari
 */
public class Contribuyente {
    String nombre;
    int montofijo;
    int codId;
    public String getNombre() {
        return nombre;
    }

    public int getMontofijo() {
        return montofijo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMontofijo(int montofijo) {
        this.montofijo = montofijo;
    }

    public void setCodId(int codId) {
        this.codId = codId;
    }

    public int getCodId() {
        return codId;
    }
    
    public String toString(){
        return("Nombre "+this.getNombre()+" Monto fijo "+this.getMontofijo());
    }
    
    public double cuantoAporta(){
        return this.getMontofijo();
    }
    public Contribuyente(String nombre,int codId){
        this(nombre,codId,500);
    }
    public Contribuyente(String nombre,int codId,int montoFijo){
        this.setMontofijo(montoFijo);
        this.setCodId(codId);
        this.setNombre(nombre);
    }
    
}
