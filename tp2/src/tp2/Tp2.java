/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

/**
 *
 * @author ilari
 */
public class Tp2 {
    public static Temporadas crearYagregarEpisodios(int i){
        Temporadas temp= new Temporadas(i);
        
        for(int j=0;j<i;j++){
            Episodio ep=new Episodio("Ep"+ j, j+"cap");
            temp.insertarEpisodio(ep);
        }
        return(temp);
    }
    public static Serie crearYagregarTemporadas(int i){
        Serie ser=new Serie(i);
        for(int j=0;j<i;j++){
            ser.getArraytemp()[j]=crearYagregarEpisodios(3);
        }
        return ser;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Serie ser=crearYagregarTemporadas(2);
        System.out.println(ser.fueVistaPorCompleto());
    }
    
}
