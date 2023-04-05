/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package copiadesecuencias;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

/**
 *
 * @author ilari
 */
public class CopiaDeSecuencias {
    public static void mostrararreglo(int [] arregloenteros){
        System.out.print("Arreglo de secuencias int\n|");
        for (int pos = 0; pos < max; pos++){
            System.out.print(arregloenteros[pos]+"|");
        }
        System.out.print("\n");
    }
    public static void cargararreglo(int [] arregloenteros){
        Random r=new Random();
        arregloenteros[0]=0;
        arregloenteros[max-1]=0;
        for(int i=1;i<max-1;i++){
            if(r.nextDouble()>probnum){
                arregloenteros[i]=(r.nextInt(maxval-minval+1)+minval);
            }
            else {
                arregloenteros[i]=0;
            }
        }
    }
    public static int pedirlongsec(){
        int longi;
        try{
            BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
        longi=Integer.valueOf(entrada.readLine());
        return longi;
        }
        catch(Exception e){
            return 0;
        }
    }
    public static void cargaren0(int [] arregloenteros){
        for(int i=0;i<=(max-1);i++){
            arregloenteros[i]=0;
        }
    }
    public static int copiarsec(int [] arregloenteros, int[] arreglocopia, int inicsec, int finsec,int ultposcopia){
        System.out.println("Entra a copias");
        System.out.println("Inic sec "+inicsec);
        System.out.println("fin sec "+finsec);
        for(int i=inicsec;i<finsec;i++){
            System.out.println("entra a for");
            arreglocopia[ultposcopia]=arregloenteros[i];
            ultposcopia++;
        }
        arreglocopia[ultposcopia]=0;
        ultposcopia++;
        return ultposcopia;
    }
    public static void buscarsec(int [] arregloenteros, int[] arreglocopia,int longsec){
        int inicsec,finsec,cantnum,ultposcopia;
        inicsec=0;
        finsec=0;
        cantnum=0;
        ultposcopia=1;
        for(int i=1;i<max-1;i++){
            if((arregloenteros[i-1]==0)&&(arregloenteros[i]!=0)){
                inicsec=i;
                int j=i;
                
                while((arregloenteros[j]!=0)&&(j<max-1)){
                    j++;
                    cantnum=cantnum+1;
                    finsec=j;
                }
                if(cantnum==longsec){
                    ultposcopia=copiarsec(arregloenteros,arreglocopia,inicsec,finsec,ultposcopia);
                }
                cantnum=0;
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static final int max=10;
    public static final int minval=1;
    public static final int maxval=9;
    public static final double probnum=0.4;
    public static void main(String[] args) {
        int [] arregloenteros,arreglocopia;
        int longsec;
        arreglocopia= new int[max];
        arregloenteros= new int[max];
        cargaren0(arreglocopia);
        cargararreglo(arregloenteros);
        mostrararreglo(arregloenteros);
        longsec=pedirlongsec();
        buscarsec(arregloenteros,arreglocopia,longsec);
        mostrararreglo(arregloenteros);
        mostrararreglo(arreglocopia);
    }
    
}
