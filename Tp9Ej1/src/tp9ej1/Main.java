/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp9ej1;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Noticia n=new Noticia("Noticia 1",new ArrayList(),"Esta es la intro a la noticia 1","Nico","Link 1","este es el texto de la noticia 1");
        Noticia n2=new Noticia("Noticia 2",new ArrayList(),"Esta es la intro a la noticia 2","Nico","Link 2","este es el texto de la noticia 2");
        CategoriaOseccion cat=new CategoriaOseccion("Categoria 1","Esta es la categoria 1","img 1");
        CategoriaOseccion cat2=new CategoriaOseccion("Categoria 2","Esta es la categoria 2","img 2");
        cat2.addElemento(n2);
        cat.addElemento(n);
        cat.addElemento(cat2);
        System.out.println(cat.obtenerMapa());
    }
    
}
