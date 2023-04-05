/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1;

/**
 *
 * @author ilari
 */
public class Rectangulo {
    private PuntoGeométrico v1;
    private PuntoGeométrico v2;
    private PuntoGeométrico v3;
    private PuntoGeométrico v4;
    
    
    public Rectangulo(){
        this(new PuntoGeométrico(),new PuntoGeométrico(),new PuntoGeométrico(),new PuntoGeométrico());
    }
    public Rectangulo(PuntoGeométrico v1,PuntoGeométrico v2, PuntoGeométrico v3, PuntoGeométrico v4){
        this.v1=v1;
        this.v2=v2;
        this.v3=v3;
        this.v4=v4;
    }
    
    public String mostrarVertices(){
        return("v1 es "+this.v1.getCoorx()+" "+this.v1.getCoory()+"-"+"v2 es "+this.v2.getCoorx()+" "+this.v2.getCoory()+"-"+"v3 es "+this.v3.getCoorx()+" "+this.v3.getCoory()+"-"+"v4 es "+this.v4.getCoorx()+" "+this.v4.getCoory() );
    }
    public void desplazarEnElPlano(int despx,int despy){
        this.v1.desplazarPuntoGeo(despx, despy);
        this.v2.desplazarPuntoGeo(despx, despy);
        this.v3.desplazarPuntoGeo(despx, despy);
        this.v4.desplazarPuntoGeo(despx, despy);
    }
    public double calcularArea(){
        double mayor;
        double distancia1=this.v1.obtenerDistanciaEuclidea(v2);
        double distancia2=this.v1.obtenerDistanciaEuclidea(v3);
        double distancia3=this.v1.obtenerDistanciaEuclidea(v4);
        if(distancia1>=distancia2){
            mayor=distancia1;
            if(distancia1>=distancia3){
                
            }
            else{
                mayor=distancia3;
               
            }
        }
        else {
            mayor=distancia2;
            
            if(distancia2>=distancia3){
                
            }
            else{
                
                mayor=distancia3;
                
            }
        }
        System.out.println("Distancia mayor "+ mayor);
        if (mayor==distancia1){
            return (distancia2*distancia3);
        }
        else if(mayor==distancia2){
            return (distancia1*distancia3);
        }
        else {
            return(distancia1*distancia2);
        }
        
    }
    public double encontrarDistanciaSup(){
       PuntoGeométrico pmenor= new PuntoGeométrico();
       PuntoGeométrico pderecha= new PuntoGeométrico();
       pmenor=this.v3.encontrarPuntoMenor(this.v2.encontrarPuntoMenor(this.v4.encontrarPuntoMenor(this.v1)));
       pderecha=this.v2.encontrarPuntoAlaDerecha(this.v3.encontrarPuntoAlaDerecha(this.v4.encontrarPuntoAlaDerecha(this.v1)));
       return(pmenor.obtenerDistanciaEuclidea(pderecha));
    }
     public int esMayor(Rectangulo rect){
         double miArea=this.calcularArea();
         double areaIntroducida=rect.calcularArea();
         if (miArea>areaIntroducida){
             return (-1);
         }
         else if(miArea==areaIntroducida){
             return(0);
         }
         else{
             return 1;
         }
     }  
     public boolean compararCuadrado(){
       PuntoGeométrico pmenor= new PuntoGeométrico();
       PuntoGeométrico parriba= new PuntoGeométrico();
       PuntoGeométrico pderecha= new PuntoGeométrico();
       pmenor=this.v3.encontrarPuntoMenor(this.v2.encontrarPuntoMenor(this.v4.encontrarPuntoMenor(this.v1)));
       pderecha=this.v2.encontrarPuntoAlaDerecha(this.v3.encontrarPuntoAlaDerecha(this.v4.encontrarPuntoAlaDerecha(this.v1)));
       parriba=this.v2.encontrarPuntoArriba(this.v3.encontrarPuntoArriba(this.v4.encontrarPuntoArriba(this.v1)));
       return((pmenor.obtenerDistanciaEuclidea(pderecha)==pmenor.obtenerDistanciaEuclidea(parriba)));
     }
   public String comoEstaParado(){
       PuntoGeométrico pmenor= new PuntoGeométrico();
       PuntoGeométrico parriba= new PuntoGeométrico();
       PuntoGeométrico pderecha= new PuntoGeométrico();
       pmenor=this.v3.encontrarPuntoMenor(this.v2.encontrarPuntoMenor(this.v4.encontrarPuntoMenor(this.v1)));
       pderecha=this.v2.encontrarPuntoAlaDerecha(this.v3.encontrarPuntoAlaDerecha(this.v4.encontrarPuntoAlaDerecha(this.v1)));
       parriba=this.v2.encontrarPuntoArriba(this.v3.encontrarPuntoArriba(this.v4.encontrarPuntoArriba(this.v1)));
       if((pmenor.obtenerDistanciaEuclidea(pderecha))>=(pmenor.obtenerDistanciaEuclidea(parriba))){
           return("acostado");
       }
       else{
           return("parado");
       }
   }
}
