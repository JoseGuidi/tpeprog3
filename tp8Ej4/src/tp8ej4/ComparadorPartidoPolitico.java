/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8ej4;

/**
 *
 * @author ilari
 */
public class ComparadorPartidoPolitico extends Comparador{

   
    
    @Override
    public int compare(Candidato o1, Candidato o2) {
        return o1.getPartido().compareTo(o2.getPartido());
    }

    
    
    
    
}
