/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp8ej2;

/**
 *
 * @author ilari
 */
public class Tp8Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Directorio dir=new Directorio("dir");
        ArchivoComprimido dir2=new ArchivoComprimido("dir2",0.5);
        Archivo ar=new Archivo("Arch 1",50);
        Archivo ar3=new Archivo("Arch 1",80);
        Archivo ar2=new Archivo("Arch 2",50);
        dir2.addElemento(ar2);
        dir.addElemento(dir2);
        dir.addElemento(ar3);
        dir.addElemento(ar);
        Condicion c=new CondicionNombre("Arch");
        //System.out.println(dir);
        Comparador c2=new ComparadorPorTamaño();
        Comparador c1=new ComparadorNombre();
        Comparador c4=new ComparadorNot(c1);
        Comparador c3=new ComparadorMultiple(c1,c4);
        System.out.println(dir.buscar(c,c4));
    }
    
}
