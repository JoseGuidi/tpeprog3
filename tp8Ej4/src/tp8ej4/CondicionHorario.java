/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8ej4;

import java.time.LocalDate;


/**
 *
 * @author ilari
 */
public class CondicionHorario extends Condicion{

    LocalDate fechaAntes;
    LocalDate fechaDespues;
    
    @Override
    public boolean cumple(Voto v) {
        return v.getHora().isBefore(fechaAntes)&&v.getHora().isAfter(fechaAntes);
    }
    
    public CondicionHorario(int horadesp,int horaantes){
        fechaAntes.atTime(horaantes, 0);
        fechaDespues.atTime(horadesp,0);
    }
    
}
