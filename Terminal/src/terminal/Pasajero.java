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
public class Pasajero {
    int idpasajero;
    String nomyap;
    int dni;
    public Pasajero(){
    dni=0;
    idpasajero=-1;
    nomyap="";
    }
    public Pasajero(int id,String nya,int doc)
    {
    idpasajero=id;
    nomyap=nya;
    dni=doc;
    }
    public int get_dni()
    {
        return dni;
    }
    public void set_dni(int doc)
    {
        dni=doc;
    }
    public int get_idpasajero()
    {
        return idpasajero;
    }
    public void set_nomyap(String nya){
   nomyap=nya;
    }
    public String get_nomyap()
    {
        return nomyap;
    }
    public void set_id(int id)
{
idpasajero=id;
}
}
