/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

/**
 *
 * @author ilari
 */
public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean visto;
    private int nota;
    
     public Episodio(String titulo,String descripcion){
        this(titulo,descripcion,true,1);
    }
    
    public Episodio(String titulo,String descripcion,boolean visto, int nota){
        this.titulo=titulo;
        this.nota=nota;
        this.visto=visto;
        this.descripcion=descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isVisto() {
        return visto;
    }

    public int getNota() {
        return nota;
    }
    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    private void setVisto(boolean visto) {
        this.visto = visto;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    public String getInformacion(){
        return(this.getTitulo()+" "+this.getDescripcion()+" "+this.getNota()+" "+this.isVisto());
    }
    public void ingresarCalificacionEp(int cal){
        if((cal<=5)&&(cal>=1)){
            this.setNota(cal);
        }
        else{
            System.out.println("Poneme la nota bien porfa");
        }
    }

    
}
