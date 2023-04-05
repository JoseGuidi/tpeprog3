/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7bej2;

/**
 *
 * @author ilari
 */
public class Main {
    public static void main(String args[]){
        Envio paquete=new EnvioCartaPaquete(78,"Nico","chile 624","mercado libre","almacen mercado libre","tandil",true,10);
        Envio paquete2=new EnvioCartaPaquete(58,"manuel","amazonas 624","mercado libre","almacen mercado libre","tandil",true,20);
        Envio paquete3=new EnvioCartaPaquete(58,"ignacio","amazonas 624","mercado libre","almacen mercado libre","tandil",true,50);
        EnvioCombo enviocombo=new EnvioCombo();
        EnvioCombo enviocombo2=new EnvioCombo();
        //System.out.println(enviocombo2.getCiudad());
        enviocombo2.addEnvio(paquete3);
        enviocombo.addEnvio(paquete);
        enviocombo.addEnvio(paquete2);
        enviocombo.addEnvio(enviocombo2);
        System.out.println(enviocombo.getCiudad());
        System.out.println(enviocombo.toString());
        System.out.println(enviocombo.obtenerDestinatario());
    }
}
