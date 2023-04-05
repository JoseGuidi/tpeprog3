/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

/**
 *
 * @author ilari
 */
public class Serie {
    private int temporadas;
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    private Temporadas arraytemp[];
    
    public Serie(int cantTemp){
        this(cantTemp,"Titulo de serie generico","Descripcion generica","Creador jorgito","genero risa");
    }
    
    public Serie(int temporadas,String titulo, String descripcion,String creador,String genero){
        this.creador=creador;
        this.descripcion=descripcion;
        this.genero=genero;
        this.temporadas=temporadas;
        this.titulo=titulo;
        this.arraytemp=new Temporadas[temporadas];
    }

    public Temporadas[] getArraytemp() {
        return arraytemp;
    }
    public void mostrarTemporadas(){
        int i=0;
        for(i=0;i<this.getArraytemp().length;i++){
            System.out.println(this.getArraytemp()[i].getNombre()+" "+this.getArraytemp()[i].getCantidadEpisodios());
        }
    }
    public int calcularEpvistosSerie(){
        int epVistos=0;
        for(int i=0;i<this.getArraytemp().length;i++){
            epVistos=epVistos+this.getArraytemp()[i].calcularEpisodiosVistos();
        }
        return epVistos;
    }
    public double calcularPromedioNotasSerie(){
        double promedio=0;
        for(int i=0;i<this.getArraytemp().length;i++){
            promedio=promedio+this.getArraytemp()[i].calcularPromedioEpisodios();
        }
        
        return(promedio/this.getArraytemp().length);
    }
    public boolean fueVistaPorCompleto(){
        boolean terminada=true;
        for(int i=0;i<this.getArraytemp().length;i++){
            if((this.getArraytemp()[i].calcularEpisodiosVistos())!=(this.getArraytemp()[i].getArrayEpisodios().length)){
                terminada=false;
            }
        }
        return(terminada);
    }
}
