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
public abstract interface ElementoSitioNoticia {
    public abstract int obtenerCantidadNoticias();
    public abstract ArrayList<Noticia>buscarConCopia(Condicion c);
    public abstract ArrayList<Noticia>buscar(Condicion c);
    public abstract ArrayList<String>obtenerMapa();
}
