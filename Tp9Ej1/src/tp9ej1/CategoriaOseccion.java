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
public class CategoriaOseccion implements ElementoSitioNoticia{
    String nombre;
    String descripcion;
    String img;
    ArrayList<ElementoSitioNoticia>elementos;

    public CategoriaOseccion(String nombre, String descripcion, String img) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.img = img;
        elementos=new ArrayList();
    }
    
    public void addElemento(ElementoSitioNoticia e){
        elementos.add(e);
    }
    
    @Override
    public int obtenerCantidadNoticias() {
        int cantidad=0;
        for(ElementoSitioNoticia e:elementos){
            cantidad+=e.obtenerCantidadNoticias();
        }
        return cantidad;
    }
    
    public ArrayList<Noticia>buscarConCopia(Condicion c){
        ArrayList<Noticia>filtro=new ArrayList();
        filtro.addAll(this.buscar(c));
        return filtro;
    }

    @Override
    public ArrayList<Noticia> buscar(Condicion c) {
        ArrayList<Noticia>filtro=new ArrayList();
        for(ElementoSitioNoticia e:elementos){
            filtro.addAll(e.buscarConCopia(c));
        }
        return filtro;
    }

    @Override
    public ArrayList<String> obtenerMapa() {
        ArrayList<String>mapa=new ArrayList();
        String aux=this.nombre+"/";
        mapa.add(this.nombre);
        for(ElementoSitioNoticia e:elementos){
            for(String i:(e.obtenerMapa())){
                mapa.add(aux+i);
            }
        }
        return mapa;
    }
    
}
