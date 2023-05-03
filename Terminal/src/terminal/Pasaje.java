/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terminal;

/**
 *
 * @author PC
 */
public class Pasaje {
    int idpasaje;
    int idpasajero;
    int iddestino;
    String fecha;
    String hora;
    public Pasaje(int idpas,int idpasaj,int iddes,String fe,String ho)
    {
        idpasaje=idpas;
        idpasajero=idpasaj;
        iddestino=iddes;
        fecha=fe;
        hora=ho;
    }
    public int get_idpasaje(){
        return idpasaje;
    }
    public void set_idpasaje(int id){
        idpasaje=id;
    }
     public int get_idpasajero(){
        return idpasajero;
    }
         public void set_idpasajero(int id){
        idpasajero=id;
    }
      public int get_iddestino(){
        return iddestino;
    }
      public void set_iddestino(int id){
        iddestino=id;
    }
       public String get_fecha(){
        return fecha;
    }
       public void set_fecha(String fe){
        fecha=fe;
    }
        public String get_hora(){
        return hora;
    }
        public void set_hora(String ho){
        hora=ho;
        }
}
