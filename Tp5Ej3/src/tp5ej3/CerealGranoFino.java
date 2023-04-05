/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ej3;

/**
 *
 * @author ilari
 */
public class CerealGranoFino extends Cereal{
    
    static String nombresGranoFino[] = {"Avena","Trigo"};
    
   
    
    public boolean comprobarNombre(String nombre){
        boolean tiene=false;
        for(int i=0;i<nombresGranoFino.length;i++){
            if(nombresGranoFino[i]==nombre){
                tiene=true;
            }
        }
        return tiene;
    }
    
    public CerealGranoFino(String nombre){
        super(nombre);
    }
    
}
