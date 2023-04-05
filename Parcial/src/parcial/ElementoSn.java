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
public abstract class ElementoSn {
    
    public abstract String getCategoria();
    
    public abstract  ArrayList<String> getPalabrasClave();
    
    public abstract ArrayList<Noticia> buscar(Condicion c);
}
