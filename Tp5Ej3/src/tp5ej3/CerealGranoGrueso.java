/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ej3;

/**
 *
 * @author ilari
 */
public class CerealGranoGrueso extends Cereal{
    static String nombresGranoGrueso[] = {"girasol","Maiz"};
    
   
    
    public boolean comprobarNombre(String nombre){
        boolean tiene=false;
        for(int i=0;i<nombresGranoGrueso.length;i++){
            if(nombresGranoGrueso[i]==nombre){
                tiene=true;
            }
        }
        return tiene;
    }
    
    public CerealGranoGrueso(String nombre){
        super(nombre);
    }
}
