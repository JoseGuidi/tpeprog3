/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialito4;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class CasaComputacion {
    ArrayList<Producto>productos;
    ArrayList<Cliente>clientes;
    ArrayList<Proveedor>proveedores;
    ArrayList<Empleado>empleados;
    
    
    public CasaComputacion(){
        this.empleados=new ArrayList();
        this.clientes=new ArrayList();
        this.productos=new ArrayList();
        this.proveedores=new ArrayList();
    }
    
    public void addEmpleado(Empleado emp){
        empleados.add(emp);
    }
    
    public void addCliente(Cliente cli){
        clientes.add(cli);
    }
    
    public void addProducto(Producto prod){
        productos.add(prod);
    }
    
    public ArrayList<Proveedor> getProveedores(){
        return new ArrayList(proveedores);
    }
    
    public void addProveedor(Proveedor prov){
        proveedores.add(prov);
    }
    
    public ArrayList<Proveedor> buscarProveedores(Condicion c){
        ArrayList<Proveedor> filtrados=new ArrayList();
        for(Proveedor p:proveedores){
            if(c.cumple(p))
                filtrados.add(p);
        }
        return filtrados;
    }
    
    public static void main(String [] args){
        CasaComputacion dexterlabs=new CasaComputacion();
        Proveedor mdpcomputacion=new Proveedor("MDPcomputacion","5555",2000);
        mdpcomputacion.addMarca("Xiaomi");
        Proveedor necocomputacion=new Proveedor("NECOcomputacion","5225",45001);
        necocomputacion.addMarca("Alcatel");
        dexterlabs.addProveedor(mdpcomputacion);
        dexterlabs.addProveedor(necocomputacion);
        Condicion cNombre=new CondicionNombre("MDPcomputacion");
        Condicion cDeuda=new CondicionDeudaMayor(45000);
        Condicion cMarca=new CondicionTieneMarca("Xiaomi");
        System.out.println(dexterlabs.getProveedores());
        System.out.println(dexterlabs.buscarProveedores(cMarca));
    }
    
}
