/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3ej3;

/**
 *
 * @author ilari
 */
public class Personaje {
    private String nombreReal;
    private String superNombre;
    private boolean esHeroe;
    public static final int cantHabilidades=5;
    private Habilidad poderes[];
    public static final String atributos[] = new String[]{"vision nocturna","velocidad","fuerza","peso","altura","edad"};

    public String getNombreReal() {
        return nombreReal;
    }

    

    
    public String getSuperNombre() {
        return superNombre;
    }

    public boolean isEsHeroe() {
        return esHeroe;
    }

    public static String[] getAtributos() {
        return atributos;
    }
    
    public static int getCantHabilidades() {
        return cantHabilidades;
    }

    public Habilidad[] getPoderes() {
        return poderes;
    }

    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    public void setSuperNombre(String superNombre) {
        this.superNombre = superNombre;
    }

    public void setEsHeroe(boolean esHeroe) {
        this.esHeroe = esHeroe;
    }

    public void setPoderes() {
       for(int i=0;i<cantHabilidades;i++){
           
           this.poderes[i]=new Habilidad(this.getAtributos()[i],(int) (Math.random()*50+1));
       }
    }
    
    public String mostrarPoderes(){
        String poderes="";
        
        for(int i=0;i<this.getPoderes().length;i++){
            poderes=poderes+this.getPoderes()[i].getNombreHabilidad()+" "+this.getPoderes()[i].getNivelDeHabilidad()+" ";
        }
        return poderes;
    }
    
    public String toString(){
        return("Nombre "+this.getNombreReal()+" Super nombre "+this.getSuperNombre()+" Es heroe? "+this.isEsHeroe()+" Poderes "+this.mostrarPoderes());
    }
    
    public Personaje(String nombreReal, String superNomber, boolean esHeroe){
        this.setEsHeroe(esHeroe);
        this.setNombreReal(nombreReal);
        this.setSuperNombre(superNomber);
        this.poderes=new Habilidad[cantHabilidades];
        this.setPoderes();
    }
    
    
}
