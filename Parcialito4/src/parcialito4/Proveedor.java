/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialito4;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class Proveedor {
    ArrayList<String> marcasComerciales;
    String nombreEmpresa;
    String CUIT;
    double deudaActual;

    public Proveedor(String nombreEmpresa, String CUIT, double deudaActual) {
        this.nombreEmpresa = nombreEmpresa;
        this.CUIT = CUIT;
        this.deudaActual = deudaActual;
        this.marcasComerciales=new ArrayList();
    }

    public boolean tengoMarca(String marca){
        boolean tengo=false;
        for(String s:marcasComerciales){
            if(s.equalsIgnoreCase(marca))
                tengo=true;
        }
        return tengo;
    }
    
    public void setDeudaActual(double deuda){
        this.deudaActual=deuda;
    }
    
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public String getCUIT() {
        return CUIT;
    }

    public double getDeudaActual() {
        return deudaActual;
    }
    
    public void addMarca(String marca){
        marcasComerciales.add(marca);
    }
    
    @Override
    public String toString(){
        return nombreEmpresa+"-"+CUIT+"-"+deudaActual+"-"+marcasComerciales.toString();
    }
    
}
