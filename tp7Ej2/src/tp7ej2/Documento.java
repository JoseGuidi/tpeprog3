package tp7ej2;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ilari
 */
public class Documento {
    String titulo;
    ArrayList<String>autores;
    String contenidoTextual;
    ArrayList<String>palabrasClave;
    
    public void addAutor(String autor){
        autores.add(autor);
    }
    
    public void addpalabrasClave(String palabra){
        palabrasClave.add(palabra);
    }

    public String getTitulo() {
        return titulo;
    }

    public ArrayList<String> getAutores() {
        return new ArrayList<>(autores);
    }

    public String getContenidoTextual() {
        return contenidoTextual;
    }

    public ArrayList<String> getPalabrasClave() {
        return new ArrayList<>(palabrasClave);
    }

    public String toString(){
        return (titulo+"-"+autores.toString()+"-"+contenidoTextual+"-"+palabrasClave.toString());
    }
    
    public boolean contieneAutor(String autor){
        return autores.contains(autor);
    }
    
    public boolean tituloContienePalabra(String palabra){
        return titulo.contains(palabra);
    }
    
    public boolean contenidoTieneCantCaracteres(){
        return contenidoTextual.length()>=20;
    }
    
    public boolean contienePalabraClave(String palabra){
        return palabrasClave.contains(palabra);
    }
    
    public boolean contenidoTieneFrase(String frase){
        return contenidoTextual.contains(frase);
    }
    
    public boolean tienePalabrasClave(){
        return palabrasClave.isEmpty();
    }
    
    public boolean tituloEsIgual(String titulo){
        return (titulo.equals(this.titulo));
    }
    
    public Documento(String titulo,String contenido){
        this.contenidoTextual=contenido;
        this.titulo=titulo;
        autores=new ArrayList<>();
        palabrasClave=new ArrayList<>();
    }
    
}
