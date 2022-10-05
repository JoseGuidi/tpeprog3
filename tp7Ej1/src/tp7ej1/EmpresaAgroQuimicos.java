/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7ej1;

import java.util.ArrayList;

/**
 *
 * @author ilari
 */
public class EmpresaAgroQuimicos {
    ArrayList<AgroQuimico>agroQuimicos;
    ArrayList<Cultivo>cultivos;
    ArrayList<Enfermedad>enfermedades;
    
    public void addAgroquimico(AgroQuimico a){
        agroQuimicos.add(a);
    }
    
    public void addCultivo(Cultivo c){
        cultivos.add(c);
    }
    
    public void addEnfermedad(Enfermedad e){
        enfermedades.add(e);
    }
    
    public EmpresaAgroQuimicos(){
        agroQuimicos=new ArrayList<>();
        cultivos=new ArrayList<>();
        enfermedades=new ArrayList<>();
    }
    
    public String toString(){
        return(agroQuimicos.toString()+"-"+cultivos.toString()+"-"+enfermedades.toString());
    }
    
    public ArrayList<AgroQuimico> buscar(Condicion c){
        ArrayList<AgroQuimico> filtrado=new ArrayList<>();
        for (int i=0;i<agroQuimicos.size();i++){
            if(c.cumple(agroQuimicos.get(i))){
                filtrado.add(agroQuimicos.get(i));
            }
        }
        return filtrado;
    }
    
    public static void main(String args[]){
        EmpresaAgroQuimicos empresa=new EmpresaAgroQuimicos();
        AgroQuimico pestisida=new AgroQuimico("Pestisida");
        AgroQuimico caca=new AgroQuimico("caca");
        Enfermedad cochinilla=new Enfermedad("cochinilla");
        Enfermedad malaria=new Enfermedad("cochinilla");
        cochinilla.addPatologia("hojas amarillas");
        cochinilla.addPatologia("olor a nalgas");
        malaria.addPatologia("hojas amarillas");
        malaria.addPatologia("olor a nalgas");
        
        Cultivo maiz2=new Cultivo("maiz");
        Cultivo maiz=new Cultivo("maiz");
        maiz.addEnfermedad(cochinilla);
        maiz2.addEnfermedad(malaria);
        pestisida.addPatologias("hojas amarillas");
        pestisida.addPatologias("olor a nalgas");
        caca.addPatologias("que se yo");
        caca.addPatologias("olor a nalgas");
        Condicion enfermedad=new CondicionEnfermedad(malaria);
        Condicion cultivo=new CondicionCultivo(maiz);
        Condicion doble=new CondicionDoble(enfermedad,cultivo);
        empresa.addAgroquimico(pestisida);
        empresa.addCultivo(maiz);
        empresa.addEnfermedad(cochinilla);
        empresa.addAgroquimico(caca);
        System.out.println(empresa.buscar(doble));
        
        /**System.out.println(maiz.puedeSerUtil(pestisida));**/
        System.out.println(empresa);
    }
}
