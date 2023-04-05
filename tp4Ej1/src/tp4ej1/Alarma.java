/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4ej1;

/**
 *
 * @author ilari
 */
public class Alarma {
    private boolean seDetectoMov;
    private boolean seRompioVidrio;
    private boolean seAbrioAbertura;
    private Timbre timbre;

    public boolean isSeDetectoMov() {
        return seDetectoMov;
    }

    public boolean isSeRompioVidrio() {
        return seRompioVidrio;
    }

    public boolean isSeAbrioAbertura() {
        return seAbrioAbertura;
    }

    public void setSeDetectoMov(boolean seRompioVentana) {
        this.seDetectoMov = seRompioVentana;
    }

    public void setSeRompioVidrio(boolean seRompioVidrio) {
        this.seRompioVidrio = seRompioVidrio;
    }

    public void setSeAbrioAbertura(boolean seAbrioAbertura) {
        this.seAbrioAbertura = seAbrioAbertura;
    }

    public Timbre getTimbre() {
        return timbre;
    }
    
    
    
    public void comprobar(){
        if(this.isSeAbrioAbertura()||this.isSeDetectoMov()||this.isSeRompioVidrio()){
            this.getTimbre().hacerSonar();
        }
        
    }
    
    public Alarma(){
        this.setSeAbrioAbertura(false);
        this.setSeDetectoMov(false);
        this.setSeRompioVidrio(false);
        this.timbre=new Timbre();
    }
    
    
    
}
