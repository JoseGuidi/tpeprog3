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
public class NoticiaPatrocinada extends Noticia{
    public NoticiaPatrocinada(String contenido,String titulo,String autor,String categoria){
        super(contenido,titulo,autor,categoria);
    }
    
    @Override
    public ArrayList<Noticia> buscar(Condicion c){
        ArrayList<Noticia>filtro=new ArrayList();
        filtro.add(this);
        return filtro;
    }
}
