
import java.util.ArrayList;
import java.util.Collections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ilari
 */
public class Hotel extends ElementoSh{

    ArrayList<ElementoSh>elementos;
    
    public void addElemento(ElementoSh e){
        elementos.add(e);
    }
    
    public ArrayList<ElementoSh> getElementos(){
        return new ArrayList(elementos);
    }
    
    public Hotel(){
        elementos=new ArrayList();
    }
    
    @Override
    public ArrayList<Habitacion> buscar(Condicion c,Criterio cri) {
        ArrayList<Habitacion>habitaciones=new ArrayList();
        for(ElementoSh e:elementos)
            habitaciones.addAll(e.buscar(c,cri));
        Collections.sort(habitaciones,cri);
        return habitaciones;
    }

    @Override
    public int obtenerMetros() {
        int metros=0;
        for(ElementoSh e:elementos)
            metros+=e.obtenerMetros();
        return metros;
    }

    @Override
    public int contarEnbaseCondicion(Condicion c) {
        int cantidadquecumple=0;
        for(ElementoSh e:elementos)
            cantidadquecumple+=e.contarEnbaseCondicion(c);
        return cantidadquecumple;
    }
    
}
