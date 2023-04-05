/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3ej3;

/**
 *
 * @author ilari
 */
public class Juego {
    private Personaje jug1;
    private Personaje jug2;
    private int puntosP1;
    private int puntosP2;

    public Personaje getJug1() {
        return jug1;
    }

    public Personaje getJug2() {
        return jug2;
    }

    public int getPuntosP1() {
        return puntosP1;
    }

    public int getPuntosP2() {
        return puntosP2;
    }

    public void setJug1(Personaje jug1) {
        this.jug1 = jug1;
    }

    public void setJug2(Personaje jug2) {
        this.jug2 = jug2;
    }

    public void setPuntosP1(int puntosP1) {
        this.puntosP1 = puntosP1;
    }

    public void setPuntosP2(int puntosP2) {
        this.puntosP2 = puntosP2;
    }
    
    public String jugar(){
        
        for(int i=0;i<this.getJug1().getPoderes().length;i++){
            if(this.getJug1().getPoderes()[i].getNivelDeHabilidad()>this.getJug2().getPoderes()[i].getNivelDeHabilidad()){
                this.setPuntosP1(this.getPuntosP1()+1);
            }
            else{
                this.setPuntosP2(this.getPuntosP2()+1);
            }
        }
        if(this.getPuntosP1()>this.getPuntosP2()){
            return ("ganador "+this.getJug1().toString()+" con cant de puntos "+this.getPuntosP1());
        }
        else if(this.getPuntosP1()<this.getPuntosP2()){
             return ("ganador "+this.getJug2().toString()+" con cant de puntos "+this.getPuntosP2());
        }
        else{
            return "empate";
        }
    }
    
    public Juego(Personaje jug1,Personaje jug2){
        this.setJug1(jug1);
        this.setJug2(jug2);
        this.setPuntosP1(0);
        this.setPuntosP2(0);
    }
}
