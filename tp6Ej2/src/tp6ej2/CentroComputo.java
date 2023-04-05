/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6ej2;

/**
 *
 * @author ilari
 */
public class CentroComputo {
    
    ColaOrdenada computadoras;
    ColaOrdenada procesos;
    
    public String toString(){
        return(computadoras.toString()+procesos.toString());
    }
    
    public void addComputadora(Computadora c){
        if(!procesos.isVacio()){
            Proceso p=(Proceso)procesos.siguiente();
            c.ejecutarProceso(p);
        }
        computadoras.agregar(c);
    }
    
    public void AddProceso(Proceso p){
        if(!computadoras.isVacio()){
            Computadora c=(Computadora)computadoras.siguiente();
            c.ejecutarProceso(p);
            computadoras.agregar(c);
        }
        else
        procesos.agregar(p);
    }
    
    public CentroComputo(){
        this.computadoras=new ColaOrdenada();
        this.procesos=new ColaOrdenada();
    }
    
    public static void main(String[] args) {
        CentroComputo master=new CentroComputo();
        Computadora c1=new Computadora("c1",10);
        Computadora c2=new Computadora("c2",20);
        Computadora c3=new Computadora("c3",15);
        Proceso p1=new Proceso("p1",100);
        Proceso p2=new Proceso("p2",75);
        Proceso p3=new Proceso("p3",50);
        master.AddProceso(p1);
        master.AddProceso(p2);
        master.AddProceso(p3);
        master.addComputadora(c1);
        master.addComputadora(c2);
        master.addComputadora(c3);
        
        
        System.out.println(master);
    }
}
