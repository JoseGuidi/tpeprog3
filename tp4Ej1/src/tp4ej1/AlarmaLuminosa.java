/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4ej1;

/**
 *
 * @author ilari
 */
public class AlarmaLuminosa extends Alarma{
    private Luz wuz;

    public Luz getWuz() {
        return wuz;
    }

    public void setWuz(Luz wuz) {
        this.wuz = wuz;
    }
    
    public AlarmaLuminosa(){
        super();
        this.setWuz(new Luz());
    }
    
    public void comprobar(){
        this.getTimbre().hacerSonar();
        this.getWuz().encender();
    }
}
