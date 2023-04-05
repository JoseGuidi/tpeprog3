/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej1;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class Noticia implements ElementoSitioNoticia{

    String titulo;
    ArrayList<String>listadoPalabras;
    String introduccionAlTexto;
    String texto;
    String autor;
    String link;

    public Noticia(String titulo, ArrayList<String> listadoPalabras, String introduccionAlTexto, String autor, String link,String texto) {
        this.titulo = titulo;
        this.listadoPalabras = new ArrayList(listadoPalabras);
        this.introduccionAlTexto = introduccionAlTexto;
        this.texto=texto;
        this.autor = autor;
        this.link = link;
    }

    
    
    public String getTitulo() {
        return titulo;
    }

    public ArrayList<String> getListadoPalabras() {
        return new ArrayList(listadoPalabras);
    }

    public String getIntroduccionAlTexto() {
        return introduccionAlTexto;
    }

    public String getAutor() {
        return autor;
    }

    public String getLink() {
        return link;
    }

    public String getTexto() {
        return texto;
    }
    
    
    
    @Override
    public int obtenerCantidadNoticias() {
        return 1;
    }

    @Override
    public ArrayList<Noticia> buscarConCopia(Condicion c) {
        ArrayList<Noticia>copia=new ArrayList();
        if(c.cumple(this)){
            copia.add(new Noticia(this.getTitulo(),this.getListadoPalabras(),this.getIntroduccionAlTexto(),this.getAutor(),this.getLink(),this.getTexto()));
        }
        return copia;
    }

    @Override
    public ArrayList<Noticia> buscar(Condicion c) {
        ArrayList<Noticia>filtro=new ArrayList();
        if(c.cumple(this)){
            filtro.add(this);
        }
        return filtro;
    }

    @Override
    public ArrayList<String> obtenerMapa() {
        ArrayList<String> mapa=new ArrayList();
        mapa.add(this.getLink());
        return mapa;
    }
    
}
