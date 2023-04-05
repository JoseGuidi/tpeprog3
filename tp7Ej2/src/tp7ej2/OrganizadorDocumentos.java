/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7ej2;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class OrganizadorDocumentos {
    ArrayList<Documento>documentos;
    
    public void addDocumento(Documento doc){
        documentos.add(doc);
    }
    
    public OrganizadorDocumentos(){
        documentos=new ArrayList<>();
    }
    
    public ArrayList<Documento>buscar(Condicion c){
        ArrayList<Documento>filtrado=new ArrayList<>();
        for(int i=0;i<documentos.size();i++){
           if(c.cumple(documentos.get(i))){
               filtrado.add(documentos.get(i));
           }
        } 
        return filtrado;
    }
    
    public static void main(String args[]){
       OrganizadorDocumentos org=new OrganizadorDocumentos();
       Documento d1=new Documento("Documento d1","");
       d1.addAutor("borges");
       d1.addAutor("manute");
       Documento d2=new Documento("Documento d2","Este es el texto del documento d2");
       d2.addAutor("churches");
       d2.addAutor("manute");
       org.addDocumento(d1);
       org.addDocumento(d2);
       d2.addpalabrasClave("ola");
       Condicion conda=new CondicionContenidoMayor20();
       System.out.println(org.buscar(conda));
    }
}
