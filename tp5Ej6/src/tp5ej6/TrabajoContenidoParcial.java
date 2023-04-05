/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ej6;

/**
 *
 * @author ilari
 */
public class TrabajoContenidoParcial extends Trabajo{
    
    public boolean puedeEvaluar(Evaluador e){
        boolean aux=false;
        for(int i=0;i<this.getPalabrasClave().size();i++){
            if(e.getConocimientos().contains(this.getPalabrasClave().get(i))){
                aux=true;
            }
        }
        return aux;
    }
    
    public TrabajoContenidoParcial(String nombre){
        super(nombre);
    }
    
}
