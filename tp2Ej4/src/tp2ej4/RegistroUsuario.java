/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2ej4;

/**
 *
 * @author ilari
 */
public class RegistroUsuario {
    private String nombre;
    private int cantTurnos2Meses;
    private boolean esSocio;

    public String getNombre() {
        return nombre;
    }

    public int getCantTurnos2Meses() {
        return cantTurnos2Meses;
    }

    public boolean isEsSocio() {
        return esSocio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantTurnos2Meses(int cantTurnos2Meses) {
        this.cantTurnos2Meses = cantTurnos2Meses;
    }

    public void setEsSocio(boolean esSocio) {
        this.esSocio = esSocio;
    }
    
    
    
    public RegistroUsuario(String nombre){
        this(nombre,0);
    }
    public RegistroUsuario(String nombre,int cantTurnos2Meses){
        this.nombre=nombre;
        this.cantTurnos2Meses=cantTurnos2Meses;
        if(this.esSocio()){
            this.setEsSocio(true);
        }
        else{
            this.setEsSocio(false);
        }
    }
    
    public boolean esSocio(){
        return(this.getCantTurnos2Meses()>=4);
    }
    
    public String devolverDatos(){
        return(this.getNombre()+" "+this.getCantTurnos2Meses()+" "+this.isEsSocio());
    }
}
