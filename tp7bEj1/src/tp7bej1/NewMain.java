/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp7bej1;

/**
 *
 * @author ilari
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Archivo archivo1=new Archivo(15,"Archivo 1");
         Directorio dir=new Directorio("Dir 1");
         dir.addArchivo(archivo1);
         Directorio dir2=new Directorio("Dir 2");
         
         //System.out.println(dir);
         Comprimido comp=new Comprimido("Comp 1 ",0.5);
         comp.addArchivo(dir);
         
         Link link=new Link("Link 1",archivo1);
         dir2.addArchivo(link);
         comp.addArchivo(dir2);
         //System.out.println(dir2.toString());
         System.out.println(comp.toString());
    }
    
}
