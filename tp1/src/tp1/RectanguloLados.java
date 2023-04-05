/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1;

/**
 *
 * @author ilari
 */
public class RectanguloLados {
    private PuntoGeométrico v1;
    private double longitudY;
    private double longitudX;
    
    public RectanguloLados(){
        this(new PuntoGeométrico());
    }
    public RectanguloLados(PuntoGeométrico v1){
        this(new PuntoGeométrico(),1,2);
    }
    public RectanguloLados(PuntoGeométrico v1,double longitudX,double longitudY){
        this.longitudX=longitudX;
        this.longitudY=longitudY;
        this.v1=v1;
    }

    private PuntoGeométrico getV1() {
        return v1;
    }

    private double getLongitudY() {
        return longitudY;
    }

    private double getLongitudX() {
        return longitudX;
    }
    
    
    public RectanguloLados(PuntoGeométrico v1,PuntoGeométrico v2,PuntoGeométrico v3,PuntoGeométrico v4){
        this.v1=v1;
        this.longitudX=generarDistancia(v2);
        this.longitudY=generarDistancia(v3);
    }
    
    public double generarDistancia(PuntoGeométrico p){
        
        return (this.v1.obtenerDistanciaEuclidea(p));
    }
    public String obtenerInformacionRectangulo(){
        return(this.v1.obtenerInformacion()+"-"+this.longitudX+"-"+this.longitudY);
    }
    public void desplazarEnElPlano(int x,int y){
        this.v1.setCoorx((this.v1.getCoorx())+x);
        this.v1.setCoory((this.v1.getCoory())+y);
    }

    private void setV1(PuntoGeométrico v1) {
        this.v1 = v1;
    }

    private void setLongitudY(double longitudY) {
        this.longitudY = longitudY;
    }

    private void setLongitudX(double longitudX) {
        this.longitudX = longitudX;
    }
    
    public double calcularArea(){
        return(this.longitudX*this.longitudY);
    }
    public int compararMayor(RectanguloLados rect){
        if(this.calcularArea()>rect.calcularArea()){
            return(-1);
        }
        else if(this.calcularArea()==rect.calcularArea()){
            return 0;
        }
        else{
            return 1;
        }
    }
    public boolean esCuadrado(){
        return(this.longitudX==this.longitudY);
    }
    public double calcularLadoSuperior(){
        return(this.longitudX);
    }
    public String obtenerComoEstaParado(){
        if(this.longitudX>this.longitudY){
            return("acostado");
        }
        else{
            return("parado");
        }
    }
}
