/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej3;

/**
 *
 * @author ilari
 */
public class RecursoExclusivo extends Recurso{

    boolean seEstaUsando;

    public RecursoExclusivo(String nombre) {
        super(nombre);
        this.seEstaUsando = false;
    }
   
    
    public void asignarRecurso(TareaTerminal t){
        t.addRecurso(this);
        this.seEstaUsando=true;
    }
    
    @Override
    public boolean estaDisponible() {
        return !seEstaUsando;
    }
    
}
