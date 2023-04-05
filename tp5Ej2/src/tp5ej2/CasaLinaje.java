/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ej2;

/**
 *
 * @author ilari
 */
public class CasaLinaje extends Casa{
    
    
    public boolean cumpleCondAdicionales(Alumno al){
        boolean contiene=false;
        for (int i=0;i<al.getFamiliares().size();i++){
            if(this.getIntegrantes().contains(al.getFamiliares().get(i))){
                contiene=true;
            }
        }
        return contiene;
    }
    
    public CasaLinaje(String nombre,int cantmax){
        super(nombre,cantmax);
    }
}
