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
public class Localidad {
    int idlocalidad;
    String nomyap;
    public Localidad(){
    idlocalidad=-1;
    nomyap="";
    }
    public Localidad(int id,String nya)
    {
    idlocalidad=id;
    nomyap=nya;
    }
    public int get_idlocalidad()
    {
        return idlocalidad;
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
idlocalidad=id;
}
}
