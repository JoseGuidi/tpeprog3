/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

/**
 *
 * @author ilari
 */
public class Temporadas {
    private String nombre;
    private int cantidadEpisodios;
    private Episodio arrayEpisodios[];
    
    public Temporadas(){
        this(1);
    }
    public Temporadas(int NumEp){
        this("Nombre generico",NumEp);
    }
    public Temporadas(String nombre,int cantidadEpisodios){
        this.cantidadEpisodios=cantidadEpisodios;
        this.nombre=nombre;
        this.arrayEpisodios=new Episodio[cantidadEpisodios];
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadEpisodios() {
        return cantidadEpisodios;
    }

    public Episodio[] getArrayEpisodios() {
        return arrayEpisodios;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setCantidadEpisodios(int cantidadEpisodios) {
        this.cantidadEpisodios = cantidadEpisodios;
    }

    private void setArrayEpisodios(Episodio[] arrayEpisodios) {
        this.arrayEpisodios = arrayEpisodios;
    }
    
    private int getTamArrayEpisodios(){
        return((this.arrayEpisodios).length);
    }
    
    public String recuperarInformacionTemp(){
        return(this.getNombre()+" "+this.getCantidadEpisodios()+" "+this.getTamArrayEpisodios());
    }
    
    public Episodio contenidoArray(){
        return(this.arrayEpisodios[0]);
    }
    public void insertarEpisodio(Episodio ep){
        boolean inserto=false;
        for(int j=0;j<this.getCantidadEpisodios();j++){
            if((this.arrayEpisodios[j]==null)&&(inserto==false)){
                inserto=true;
                this.arrayEpisodios[j]=ep;
            }
            
        }
        
    }
    public void mostrarEpisodiosTemp(){
        for(int i=0;i<this.arrayEpisodios.length;i++){
            System.out.println(this.arrayEpisodios[i].getTitulo()+" "+this.arrayEpisodios[i].getDescripcion()+" "+this.arrayEpisodios[i].isVisto()+" "+this.arrayEpisodios[i].getNota());
        }
    }
    public int calcularEpisodiosVistos(){
        int epVistos=0;
        for(int i=0;i<this.getTamArrayEpisodios();i++){
            if((this.getArrayEpisodios()[i].isVisto())&&((this.getArrayEpisodios()[i].getNota()>0))){
                epVistos++;
            }
        }
        return epVistos;
    }
    public double calcularPromedioEpisodios(){
        double promedio=0;
        double epVistos=0;
        for(int i=0;i<this.getTamArrayEpisodios();i++){
            if((this.getArrayEpisodios()[i].getNota()>0)&&(this.getArrayEpisodios()[i].isVisto())){
                promedio=promedio+this.getArrayEpisodios()[i].getNota();
                
            }
        }
       epVistos=this.calcularEpisodiosVistos();
        return(promedio/epVistos);
    }
}
