/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8ej3;

/**
 *
 * @author ilari
 */
public class Niño {
    Carta carta;
    Barrio bario;
    int dni;

    public Carta getCarta() {
        return carta;
    }

    public Barrio getBario() {
        return bario;
    }

    public int getDni() {
        return dni;
    }

    public String toString(){
        return "Carta "+carta.toString()+"Barrio"+bario.toString()+dni;
    }
    public void addRegalo(String r){
        carta.addRegalo(r);
    }
    
    @Override
    public boolean equals(Object o1){
        Niño niño2=(Niño)o1;
        return dni==niño2.getDni();
    }
    
    public Niño(Carta carta, Barrio bario, int dni) {
        this.carta = carta;
        this.bario = bario;
        this.dni = dni;
        carta.setRemitente(this);
    }
    
    public void introducirCarta(){
        bario.getBuzon().recibirCarta(carta);
    }
    
}
