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
public class Destinos {
    int iddestino;
    int idempresa;
    int idlocalidad;
    String fecha;
    String hora;
    public Destinos(int iddes,int idemp,int idloca,String fe,String ho)
    {
        iddestino=iddes;
        idempresa=idemp;
        idlocalidad=idloca;
        fecha=fe;
        hora=ho;
    }
     public int get_iddestino(){
        return iddestino;
    }
     public void set_iddestino(int iddes){
         iddestino=iddes;
     }
     public int get_idempresa(){
        return idempresa;
    }
      public void set_idempresa(int idemp){
         idempresa=idemp;
     }
      public int get_idlocalidad(){
        return idlocalidad;
    }
       public void set_idlocalidad(int idloca){
         idlocalidad=idloca;
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
