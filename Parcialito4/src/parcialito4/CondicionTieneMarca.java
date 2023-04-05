/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialito4;

/**
 *
 * @author ilari
 */
public class CondicionTieneMarca extends Condicion{
    String marca;
    @Override
    public boolean cumple(Proveedor p) {
        return p.tengoMarca(marca);
    }
    public CondicionTieneMarca(String marca){
        this.marca=marca;
    }
}
