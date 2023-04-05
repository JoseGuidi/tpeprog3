/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4ej2;

/**
 *
 * @author ilari
 */
public class AlarmaLuminosa extends Alarma{
    Luz wuz;

    public Luz getWuz() {
        return wuz;
    }

    public void setWuz(Luz wuz) {
        this.wuz = wuz;
    }
    
    
    public String comprobar(){
        String s="";
        s="Todo correcto";
        for(int i=0;i<this.getListaSensores().size();i++){
            if((this.getListaSensores().get(i).isSeAbrioAbertura()==true)||(this.getListaSensores().get(i).isSeDetectoMov()==true)||(this.getListaSensores().get(i).isSeRompioVidrio()==true)){
                if(s=="Todo correcto"){
                    s="Se vulnero en "+this.getListaSensores().get(i).getNombreLugar();
                    this.getTimbre().hacerSonar();
                    this.getWuz().encender();
                }
                else{
                    s=s+" Se vulnero en "+this.getListaSensores().get(i).getNombreLugar();
                    this.getTimbre().hacerSonar();
                    this.getWuz().encender();
                }
            } 
            else{
                
            }
        }
        return s;
    }
    
    public AlarmaLuminosa(){
        super();
        this.setWuz(new Luz());
    }
}
