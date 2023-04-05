/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6ej1;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class VideoClubAutos {
    ArrayList<Cliente> clientes;
    ArrayList<Item> items;
    
    public ArrayList<Cliente> obtenerClientesAlquilerVencido(){
        ArrayList aux=new ArrayList<>();
        for(int i=0;i<this.clientes.size();i++){
            if(this.clientes.get(i).tengoAlgoVencido()){
                aux.add(this.clientes.get(i));
            }
        }
        return aux;
    }
    
    public ArrayList<Cliente> getClientes(){
        return (new ArrayList<>(clientes));
    }
    
    public ArrayList<Item> obtenerAlquileresCliente(Cliente c){
        return c.getItems();
    }
    
    public void addCliente(Cliente c){
        this.clientes.add(c);
    }
    
    public void addItem(Item c){
        this.items.add(c);
    }
    
    public VideoClubAutos(){
        this.items=new ArrayList<>();
        this.clientes=new ArrayList<>();
    }
}
