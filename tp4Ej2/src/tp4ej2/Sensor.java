/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4ej2;

/**
 *
 * @author ilari
 */
public class Sensor {
    private String nombreLugar;
    private boolean seDetectoMov;
    private boolean seRompioVidrio;
    private boolean seAbrioAbertura;

    public String getNombreLugar() {
        return nombreLugar;
    }

    public boolean isSeDetectoMov() {
        return seDetectoMov;
    }

    public boolean isSeRompioVidrio() {
        return seRompioVidrio;
    }

    public boolean isSeAbrioAbertura() {
        return seAbrioAbertura;
    }

    public void setNombreLugar(String nombreLugar) {
        this.nombreLugar = nombreLugar;
    }

    public void setSeDetectoMov(boolean seDetectoMov) {
        this.seDetectoMov = seDetectoMov;
    }

    public void setSeRompioVidrio(boolean seRompioVidrio) {
        this.seRompioVidrio = seRompioVidrio;
    }

    public void setSeAbrioAbertura(boolean seAbrioAbertura) {
        this.seAbrioAbertura = seAbrioAbertura;
    }
    
    public String toString(){
        return("NombreLugar "+this.getNombreLugar()+" Estados "+this.isSeAbrioAbertura()+"|"+this.isSeDetectoMov()+"|"+this.isSeRompioVidrio()+" | ");
    }
    
    public Sensor(String nombreLugar){
        this.setNombreLugar(nombreLugar);
        this.setSeAbrioAbertura(false);
        this.setSeDetectoMov(false);
        this.setSeRompioVidrio(false);
    }
    
}
