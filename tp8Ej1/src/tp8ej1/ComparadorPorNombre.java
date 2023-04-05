/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8ej1;

import java.util.Comparator;

/**
 *
 * @author ilari
 */
public class ComparadorPorNombre implements Comparator<Socio>{

    @Override
    public int compare(Socio o1, Socio o2) {
      int result=o1.getApellido().compareTo(o2.getApellido());
      if(result==0){
          return o1.getNombre().compareTo(o2.getNombre());
      }
      else
          return result;
    }
    
}
