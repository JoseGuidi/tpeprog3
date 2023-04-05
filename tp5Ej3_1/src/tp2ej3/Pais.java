/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2ej3;

/**
 *
 * @author ilari
 */
public class Pais {
    private String nombre;
    private int cantProvincias;
    private Provincia arregloProvincias[];

    public String getNombre() {
        return nombre;
    }

    public int getCantProvincias() {
        return cantProvincias;
    }

    public Provincia[] getArregloProvincias() {
        return arregloProvincias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantProvincias(int cantProvincias) {
        this.cantProvincias = cantProvincias;
    }

    public void setArregloProvincias(Provincia[] arregloProvincias) {
        this.arregloProvincias = arregloProvincias;
    }
    
    public Pais(){
        this("Argentina");
    }
    
    public Pais(String nombrePais){
        this(nombrePais,2);
    }
    
    public Pais(String nombre, int cantProvincias){
        this(nombre,cantProvincias,new Provincia());
    }
    
    public Pais(String nombre,int cantProvincias,Provincia p){
        this.nombre=nombre;
        this.cantProvincias=cantProvincias;
        this.arregloProvincias=new Provincia[cantProvincias];
        for(int i=0;i<this.getCantProvincias();i++){
            this.insertarProvincia();
        }
    }
    
    public void insertarProvincia(){
    boolean inserto=false;
        int i=0;
        int cant=this.getCantProvincias();
        while((inserto==false)&&(i<cant)){
            if(this.getArregloProvincias()[i]==null){
                this.getArregloProvincias()[i]=new Provincia();
                inserto=true;
            }
            i++;
        }
    }
    public void insertarProvincia(Provincia p,int pos){
    boolean inserto=false;
        int i=0;
        int cant=this.getCantProvincias();
        while((inserto==false)&&(i<cant)){
            if(i==pos){
                this.getArregloProvincias()[i]=p;
                inserto=true;
            }
            i++;
        }
    }
    
    
    public String obtenerInfoPais(){
        String devolver=("Nombre "+this.getNombre()+" Cant provincias "+this.getCantProvincias()+"/");
        for(int i=0;i<this.getCantProvincias();i++){
            devolver=devolver+this.getArregloProvincias()[i].obtenerInformacionProvincia();
        }
        return devolver;
    }
    
    public String provinciasConMuchoDeficit(){
        String provMuchaDeuda=" ";
        int temp;
        for(int i=0;i<this.getCantProvincias();i++){
            temp=this.getArregloProvincias()[i].cantCiudadesDeuda();
            if(temp>=((this.getArregloProvincias()[i].getCantCiudades())/2)){
                provMuchaDeuda=provMuchaDeuda+" "+this.getArregloProvincias()[i].getNombre()+",";
            }
        }
        return provMuchaDeuda;
    }
}
