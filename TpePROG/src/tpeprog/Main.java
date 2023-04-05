/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tpeprog;

import java.util.Iterator;

/**
 *
 * @author ilari
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        
        //pruebas pedidas en el tpe
        //A
        Criterio numeros=new CriterioNumerico();
        ListaEnlazada a=new ListaEnlazada(numeros);
        Integer diez=10;
        Integer ventiuno=21;
        Integer uno=1;
        Integer cinco=5;
        Integer once=11;
        a.insertarNodo(diez);
        a.insertarNodo(ventiuno);
        a.insertarNodo(uno);
        a.insertarNodo(cinco);
        a.insertarNodo(once);
        //B
        
        for(Nodo n:a){
            System.out.println(n.obtenerValor());
        }
        System.out.println("fin");
        //C
        a.borrarNodo(0);
        a.borrarNodo(cinco);
        a.borrarNodo(once);
        
        for(Nodo n:a){
            System.out.println(n.obtenerValor());
        }
        System.out.println("fin");
        //D
        Criterio texto=new CriterioString();
        String recu="Recuperatorio";
        String facil="Fácil";
        String es="Es";
        String parcial="Parcial";
        String prog="Prog 2";
        ListaEnlazada d=new ListaEnlazada(texto);
        d.insertarNodo(facil);
        d.insertarNodo(es);
        d.insertarNodo(parcial);
        d.insertarNodo(prog);
        //E
        for(Nodo n:d){
            System.out.println(n.obtenerValor());
        }
        System.out.println("fin");
        //personalmente me gusta usar más el toString que hice, se ve mejor
        System.out.println(d);
        System.out.println("fin");
        //F
        System.out.println("posicion parcial "+d.obtenerPosicion(parcial));
        System.out.println("fin");
        //G
        System.out.println("Posicion recu "+d.obtenerPosicion(recu));
        System.out.println("fin");
        //H
        Criterio textoInverso=new CriterioNegado(texto);
        d.cambiarOrden(textoInverso);
        System.out.println(d);
        System.out.println("fin");
        //I
        Criterio cantAl=new CriterioCantidadAlumnos();
        Criterio ordenLlegada=new CriterioOrdenLlegada();
        ListaEnlazada i=new ListaEnlazada(cantAl);
        Alumno federico=new Alumno("Federico","Lopez",35999888,20);
        federico.addPalabra("redes");
        federico.addPalabra("php");
        federico.addPalabra("java");
        federico.addPalabra("python");
        Alumno juana=new Alumno("Juana","Garcia",27123455,19);
        juana.addPalabra("programacion");
        juana.addPalabra("php");
        juana.addPalabra("java");
        Grupo exa=new Grupo("Exactas");
        exa.addElemento(juana);
        exa.addElemento(federico);
        Grupo historia=new Grupo("Historia");
        Alumno fiora=new Alumno("Fiora","Rivas",34555111,21);
        fiora.addPalabra("historia");
        fiora.addPalabra("antigua");
        Alumno martin=new Alumno("Martin","Gómez",34111222,21);
        martin.addPalabra("romanos");
        martin.addPalabra("egipcios");
        martin.addPalabra("griegos");
        Alumno roman=new Alumno("Roman","Bazán",32555111,18);
        roman.addPalabra("argentina");
        historia.addElemento(martin);
        historia.addElemento(fiora);
        historia.addElemento(roman);
        Grupo humanas=new Grupo("Humanas");
        humanas.addElemento(historia);
        Alumno mora=new Alumno("Mora","Diaz",37124425,25);
        mora.addPalabra("psicologia");
        mora.addPalabra("freud");
        humanas.addElemento(mora);
        Alumno john=new Alumno("John","Doe",12000000,99);
        john.addPalabra("Ser un meme en el mundo de la programación");
        Grupo unicen=new Grupo("Unicen");
        unicen.addElemento(john);
        unicen.addElemento(humanas);
        unicen.addElemento(exa);
        Grupo olimpiadas=new Grupo("Olimpiadas");
        Grupo matea2=new Grupo("Matea2");
        Alumno juan=new Alumno("Juan","Alvarez",33222444,23);
        juan.addPalabra("sucesiones");
        juan.addPalabra("algebra");
        Alumno julio=new Alumno("Julio","Cesar",333222111,2122);
        julio.addPalabra("sucesiones");
        julio.addPalabra("algebra");
        matea2.addElemento(julio);
        matea2.addElemento(juan);
        Grupo losfibo=new Grupo("Los fibo");
        Alumno newton=new Alumno("Isaac","Newton",12343565,379);
        newton.addPalabra("sucesiones");
        Alumno paso=new Alumno("Juan","José paso",333322211,169);
        paso.addPalabra("sucesiones");
        Alumno rivas=new Alumno("Bernardino","Rivas",30987654,65);
        rivas.addPalabra("matematicas");
        losfibo.addElemento(newton);
        losfibo.addElemento(paso);
        losfibo.addElemento(rivas);
        olimpiadas.addElemento(losfibo);
        olimpiadas.addElemento(matea2);
        i.insertarNodo(unicen);
        i.insertarNodo(olimpiadas);
        System.out.println(i);//mucho texto por toda la informacion del toString
        for(Nodo n:i){//agarro cada nodo y los muestro en el orden que estan insertados
            ElementoU auxi=(ElementoU)n.obtenerValor();
            System.out.println(auxi.getNombre());//se muestra en orden por cant alumnos
        }
           
    }
    
}
