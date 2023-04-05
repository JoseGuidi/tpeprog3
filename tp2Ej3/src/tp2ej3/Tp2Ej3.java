/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2ej3;

/**
 *
 * @author ilari
 */
public class Tp2Ej3 {

    /**
     * @param args the command line arguments
     */
    
    public static void mostrarImpuestos(Imp i1,Imp i2,Imp i3,Imp i4,Imp i5){
        System.out.println(i1.obtenerInfo());
        System.out.println(i2.obtenerInfo());
        System.out.println(i3.obtenerInfo());
        System.out.println(i4.obtenerInfo());
        System.out.println(i5.obtenerInfo());
    }
    public static void mostrarImpuestos(Imp i1){
        System.out.println(i1.obtenerInfo());
        
    }
    
    public static void main(String[] args) {
        Imp imp1=new Imp("imp1",10);
        Imp imp2=new Imp("imp2",20);
        Imp imp3=new Imp("imp2",30);
        Imp imp4=new Imp("imp2",40);
        Imp imp5=new Imp("imp5",50);
        
        Pais arg=new Pais();
        arg.getArregloProvincias()[0].setNombre("Tucuman");
        arg.getArregloProvincias()[0].getArregloCiudades()[0].setNombre("Capital de tucuman");
        arg.getArregloProvincias()[0].getArregloCiudades()[0].setGastos(10000000);
        arg.getArregloProvincias()[0].getArregloCiudades()[0].setHabitantes(100);
        arg.getArregloProvincias()[0].getArregloCiudades()[1].setNombre("Tilcara");
        arg.getArregloProvincias()[0].getArregloCiudades()[1].setHabitantes(200);
        arg.getArregloProvincias()[0].getArregloCiudades()[2].setNombre("Casita tucuman");
        arg.getArregloProvincias()[0].getArregloCiudades()[2].setHabitantes(10);
        arg.getArregloProvincias()[1].setNombre("Prov de bs as");
        arg.getArregloProvincias()[1].getArregloCiudades()[0].setNombre("BA");
        arg.getArregloProvincias()[1].getArregloCiudades()[0].setGastos(999999999);
        arg.getArregloProvincias()[1].getArregloCiudades()[0].setHabitantes(1000);
        arg.getArregloProvincias()[1].getArregloCiudades()[1].setNombre("daireaux");
        arg.getArregloProvincias()[1].getArregloCiudades()[1].setHabitantes(200);
        arg.getArregloProvincias()[1].getArregloCiudades()[2].setNombre("arboledas");
        arg.getArregloProvincias()[1].getArregloCiudades()[2].setHabitantes(10);
        //System.out.println(arg.getArregloProvincias()[0].getArregloCiudades()[0].obtenerInfoCiudad());
        System.out.println(arg.getArregloProvincias()[0].cualesCiudadesGastanMas());
        System.out.println(arg.provinciasConMuchoDeficit());
        
    }
    
}
