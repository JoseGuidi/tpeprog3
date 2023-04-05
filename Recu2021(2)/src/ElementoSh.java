
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ilari
 */
public abstract class ElementoSh {
    public abstract ArrayList<Habitacion> buscar(Condicion c,Criterio cri);
    public abstract int obtenerMetros();
    public abstract int contarEnbaseCondicion(Condicion c);
}
