/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1;

/**
 *
 * @author ilari
 */
public class PuntoGeométrico {
    private int coorx;
    private int coory;
    
    public PuntoGeométrico(){
        this(0,0);
    }
    public PuntoGeométrico(int corx,int cory){
        this.coorx=corx;
        this.coory=cory;
    }

    public int getCoorx() {
        return coorx;
    }

    public int getCoory() {
        return coory;
    }

    public void setCoorx(int coorx) {
        this.coorx = coorx;
    }

    public void setCoory(int coory) {
        this.coory = coory;
    }
    public void desplazarPuntoGeo(int corx,int cory){
        this.setCoorx(this.coorx+corx);
        this.setCoory(this.coory+cory);
        
    }
    public String obtenerInformacion(){
        return (this.coorx+"-"+this.coory);
    }
    public double obtenerDistanciaEuclidea(PuntoGeométrico p2){
        return (Math.sqrt(((this.coorx-p2.coorx)*(this.coorx-p2.coorx))+((this.coory-p2.coory)*(this.coory-p2.coory))));
    }
    
    public PuntoGeométrico encontrarPuntoMenor(PuntoGeométrico p2){
        PuntoGeométrico menor=new PuntoGeométrico();
        if((this.getCoorx()<=p2.getCoorx())&&(this.getCoory()<=p2.getCoory())){
            menor=new PuntoGeométrico(this.getCoorx(),this.getCoory());
            
        }
        else{
            menor=new PuntoGeométrico(p2.getCoorx(),p2.getCoory());
        }
        return (menor);
    }
    public PuntoGeométrico encontrarPuntoAlaDerecha(PuntoGeométrico p2){
        PuntoGeométrico derecha=new PuntoGeométrico();
        if((this.getCoorx()>=p2.getCoorx())&&(this.getCoory()<=p2.getCoory())){
            derecha=new PuntoGeométrico(this.getCoorx(),this.getCoory());
            
        }
        else{
            derecha=new PuntoGeométrico(p2.getCoorx(),p2.getCoory());
        }
        return (derecha);
    }
    public PuntoGeométrico encontrarPuntoArriba(PuntoGeométrico p2){
        PuntoGeométrico arriba=new PuntoGeométrico();
        if((this.getCoorx()>=p2.getCoorx())&&(this.getCoory()<p2.getCoory())){
            arriba=new PuntoGeométrico(p2.getCoorx(),p2.getCoory());
            
        }
        else{
            arriba=new PuntoGeométrico(this.getCoorx(),this.getCoory());
        }
        return (arriba);
    }
}
