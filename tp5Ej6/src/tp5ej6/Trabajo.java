package tp5ej6;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ilari
 */
public abstract class Trabajo {
    String nombre;
    ArrayList<String> palabrasClave;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getPalabrasClave() {
        ArrayList<String> aux= new ArrayList();
        aux.addAll(this.palabrasClave);
        return aux;
    }
    
    public void addPalabraClave(String palabraClave){
        this.palabrasClave.add(palabraClave);
    }
    
    public String toString(){
        return(" Nombre "+ this.getNombre()+ " Palabras clave "+this.getPalabrasClave().toString());
    }
    
    public abstract boolean puedeEvaluar(Evaluador e);
    
    public Trabajo(String nombre){
        this.setNombre(nombre);
        this.palabrasClave=new ArrayList();
    }
}
