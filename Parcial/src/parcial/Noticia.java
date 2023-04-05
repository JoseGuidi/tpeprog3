/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class Noticia extends ElementoSn{

    String contenido;
    String titulo;
    String autor;
    String categoria;
    ArrayList<String>palabrasClave;

    public Noticia(String contenido, String titulo, String autor, String categoria) {
        this.contenido = contenido;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        palabrasClave=new ArrayList();
    }
    
    public boolean AutorIgual(String aut){
        return autor.equals(aut);
    }
    
    public boolean CategoriaIgual(String cat){
        return categoria.equals(cat);
    }
    
    public boolean contenidoContiene(String p){
        return contenido.contains(p);
    }
    
    public boolean tituloContiene(String t){
        return titulo.contains(t);
    }
    
    public void addPalabraClave(String pal){
        if(!palabrasClave.contains(pal))
            palabrasClave.add(pal);
    }
    
    @Override
    public String getCategoria() {
        return categoria;
    }

    @Override
    public ArrayList<String> getPalabrasClave() {
        return new ArrayList(palabrasClave);
    }

    @Override
    public ArrayList<Noticia> buscar(Condicion c) {
        ArrayList<Noticia>filtro=new ArrayList();
        if(c.cumple(this)){
            filtro.add(this);
        }
        return filtro;
    }
    
}
