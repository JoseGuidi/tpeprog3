/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4ej4;

import java.util.Date;

/**
 *
 * @author ilari
 */
public class Entrenador extends Persona{
    int idFederado;

    public void setIdFederado(int idFederado) {
        this.idFederado = idFederado;
    }

    public int getIdFederado() {
        return idFederado;
    }
    
    public String toString(){
        return(super.toString()+" ID federado "+this.getIdFederado());
    }
    
    public Entrenador(String nombre, String apellido, int numpas,int idFed){
        this(nombre,apellido,numpas,new Date(),new Estado(),idFed);
    }
    public Entrenador(String nombre, String apellido, int numpas,Date fechanac,Estado estado,int idFederado){
        super(nombre,apellido,numpas,fechanac,estado);
        this.setIdFederado(idFederado);
    }
}
