/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8ej1;

/**
 *
 * @author ilari
 */
public class CondicionPagaronMas extends Condicion{

    int valor;
    
    public CondicionPagaronMas(int precio){
        valor=precio;
    }
    
    @Override
    public boolean cumple(Socio s) {
         return s.pagoMasDe(valor);
    }
    
}
